package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_20_CuaHangSach;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CuaHangSach {
    protected int MaTaiLieu, SoBanPhatHanh;
    protected String NhaXuatBan;

    public int getMaTaiLieu() {
        return MaTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        MaTaiLieu = maTaiLieu;
    }

    public int getSoBanPhatHanh() {
        return SoBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhaTHanh) {
        SoBanPhatHanh = soBanPhaTHanh;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String naXuatBan) {
        NhaXuatBan = naXuatBan;
    }

    private Scanner scanner = new Scanner(System.in);

    public void Nhap (){
        System.out.print("Nhập Mã Tài Liệu: ");
        setMaTaiLieu(scanner.nextInt());

        System.out.print("Nhập Số bản phát hành: ");
        setSoBanPhatHanh(scanner.nextInt());

        scanner.nextLine();

        System.out.print("Nhập Nhà xuất bản: ");
        setNhaXuatBan(scanner.nextLine());
    }

    public void In(){
        System.out.println("Thông tin: ");
        System.out.println("- Mã Tài Liệu: " + getMaTaiLieu());
        System.out.println("- Số bản phát hành: " + getSoBanPhatHanh());
        System.out.println("- Nhà xuất bản: " + getNhaXuatBan());
    }

}
