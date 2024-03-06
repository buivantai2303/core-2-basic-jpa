package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.Final_Exam;

import java.util.HashMap;
import java.util.Map;

public class DanhBaController {
    private HashMap<Integer, DanhBa> danhBaHashMap = new HashMap<>();

    public void XemDanhBa() {
        for (Map.Entry<Integer, DanhBa> danhBaEntry : danhBaHashMap.entrySet()) {
            Integer MLH = danhBaEntry.getKey();
            DanhBa danhba = danhBaEntry.getValue();
            System.out.println("- ID: " + MLH + " | tên liên hệ: " + danhba.getTenLienHe() + " | SDT: " + danhba.getSoDienThoai() + " | Trạng thái chặn: " + danhba.getTrangThaiChan());
        }
    }

    public void ThemLienHe(DanhBa danhBa) {
        danhBaHashMap.put(danhBa.getMaLienHe(), danhBa);
    }

    public void ThayDoiTrangThaiChan(String soDienThoai) {
        boolean found = false;
        for (DanhBa danhBa : danhBaHashMap.values()) {
            if (danhBa.getSoDienThoai().equals(soDienThoai)) {
                found = true;
                boolean currentTrangThai = danhBa.getTrangThaiChan();
                danhBa.setTrangThaiChan(!currentTrangThai);
                System.out.println("Đã thay đổi trạng thái chặn của " + soDienThoai + " thành " + !currentTrangThai);
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy số điện thoại " + soDienThoai + " trong danh bạ.");
        }
    }

    public void ThayDoiTenLienHe(String soDienThoai, String TenMoi) {
        boolean found = false;
        for (DanhBa danhBa : danhBaHashMap.values()) {
            if (danhBa.getSoDienThoai().equals(soDienThoai)) {
                found = true;
                danhBa.setTenLienHe(TenMoi);
                System.out.println("Đã thay đổi tên của " + soDienThoai + " thành: " + TenMoi);
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy số điện thoại " + soDienThoai + " trong danh bạ.");
        }
    }

    public void XoaLienHe(String soDienThoai) {
        boolean found = false;
        for (DanhBa danhBa : danhBaHashMap.values()) {
            if (danhBa.getSoDienThoai().equals(soDienThoai)) {
                found = true;
                danhBaHashMap.remove(danhBa.getMaLienHe());
                System.out.println("Đã xóa " + soDienThoai + " thành công!");
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy số điện thoại " + soDienThoai + " trong danh bạ.");
        }
    }

    public void TimKiemTheoID(int maLienHe) {
        DanhBa danhBa = danhBaHashMap.get(maLienHe);
        if (danhBa != null) {
            System.out.println("Thông tin liên hệ có ID " + maLienHe + ":");
            System.out.println("- Tên liên hệ: " + danhBa.getTenLienHe());
            System.out.println("- Số điện thoại: " + danhBa.getSoDienThoai());
            System.out.println("- Trạng thái chặn: " + danhBa.getTrangThaiChan());
        } else {
            System.out.println("Không tìm thấy liên hệ có ID " + maLienHe + " trong danh bạ.");
        }
    }

}
