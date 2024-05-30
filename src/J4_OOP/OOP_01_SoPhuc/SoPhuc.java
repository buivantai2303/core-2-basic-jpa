package J4_OOP.OOP_01_SoPhuc;

public class SoPhuc {

    double PhanThuc;
    double PhanAo;

    public double getPhanThuc() {
        return PhanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        PhanThuc = phanThuc;
    }

    public double getPhanAo() {
        return PhanAo;
    }

    public void setPhanAo(double phanAo) {
        PhanAo = phanAo;
    }

    public void InThongTin (){
        System.out.println(PhanThuc + "+" + PhanAo + "i");
    }
}
