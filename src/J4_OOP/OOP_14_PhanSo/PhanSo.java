package J4_OOP.OOP_14_PhanSo;

import java.util.Scanner;

public class PhanSo {
    private int tuSo, mauSo;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo (int tuSo, int mauSo){
        setTuSo(tuSo);
        setMauSo(mauSo);
    }

    public PhanSo Cong (PhanSo n){
        if (mauSo == n.getMauSo()) {
            return new PhanSo(tuSo + n.getTuSo(), n.getMauSo());
        }
        return new PhanSo((tuSo * n.getMauSo()) + (n.getTuSo() * mauSo), n.getMauSo() * mauSo);
    }

    public PhanSo Tru (PhanSo n){
        if (mauSo == n.getMauSo()) {
            return new PhanSo(tuSo - n.getTuSo(), n.getMauSo());
        }
        return new PhanSo((tuSo * n.getMauSo()) - (n.getTuSo() * mauSo), n.getMauSo() * mauSo);
    }

    public PhanSo ToiGianPhanSo (PhanSo n){
        int UCLN = 1;
        if (n.getTuSo() > 0 && n.getMauSo() > 0) {
            int smallerValue = Math.min(n.getTuSo(), n.getMauSo());

            for (int i = 2; i <= smallerValue; i++) {
                if (n.getTuSo() % i == 0 && n.getMauSo() % i == 0) {
                    UCLN = i;
                }
            }
        }
        if (UCLN > 1) {
            return new PhanSo((n.getTuSo() / UCLN), (n.getMauSo() / UCLN));
        } else {
            return n;
        }
    }

    private final Scanner scanner = new Scanner(System.in);
    public PhanSo (){
        System.out.print("Enter the numerator: ");
        setTuSo(scanner.nextInt());
        System.out.print("Enter the denominator: ");
        setMauSo(scanner.nextInt());
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }

    public void InThongTin() {
        System.out.println("Phan so: " + getTuSo() + "/" + getMauSo());
    }
}
