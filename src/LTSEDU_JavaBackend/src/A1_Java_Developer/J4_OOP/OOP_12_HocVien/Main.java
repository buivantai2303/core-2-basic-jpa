package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_12_HocVien;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HocVien hocVien = new HocVien();

        hocVien.InThongTin();

        List<HocVien> list = new ArrayList<HocVien>();

        list.add(hocVien);
        list.add(new HocVien());
        list.add(new HocVien());
        list.add(new HocVien());
        list.add(new HocVien());


        List<HocVien> listResult = HocVien.TimKiemHocVien(list);
        for (HocVien i : listResult) {
            i.InThongTin();
        }
    }
}
