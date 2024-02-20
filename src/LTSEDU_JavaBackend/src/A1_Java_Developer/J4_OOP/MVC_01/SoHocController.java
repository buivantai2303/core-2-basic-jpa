package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.MVC_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SoHocController {
    List<SoHoc> listSoHoc = new ArrayList<>();

    private final Random random = new Random();

    public void ThemSo() {
        SoHoc soHoc = new SoHoc();
        listSoHoc.add(soHoc);
    }

    public void TaoNgauNhien() {
        int number = InputHelper.IntHelper("Nhập số lượng ngẫu nhiên: ", "Lỗi nhập liệu!");
        for (int i = 0; i < number; i++) {
            SoHoc soHoc = new SoHoc(random.nextInt(1, 100));
            listSoHoc.add(soHoc);
        }
    }

    public void HienThiToanBo() {
        System.out.print("- Danh sách toàn bộ số: ");
        for (SoHoc item : listSoHoc) {
            System.out.print(item.getGiaTri() + " ");
        }
    }

    public void HienThiSoChan() {
        System.out.print("- Danh sách số chẵn: ");
        for (SoHoc item : listSoHoc) {
            if (item.isLaSoChan()) {
                System.out.print(item.getGiaTri() + " ");
            }
        }
    }

    public void HienThiSoLe() {
        System.out.print("- Danh sách số lẻ: ");
        for (SoHoc item : listSoHoc) {
            if (!item.isLaSoChan()) {
                System.out.print(item.getGiaTri() + " ");
            }
        }
    }

    public void HienThoSoNguyenTo() {
        System.out.print("- Danh sách số nguyên tố: ");
        for (SoHoc item : listSoHoc) {
            if (item.isLaSoNguyenTo()) {
                System.out.print(item.getGiaTri() + " ");

            }
        }
    }

    public void HienThiSoDoiXung() {
        System.out.print("- Danh sách số đối xứng: ");
        for (SoHoc item : listSoHoc) {
            if (item.isLaSoDoiXung()) {
                System.out.print(item.getGiaTri() + " ");
            }
        }
    }
}
