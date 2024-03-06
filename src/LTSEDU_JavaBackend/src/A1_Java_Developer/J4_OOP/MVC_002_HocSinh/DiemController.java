package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.MVC_002_HocSinh;

import java.util.*;

public class DiemController {
    private Scanner scanner = new Scanner(System.in);

    HashMap<Integer, HocSinh> listHocSinh = new HashMap<>();
    HashMap<Integer, MonHoc> listMonHoc = new HashMap<>();
    HashMap<Integer, HashMap<Integer, Diem>> diemMonHoc = new HashMap<>();

    public void ThemHS(HocSinh hocSinh) {
        listHocSinh.put(hocSinh.getMaHS(), hocSinh);
    }

    public void ThemMH(MonHoc monHoc) {
        listMonHoc.put(monHoc.getMaMH(), monHoc);
    }

    public void ChamDiem(int maHS, int maMH, Diem diem) {
        do {
            if (listHocSinh.containsKey(maHS) && listMonHoc.containsKey(maMH)) {
                HashMap<Integer, Diem> diemHocSinh = diemMonHoc.getOrDefault(maHS, new HashMap<>());
                diemHocSinh.put(maMH, diem);
                diemMonHoc.put(maHS, diemHocSinh);
                break; // Thêm break để thoát khỏi vòng lặp
            } else {
                System.out.println("Không tìm thấy Học Sinh hoặc Môn Học.");
            }
        } while (true);
    }


    public void BangDiem(int maHS) {
        do {
            if (listHocSinh.containsKey(maHS)) {
                HocSinh hocSinh = listHocSinh.get(maHS);
                HashMap<Integer, Diem> diemHocSinh = diemMonHoc.getOrDefault(maHS, new HashMap<>());

                System.out.println("Điểm của học sinh: " + hocSinh.getTenHS() + " (Mã HS: " + maHS + ")");

                for (Map.Entry<Integer, Diem> entry : diemHocSinh.entrySet()) {
                    int maMH = entry.getKey();
                    Diem diem = entry.getValue();

                    MonHoc monHoc = listMonHoc.get(maMH);

                    System.out.println("  - Môn học: " + monHoc.getTenMH() + " (Mã MH: " + maMH + "), Điểm: " + diem.getDiem());
                }
                break;
            } else {
                System.out.println("Không tìm thấy Học Sinh hoặc chưa có điểm cho Học Sinh này.");

                System.out.println("Nhập lại mã Học Sinh (hoặc nhập 0 để thoát): ");
                maHS = scanner.nextInt();

                if (maHS == 0) {
                    break;
                }
            }
        } while (true);
        scanner.close();
    }



    public void TongKetMon(int maMH) {
        if (listMonHoc.containsKey(maMH)) {
            MonHoc monHoc = listMonHoc.get(maMH);

            System.out.println("Tổng kết điểm môn học " + monHoc.getTenMH() + " (Mã MH: " + maMH + "):");

            for (HashMap.Entry<Integer, HashMap<Integer, Diem>> entry : diemMonHoc.entrySet()) {
                int maHS = entry.getKey();
                HashMap<Integer, Diem> diemHocSinh = entry.getValue();

                if (diemHocSinh.containsKey(maMH)) {
                    HocSinh hocSinh = listHocSinh.get(maHS);
                    Diem diem = diemHocSinh.get(maMH);

                    System.out.println("  - Học sinh: " + hocSinh.getTenHS() + " (Mã HS: " + maHS + "), Điểm: " + diem.getDiem());
                }
            }
        } else {
            System.out.println("Không tìm thấy Môn Học có mã " + maMH);
        }
    }
}
