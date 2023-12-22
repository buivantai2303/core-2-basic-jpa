package A1_Java_Developer.J4_OOP.OOP_04_SoThuc;

public class Test {
    public static void main(String[] args) {
        SoThuc a = new SoThuc();
        SoThuc b = new SoThuc();
        SoThuc c = new SoThuc();

        a.TimMax(a, b, c).InThongTin();
        System.out.println(a.TinhCanBacN(b));
    }
}
