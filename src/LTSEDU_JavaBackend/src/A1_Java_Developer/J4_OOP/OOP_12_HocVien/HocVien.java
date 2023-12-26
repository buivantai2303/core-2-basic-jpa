package A1_Java_Developer.J4_OOP.OOP_12_HocVien;

import java.sql.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HocVien {
    private int MaHocVien;
    private String HoTen, Ho, Email;
    private LocalDate NgaySinh;
    private double HocPhi;

    public int getMaHocVien() {
        return MaHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        MaHocVien = maHocVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getHo() {
        setHo();
        return Ho;
    }

    public void setHo() {
        Ho = null;
        List<String> list = Arrays.asList(getHoTen().trim().split("\\s+"));
        Ho = list.get(0);
    }

    public String getEmail() {
        setEmail();
        return Email;
    }

    public void setEmail() {
//        List<String> list = List.of(getHoTen().trim().replaceAll("\\s+", ""));
        Email = null;
        String HoVaTenTemp = getHoTen().trim().replaceAll("\\s+", "").toLowerCase();
        Email = HoVaTenTemp+ "@edusolution.com";
    }

    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public double getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(double hocPhi) {
        if (hocPhi > 3000000) {
            HocPhi = (double) hocPhi - (hocPhi * 3 / 100);
        } else {
            HocPhi = (double) hocPhi;
        }
    }

    public HocVien(int maHocVien, String hoTen, LocalDate ngaySinh, double hocPhi) {
        MaHocVien = maHocVien;
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        HocPhi = hocPhi;
    }

    public HocVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Mã học viên: ");
        setMaHocVien(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Nhập họ và tên: ");
        setHoTen(scanner.nextLine());

        System.out.print("Nhập ngày sinh: ");
        setNgaySinh(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.print("Nhập học phí: ");
        setHocPhi(scanner.nextDouble());
    }


    public void InThongTin() {
        System.out.println("Mã học viên " + getMaHocVien());
        System.out.println("- Học viên: " + getHoTen());
        System.out.println("- Ngày sinh: " + getNgaySinh());
        System.out.println(("- Học phí (sau khi tính toán: " + getHocPhi()));
        System.out.println("- Email: " + getEmail());
    }

    public static List<HocVien> TimKiemHocVien(List<HocVien> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập học tên học viên cần tìm: ");
        String ten = scanner.nextLine();
        List<HocVien> result = new ArrayList<>();
        for (HocVien hocVien : list) {
            if(hocVien.getHoTen().toUpperCase().contains(ten.toUpperCase()))
                result.add(hocVien);
        }
        return result;
    }


}
