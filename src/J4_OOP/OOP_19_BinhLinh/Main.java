package J4_OOP.OOP_19_BinhLinh;

public class Main {
    public static void main(String[] args) {

        BinhLinh linh_1 = new BinhLinh();
        linh_1.setTen("Linh 1");
        linh_1.setTrangBi(false);

        BinhLinh linh_2 = new BinhLinh();
        linh_2.setTen("Linh 2");
        linh_2.setTrangBi(true);

        CungThu Cung = new CungThu();
        Cung.setTen("Cung");
        Cung.setTrangBi(true);

        KiemSi Kiem = new KiemSi();
        Kiem.setTen("Kiem");
        Kiem.setTrangBi(true);

        DauSi DauSi = new DauSi();
        DauSi.setTen("DauSi");
        DauSi.setTrangBi(true);

        linh_1.InThongTin();
        linh_2.InThongTin();
        Cung.InThongTin();
        Kiem.InThongTin();
        DauSi.InThongTin();

        System.out.println("War: " + linh_2.ChienDau(linh_1));
    }
}
