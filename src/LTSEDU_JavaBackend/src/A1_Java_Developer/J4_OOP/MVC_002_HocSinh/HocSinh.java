package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.MVC_002_HocSinh;

import java.time.LocalDate;

public class HocSinh {
    private int MaHS;
    private String TenHS;
    private LocalDate NgaySinh;

    public int getMaHS() {
        return MaHS;
    }

    public void setMaHS(int maHS) {
        MaHS = maHS;
    }

    public String getTenHS() {
        return TenHS;
    }

    public void setTenHS(String tenHS) {
        TenHS = tenHS;
    }

    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public HocSinh(int maHS, String tenHS, LocalDate ngaySinh) {
        MaHS = maHS;
        TenHS = tenHS;
        NgaySinh = ngaySinh;
    }

    public HocSinh() {
        setMaHS(MVC_002_InputHelper.IntHelper("Nhập mã học sinh: ", "Nhập sai mã học sinh"));
        setTenHS(MVC_002_InputHelper.StringHelper("Nhập tên học sinh: ", "Nhập sai tên học sinh"));
        setNgaySinh(MVC_002_InputHelper.LocalDateHelper("Nhập ngày tháng năm sinh (dd/MM/YYYY): ", "Nhập sai ngày sinh."));
    }
}
