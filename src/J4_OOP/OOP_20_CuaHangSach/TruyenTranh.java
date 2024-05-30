package J4_OOP.OOP_20_CuaHangSach;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruyenTranh extends CuaHangSach {
    private Scanner scanner = new Scanner(System.in);
    private String TenTruyen;
    private LocalDate NgayPhatHanh;

    public String getTenTruyen() {
        return TenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        TenTruyen = tenTruyen;
    }

    public LocalDate getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        NgayPhatHanh = ngayPhatHanh;
    }

    public void NhapThongTin() {

        System.out.println("Nhập tên truyện: ");
        setTenTruyen(scanner.nextLine());

        System.out.println("Nhập ngày phát hành (dd/MM/yyyy): ");
        setNgayPhatHanh(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public void InThongTin (){
        System.out.println("- Tên truyện: " + getTenTruyen());
        System.out.println("- Ngày phát hành: " + getNgayPhatHanh());

    }

    public static List<TruyenTranh> TimKiem (List<TruyenTranh> list, String TenSachCanTim) {
        List<TruyenTranh> listResult = new ArrayList<TruyenTranh>();
        list.forEach(x -> {if (x.getTenTruyen().contains(TenSachCanTim)) listResult.add(x);});
        return listResult;
    }
}
