package J4_OOP.OOP_20_CuaHangSach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TapChi extends CuaHangSach{
    private String TenTapChi;
    private int SoPhatHanh, ThangPhatHanh;
    private Scanner scanner = new Scanner(System.in);

    public String getTenTapChi() {
        return TenTapChi;
    }

    public void setTenTapChi(String tenTapChi) {
        TenTapChi = tenTapChi;
    }

    public int getSoPhatHanh() {
        return SoPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        SoPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return ThangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        ThangPhatHanh = thangPhatHanh;
    }

    public void NhapThongTin (){
        System.out.print("Nhập tên tạp chí: ");
        setTenTapChi(scanner.nextLine());

        System.out.print("Nhập số phát hành: ");
        setSoPhatHanh(scanner.nextInt());

        System.out.print("Nhập tháng phát hành: ");
        setThangPhatHanh(scanner.nextInt());
    }

    public void InThongTin() {
        System.out.println("Tên tạp chí: " + getTenTapChi());
        System.out.println("Số phát hành: " + getSoPhatHanh());
        System.out.println("Tháng phát hành: " + getThangPhatHanh());
    }

    public static List<TapChi> TimKiem (List<TapChi> list, String TenSachCanTim) {
        List<TapChi> listResult = new ArrayList<TapChi>();
        list.forEach(x -> {if (x.getTenTapChi().contains(TenSachCanTim)) listResult.add(x);});
        return listResult;
    }
}
