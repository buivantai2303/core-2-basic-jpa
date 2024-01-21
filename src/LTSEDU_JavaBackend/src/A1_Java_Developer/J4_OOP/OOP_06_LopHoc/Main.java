package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_06_LopHoc;

public class Main {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc(20210156, 15, "DC.IT.12.10", "EAUT", "Nguyen Minh Trang");
        LopHoc lopHoc_2 = new LopHoc();

        lopHoc.InThongTin();
        lopHoc_2.InThongTin();
    }
}
