package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_13_SoNguyen;

import java.util.Scanner;

public class SoNguyen {
    private int giaTri;
    private Boolean LaSoChan, LaNguyenTo, LaSoDoiXung;

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
        LaSoChan = KiemTraChan();
        LaNguyenTo = KiemTraNguyenTo();
        LaSoDoiXung = KiemTraDoiXung();
    }

    public Boolean getLaSoChan() {
        return LaSoChan;
    }

    public Boolean getLaNguyenTo() {
        return LaNguyenTo;
    }

    public Boolean getLaSoDoiXung() {
        return LaSoDoiXung;
    }

    private Boolean KiemTraChan(){
        return giaTri % 2 == 0;
    }

    public Boolean KiemTraDoiXung() {
        int n = giaTri;
        int reverse = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        return n == reverse;
    }

    public Boolean KiemTraNguyenTo (){
        if (giaTri < 2) return false;

        for (int i = 2; i <= Math.sqrt(giaTri); i+=2) {
            if (giaTri % i == 0) {
                return false;
            }
        }

        return true;
    }

    private Scanner scanner = new Scanner(System.in);
    public SoNguyen(){
        setGiaTri(NhapSo("Enter your value: ", "Wrong value input, enter agann!"));
    }
    public SoNguyen(int n){
        setGiaTri(n);
    }
    public SoNguyen Cong (SoNguyen n){
        return new SoNguyen(giaTri + n.getGiaTri());
    }

    public void InThongTin(){
        System.out.println("So " + giaTri + " " + LaSoChan + " la so chan, " + LaNguyenTo + " la nguyen to, " +  LaSoDoiXung + " la doi xung");
    }

    private int NhapSo(String msgNhap, String msgErr){
        boolean ok = false;
        int so = 0;
        do{
            try {
                System.out.print(msgNhap);
                so = scanner.nextInt();
                ok = true;
            } catch (Exception e){
                System.out.println(msgErr);
                scanner.nextLine();
            }
        } while (!ok);

        return so;
    }
}
