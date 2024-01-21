package A1_Java_Developer.J4_OOP.OOP_03_MonAn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập têm món ăn: ");
        String TenMonAn = scanner.nextLine();

        System.out.print("Nhập giá bán: ");
        int GiaBan = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập thông tin giới thiệu món ăn: ");
        String GioiThieu = scanner.nextLine();

        System.out.print("Nhập nguyên liệu của món ăn: ");
        String NguyenLieu = scanner.nextLine();

        MonAn monAn = new MonAn(TenMonAn, GiaBan, GioiThieu, NguyenLieu);

        monAn.InThongTin();
    }
}
