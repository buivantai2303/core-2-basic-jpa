package J4_OOP.MVC_03_SanPham;

import java.util.Scanner;

public class SanPhamView {
    private SanPhamController controller;
    private Scanner scanner;

    public SanPhamView(SanPhamController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void Menu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Thêm Sản Phẩm");
        System.out.println("2. Hiện Sản Phẩm Của Loại");
        System.out.println("3. Hiển Sản Phẩm Của Nhà Cung Cấp");
        System.out.println("4. Thoát");
        System.out.println("================");
    }

    public void ThucThi(char option) {
        switch (option) {
            case '1':
                controller.ThemSanPham(new SanPham());
                break;
            case '2':
                controller.HienLoai(MVC_003_InputHelper.IntHelper("Nhập mã loại sản phẩm: ", "Nhập sai mã loại/Hoặc sản phẩm không tồn tại"));
                break;
            case '3':
                controller.HienNCC(MVC_003_InputHelper.IntHelper("Nhập mã nhà cung cấp: ", "Nhập sai mã NCC/Hoặc NCC không tồn tại"));
                break;
            case '4':
                System.out.println("Thoát chương trình");
                System.exit(0);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }

    public static void main(String[] args) {
        SanPhamController controller = new SanPhamController();
        SanPhamView view = new SanPhamView(controller);

        while (true) {
            view.Menu();
            System.out.print("Nhập lựa chọn: ");
            char option = view.scanner.next().charAt(0);
            view.ThucThi(option);
        }
    }
}
