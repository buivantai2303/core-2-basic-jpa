package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_08_HocSinh;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClassHocSinh {
    private String HoTen, Lop;
    private LocalDate NgaySinh;
    private double DiemToan, DiemVan, DiemAnh, DiemTrungBinh;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public double getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(double diemToan) {
        DiemToan = diemToan;
    }

    public double getDiemVan() {
        return DiemVan;
    }

    public void setDiemVan(double diemVan) {
        DiemVan = diemVan;
    }

    public double getDiemAnh() {
        return DiemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        DiemAnh = diemAnh;
    }

    public double getDiemTrungBinh() {
        return DiemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        DiemTrungBinh = diemTrungBinh;
    }

    public ClassHocSinh(String hoTen, String lop, LocalDate ngaySinh, double diemToan, double diemVan, double diemAnh, double diemTrungBinh) {
        HoTen = hoTen;
        Lop = lop;
        NgaySinh = ngaySinh;
        DiemToan = diemToan;
        DiemVan = diemVan;
        DiemAnh = diemAnh;
        DiemTrungBinh = diemTrungBinh;
    }

    public ClassHocSinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên học sinh: ");
        setHoTen(scanner.nextLine());

        System.out.print("Nhập tên lớp: ");
        setLop(scanner.nextLine());

        System.out.print("Nhập ngày sinh: ");
        setNgaySinh(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.print("Nhập điểm Toán: ");
        setDiemToan(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Nhập điểm Văn: ");
        setDiemVan(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Nhập nhập điểm Anh: ");
        setDiemAnh(scanner.nextDouble());
    }

    public void TinhDiemTrungBinh() {
        DiemTrungBinh = (getDiemToan() + getDiemVan() + getDiemAnh()) / 3;
    }

    public void LayThongTin() {
        TinhDiemTrungBinh();
        System.out.println(getHoTen() + " học lớp " + getLop() + ", có điểm trung bình là: " + getDiemTrungBinh());
    }


}
