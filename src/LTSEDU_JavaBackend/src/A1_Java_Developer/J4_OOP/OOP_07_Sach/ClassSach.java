package A1_Java_Developer.J4_OOP.OOP_07_Sach;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClassSach {
    private String TenSach, TheLoaiSach,TacGia;
    private LocalDate NgayXuatBan;
    private int Gia;
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getTheLoaiSach() {
        return TheLoaiSach;
    }

    public void setTheLoaiSach(String theLoaiSach) {
        TheLoaiSach = theLoaiSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public LocalDate getNgayXuatBan() {
        return NgayXuatBan;
    }

    public void setNgayXuatBan(LocalDate ngayXuatBan) {
        NgayXuatBan = ngayXuatBan;
    }


    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public ClassSach(String tenSach, String theLoaiSach, String tacGia, LocalDate ngayXuatBan, int gia) {
        TenSach = tenSach;
        TheLoaiSach = theLoaiSach;
        TacGia = tacGia;
        NgayXuatBan = ngayXuatBan;
        Gia = gia;
    }

    public ClassSach() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        setTenSach(scanner.nextLine());

        System.out.print("Nhập thể loại sách: ");
        setTheLoaiSach(scanner.nextLine());

        System.out.print("Nhập tên tác giả: ");
        setTacGia(scanner.nextLine());

        System.out.print("Nhập ngày xuất bản sách: ");
        setNgayXuatBan(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.print("Nhập giá sách: ");
        setGia(scanner.nextInt());
    }

    public void InThongTin() {
        System.out.println(getTenSach() + " là sách " + getTheLoaiSach() + " của tác giả: " + getTacGia() + ", có giá: " + getGia() + ", xuất bản ngày: " + getNgayXuatBan());
    }
}
