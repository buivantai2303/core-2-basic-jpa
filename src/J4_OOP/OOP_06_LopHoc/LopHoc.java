package J4_OOP.OOP_06_LopHoc;

import java.util.Scanner;

public class LopHoc {
    private int MaLop, SiSo;
    private String TenLop, DiaChi, GVCN;

    public int getMaLop() {
        return MaLop;
    }

    public void setMaLop(int maLop) {
        MaLop = maLop;
    }

    public int getSiSo() {
        return SiSo;
    }

    public void setSiSo(int siSo) {
        SiSo = siSo;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getGVCN() {
        return GVCN;
    }

    public void setGVCN(String GVCN) {
        this.GVCN = GVCN;
    }

    public LopHoc(int maLop, int siSo, String tenLop, String diaChi, String gvcn) {
        MaLop = maLop;
        SiSo = siSo;
        TenLop = tenLop;
        DiaChi = diaChi;
        GVCN = gvcn;
    }

    public LopHoc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã lớp: ");
        MaLop = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tên lớp: ");
        TenLop = scanner.nextLine();

        System.out.print("Nhập sĩ số: ");
        SiSo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        DiaChi = scanner.nextLine();

        System.out.print("Nhập tên GVCN: ");
        GVCN = scanner.nextLine();

    }
    public void InThongTin() {
        System.out.println("Lớp: " + getTenLop() + ", có mã lớp: " + getMaLop() + " ở địa chỉ: " + getDiaChi());
        System.out.println("Lớp có: " + getSiSo() + " học sinh và có GVCN là: " + getGVCN());
    }
}
