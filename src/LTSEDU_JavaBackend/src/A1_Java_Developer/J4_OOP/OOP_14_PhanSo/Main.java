package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_14_PhanSo;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo();

        ps1.InThongTin();
        ps2.InThongTin();

        System.out.println(ps1 + " + " + ps2 + " = " + ps1.ToiGianPhanSo(ps1.Cong(ps2)));
        System.out.println(ps1 + " - " + ps2 + " = " + ps1.ToiGianPhanSo(ps1.Tru(ps2)));

    }
}
