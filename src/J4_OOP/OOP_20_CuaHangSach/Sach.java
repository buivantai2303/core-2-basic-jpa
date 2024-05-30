package J4_OOP.OOP_20_CuaHangSach;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Sach extends CuaHangSach {
    protected String TenSach, TenTacGia;
    protected int SoTrang;

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        TenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int soTrang) {
        SoTrang = soTrang;
    }

    private Scanner scanner = new Scanner(System.in);

    public Sach(String tenSach, String tenTacGia, int soTrang) {
        TenSach = tenSach;
        TenTacGia = tenTacGia;
        SoTrang = soTrang;
    }

    public Sach (){
        System.out.print("Nhập tên sách: ");
        setTenSach(scanner.nextLine());

        System.out.print("Nhập tên tác giả: ");
        setTenTacGia(scanner.nextLine());

        System.out.print("Nhập số trang: ");
        setSoTrang(scanner.nextInt());
        scanner.nextLine();
    }

    public static List<Sach> TimKiem (List<Sach> list, String TenSachCanTim) {
        List<Sach> listResult = new ArrayList<Sach>();
        list.forEach(x -> {if (x.getTenSach().contains(TenSachCanTim)) listResult.add(x);});
        return listResult;
    }
}
