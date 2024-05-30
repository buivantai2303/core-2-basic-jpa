package J4_OOP.OOP_16_ThoiGian;

public class Main {
    public static void main(String[] args) {
        ThoiGian thoiGian_1 = new ThoiGian(23, 3, 2004);

        ThoiGian thoiGian_2 = new ThoiGian(23, 3, 2003);

        thoiGian_1.LayThongTin();
        thoiGian_2.LayThongTin();

        thoiGian_1.TinhKhoangThoiGian(thoiGian_2);
    }
}
