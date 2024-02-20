package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_20_CuaHangSach;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sach> listSach = new ArrayList<Sach>();

        Sach sach_1 = new Sach();
        listSach.add(sach_1);

        Sach sach_2 = new Sach("Chuyện kể rằng có nàng và tôi", "Bùi Văn Tài", 500);
        Sach sach_3 = new Sach("Những bức thư chưa gửi", "Nguyễn Văn Thập", 500);
        Sach sach_4 = new Sach("Cat named Bob", "James Bowen", 500);

        sach_1.In();
        listSach.add(sach_2);
        listSach.add(sach_3);
        listSach.add(sach_4);

        Sach.TimKiem(listSach, "thư").forEach(x -> System.out.println(x.getTenSach()));
    }
}
