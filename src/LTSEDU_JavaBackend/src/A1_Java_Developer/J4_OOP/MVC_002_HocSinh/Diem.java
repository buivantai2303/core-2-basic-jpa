package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.MVC_002_HocSinh;

public class Diem {
    private int MaHS, MaMH;
    private double Diem;

    public int getMaHS() {
        return MaHS;
    }

    public void setMaHS(int maHS) {
        MaHS = maHS;
    }

    public int getMaMH() {
        return MaMH;
    }

    public void setMaMH(int maMH) {
        MaMH = maMH;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double diem) {
        Diem = diem;
    }

    public Diem(int maHS, int maMH, double diem) {
        MaHS = maHS;
        MaMH = maMH;
        Diem = diem;
    }

    public Diem() {
        setMaHS(MVC_002_InputHelper.IntHelper("Nhập mã học sinh: ", "Nhập sai mã học sinh"));
        setMaMH(MVC_002_InputHelper.IntHelper("Nhập mã môn học: ", "Nhập sai mã môn học"));
        setDiem(MVC_002_InputHelper.DoubleHelper("Nhập điểm: ", "Nhập sai điểm: "));
    }

    public void InThongTin() {
        System.out.println("Mã học sinh: " + getMaHS());
        System.out.println("Mã môn học: " + getMaMH());
        System.out.println("Điểm: " + getDiem());
    }
}
