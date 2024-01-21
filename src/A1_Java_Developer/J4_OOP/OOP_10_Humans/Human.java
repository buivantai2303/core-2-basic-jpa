package A1_Java_Developer.J4_OOP.OOP_10_Humans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Human {
    private int MaSo;
    private String HoTen, Ho, Dem, Ten;
    private LocalDate NgaySinh;

    public int getMaSo() {
        return MaSo;
    }

    public void setMaSo(int maSo) {
        MaSo = maSo;
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
        List<String> list = Arrays.asList(getHoTen().trim().split("\\s+"));
        Ho = list.get(0);
    }

    public String getDem() {
        setDem();
        return Dem;
    }

    public void setDem() {
        Dem = "";
        List<String> list = Arrays.asList(getHoTen().trim().split("\\s+"));
        for (int i = 1; i < list.size() - 1; i++) {
            Dem += list.get(i) + " ";
        }
    }

    public String getTen() {
        setTen();
        return Ten;
    }

    public void setTen() {
        Ten = "";
        List<String> list = Arrays.asList(getHoTen().trim().split("\\s+"));
        Ten = list.get(list.size() - 1);
    }

    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public Human(int maSo, String hoTen, LocalDate ngaySinh) {
        MaSo = maSo;
        HoTen = hoTen;
        NgaySinh = ngaySinh;
    }

    public Human() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Mã số: ");
        setMaSo(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Nhập họ và tên: ");
        setHoTen(scanner.nextLine());

        System.out.print("Nhập ngày sinh: ");
        setNgaySinh(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public void InThongTin() {
        System.out.println("Mã số: " + getMaSo() + ", có tên: " + getHoTen() + ", ngày sinh: " + getNgaySinh());
        System.out.println("Họ: " + getHo());
        System.out.println("Tên đệm: " + getDem());
        System.out.println("Tên chính: " + getTen());
    }
}
