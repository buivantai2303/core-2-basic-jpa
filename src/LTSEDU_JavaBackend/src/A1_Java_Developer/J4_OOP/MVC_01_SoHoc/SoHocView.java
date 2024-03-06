package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.MVC_01_SoHoc;

import java.util.Scanner;

public class SoHocView {
    static SoHocController soHocController = new SoHocController();
    private static Scanner scanner = new Scanner(System.in);

    public static void Menu() {

        System.out.println("Menu: ");
        System.out.println("1. Tạo số");
        System.out.println("2. Tạo danh sách số ngẫu nhiên");
        System.out.println("3. Hiển thị Tất Cả");
        System.out.println("4. Hiển thị Số Chẵn");
        System.out.println("5. Hiển thị Số Lẻ");
        System.out.println("6. Hiển thị số Nguyên Tố");
        System.out.println("7. Hiển thị số Đối Xứng");
        System.out.println("8. Thoát");
        System.out.println("=============================");

        int choice = InputHelper.IntHelper("Nhập lựa chọn của bạn: ", "Lỗi giá trị nhập!");
        controller(choice);
    }

    public static void controller(int request) {
        switch (request) {
            case 1:
                soHocController.ThemSo();
                System.out.println();
                break;
            case 2: soHocController.TaoNgauNhien();
                System.out.println();
                break;
            case 3:
                soHocController.HienThiToanBo();
                System.out.println();
                break;
            case 4:
                soHocController.HienThiSoChan();
                System.out.println();
                break;
            case 5:
                soHocController.HienThiSoLe();
                System.out.println();
                break;
            case 6:
                soHocController.HienThoSoNguyenTo();
                System.out.println();
                break;
            case 7:
                soHocController.HienThiSoDoiXung();
                System.out.println();
                break;
            case 8:
                System.exit(0);
                System.out.println();
            default:
                System.out.println("Error");
                System.out.println();
        }
        Menu();
    }

    public static void main(String[] args) {
        Menu();
    }

}
