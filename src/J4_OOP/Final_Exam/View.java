package J4_OOP.Final_Exam;

import java.util.Scanner;

public class View {
    public static void MenuQuanLyDanhBa() {
        Scanner scanner = new Scanner(System.in);
        DanhBaController danhBaController = new DanhBaController();

        while (true) {
            System.out.println("===== MENU QUẢN LÝ DANH BẠ =====");
            System.out.println("1. Xem danh bạ");
            System.out.println("2. Thêm liên hệ");
            System.out.println("3. Thay đổi trạng thái chặn");
            System.out.println("4. Thay đổi tên liên hệ");
            System.out.println("5. Xóa liên hệ");
            System.out.println("6. Tìm kiếm theo ID");
            System.out.println("7. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    danhBaController.XemDanhBa();
                    break;
                case 2:
                    danhBaController.ThemLienHe(new DanhBa());
                    break;
                case 3:
                    danhBaController.ThayDoiTrangThaiChan(InputHelper.StringHelper("Nhập số điện thoại: ", "Nhập sai số điện thoại"));
                    break;
                case 4:
                    danhBaController.ThayDoiTenLienHe(InputHelper.StringHelper("Nhập số điện thoại: ", "Nhập sai số điện thoại"), InputHelper.StringHelper("Nhập tên mới của liên hệ: ", "Nhập sai cú pháp tên!"));                    break;
                case 5:
                    danhBaController.XoaLienHe(InputHelper.StringHelper("Nhập số điện thoại: ", "Nhập sai số điện thoại"));
                    break;
                case 6:
                    danhBaController.TimKiemTheoID(InputHelper.IntHelper("Nhập ID liên hệ: ", "Nhập sai ID"));
                    break;
                case 7:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }

    public static void main(String[] args) {
        MenuQuanLyDanhBa();
    }
}
