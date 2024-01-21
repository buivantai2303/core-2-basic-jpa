package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_09_Oxyz;

public class Main {
    public static void main(String[] args) {
        HeToaDo heToaDo = new HeToaDo(6, 7, 12);
        HeToaDo heToaDo1 = new HeToaDo();

        heToaDo1.InThongTin();
        heToaDo.InThongTin();
        System.out.println(heToaDo.tinhKhoanhCach(heToaDo1));
    }
}
