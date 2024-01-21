package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_13_SoNguyen;

import java.util.Scanner;

public class SoNguyen {
    private int GiaTri;
    private boolean LaSoChan, LaNguyenTo, LaSoDoiXung;

    public int getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(int giaTri) {
        GiaTri = giaTri;
    }

    public boolean isLaSoChan() {
        KiemTraChan();
        return LaSoChan;
    }

    public void setLaSoChan(boolean laSoChan) {
        LaSoChan = laSoChan;
    }

    public boolean isLaNguyenTo() {
        KiemTraNguyenTo();
        return LaNguyenTo;
    }

    public void setLaNguyenTo(boolean laNguyenTo) {
        LaNguyenTo = laNguyenTo;
    }

    public boolean isLaSoDoiXung() {
        KiemTraDoiXung();
        return LaSoDoiXung;
    }

    public void setLaSoDoiXung(boolean laSoDoiXung) {
        LaSoDoiXung = laSoDoiXung;
    }

    public void KiemTraChan(){
        LaSoChan = GiaTri % 2 == 0;
    }

    public void KiemTraDoiXung() {
        int n = GiaTri;
        int reverse = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        LaSoDoiXung = (n == reverse);
    }

    public void KiemTraNguyenTo (){
        LaNguyenTo = (GiaTri > 1) && (GiaTri % 2 != 0);
        for (int i = 3; i <= Math.sqrt(GiaTri); i += 2) {
            if (GiaTri % i == 0) {
                LaNguyenTo = false;
                break;
            }
        }
    }

    public SoNguyen(int giaTri, boolean laSoChan, boolean laNguyenTo, boolean laSoDoiXung) {
        GiaTri = giaTri;
        LaSoChan = laSoChan;
        LaNguyenTo = laNguyenTo;
        LaSoDoiXung = laSoDoiXung;
    }

    public SoNguyen(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value: ");
        GiaTri = scanner.nextInt();

    }
}
