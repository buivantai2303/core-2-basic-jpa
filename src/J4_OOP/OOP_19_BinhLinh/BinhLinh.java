package J4_OOP.OOP_19_BinhLinh;

import java.lang.annotation.Target;

public class BinhLinh {
    protected String Ten;
    protected double SucManh = 50;
    protected boolean TrangBi;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public double getSucManh() {
        return SucManh;
    }

    public boolean isTrangBi() {
        return TrangBi;
    }

    public void setTrangBi(boolean trangBi) {
        this.TrangBi = trangBi;
        SucManh = TinhSucManh();
    }

    protected double TinhSucManh (){
        return TrangBi ? SucManh *= 1.1 : SucManh;
    }

    public void InThongTin (){
        System.out.println(Ten + " có sức mạnh là: " +(int) getSucManh());
    }

    public int ChienDau(BinhLinh binhLinh){
        return SucManh < binhLinh.getSucManh() ? -1 : SucManh == binhLinh.getSucManh() ? 0 : 1;
    }
}
