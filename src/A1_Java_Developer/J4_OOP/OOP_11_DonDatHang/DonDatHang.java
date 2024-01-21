package A1_Java_Developer.J4_OOP.OOP_11_DonDatHang;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DonDatHang {
    private int MaSoDon, SoLuong;
    private LocalDate NgayThang;
    private String TenSanPham, GhiChu;
    private double DonGia, ThanhTien;

    public int getMaSoDon() {
        return MaSoDon;
    }

    public void setMaSoDon(int maSoDon) {
        MaSoDon = maSoDon;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public LocalDate getNgayThang() {
        return NgayThang;
    }

    public void setNgayThang(LocalDate ngayThang) {
        NgayThang = ngayThang;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String ghiChu) {
        GhiChu = ghiChu;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }

    public double getThanhTien() {
        setThanhTien();
        return ThanhTien;
    }

    public void setThanhTien() {
        ThanhTien = 0;
        ThanhTien = getDonGia() * getSoLuong();
    }

    public DonDatHang(int maSoDon, int soLuong, LocalDate ngayThang, String tenSanPham, String ghiChu, double donGia, double thanhTien) {
        MaSoDon = maSoDon;
        SoLuong = soLuong;
        NgayThang = ngayThang;
        TenSanPham = tenSanPham;
        GhiChu = ghiChu;
        DonGia = donGia;
        ThanhTien = thanhTien;
    }

    public DonDatHang() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã số đơn hàng: ");
        setMaSoDon(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Nhập ngày đặt hàng: ");
        setNgayThang(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.print("Nhập số lượng sản phẩm: ");
        setSoLuong(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Nhập đơn giá: ");
        setDonGia(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Nhập ghi chú: ");
        setGhiChu(scanner.nextLine());
    }

    public void InThongTin() {
        System.out.println("Đơn hàng có: ");
        System.out.println("- Mã số đơn: " + getMaSoDon());
        System.out.println("- Ngày đặt: " + getNgayThang());
        System.out.println("- Số lượng: " + getSoLuong());
        System.out.println("- Đơn giá: " + getDonGia());
        System.out.println("- Thành tiền: " + getThanhTien());
        System.out.println("- Ghi chú: " + getGhiChu());
    }
}
