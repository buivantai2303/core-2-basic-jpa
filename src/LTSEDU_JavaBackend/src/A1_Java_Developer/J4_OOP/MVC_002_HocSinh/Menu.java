package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.MVC_002_HocSinh;

import LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.MVC_01_SoHoc.InputHelper;

public class Menu {
    private static final DiemController diemController = new DiemController();

    public static void MenuContent() {
        System.out.println("Menu: ");
        System.out.println("1. Thêm học sinh");
        System.out.println("2. Thêm môn học");
        System.out.println("3. Chấm điểm");
        System.out.println("4. Xem bảng điểm học sinh");
        System.out.println("5. Xem tổng kết điểm học sinh theo môn");
        System.out.println("6. Thoát");
        System.out.println("=============================");

        int choice = InputHelper.IntHelper("Nhập lựa chọn của bạn: ", "Lỗi giá trị nhập!");
        controller(choice);
    }

    public static void controller(int choice) {
        switch (choice) {
            case 1:
                diemController.ThemHS(new HocSinh());
                break;
            case 2:
                diemController.ThemMH(new MonHoc());
                break;
            case 3:
                int maHS = InputHelper.IntHelper("Nhập mã học sinh: ", "Nhập sai mã học sinh");
                int maMH = InputHelper.IntHelper("Nhập mã môn học: ", "Nhập sai mã môn học");
                double diem = MVC_002_InputHelper.DoubleHelper("Nhập điểm: ", "Nhập sai điểm");
                Diem diemObject = new Diem(maHS, maMH, diem);
                diemController.ChamDiem(maHS, maMH, diemObject);
                break;
            case 4:
                int maHSToView = InputHelper.IntHelper("Nhập mã học sinh: ", "Nhập sai mã học sinh");
                diemController.BangDiem(maHSToView);
                break;
            case 5:
                int maMHToView = InputHelper.IntHelper("Nhập mã môn học: ", "Nhập sai mã môn học");
                diemController.TongKetMon(maMHToView);
                break;
            case 6:
                System.out.println("Chương trình đã thoát.");
                System.exit(0);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                MenuContent();
        }
    }

    public static void main(String[] args) {
        while (true) {
            MenuContent();
        }
    }
}
