package J4_OOP.OOP_02_SanPham;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        int MaSanPham = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String TenSanPham = scanner.nextLine();


        System.out.print("Nhập loại sản phẩm: ");
        String LoaiSanPham = scanner.nextLine();


        System.out.print("Nhập tình trạng: ");
        boolean LaSanPhamMoi = scanner.nextBoolean();


        SanPham sanPham = new SanPham(MaSanPham, TenSanPham, LoaiSanPham, LaSanPhamMoi);
        sanPham.InThongTin();
    }
}
