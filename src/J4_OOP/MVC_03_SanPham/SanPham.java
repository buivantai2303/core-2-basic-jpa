package J4_OOP.MVC_03_SanPham;

import J4_OOP.MVC_01_SoHoc.InputHelper;

public class SanPham {
    private int MaSanPham;
    private String TenSanPham;
    private LoaiSanPham loaiSanPham;
    private NhaCungCap nhaCungCap;

    public int getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        MaSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public SanPham() {
        setMaSanPham(MVC_003_InputHelper.IntHelper("Nhập mã sản phẩm: ", "Nhập sai số mã sản phẩm!"));
        setTenSanPham(MVC_003_InputHelper.StringHelper("Nhập tên sản phẩm: ", "Nhập sai tê sản phẩm!"));
        setLoaiSanPham(new LoaiSanPham());
        setNhaCungCap(new NhaCungCap());
    }

    public void InThongTin() {
        System.out.println("- Mã sản phẩm: " + getMaSanPham());
        System.out.println("- Tên sản phẩm: " + getTenSanPham());
        loaiSanPham.InThongTin();
        nhaCungCap.InThongTin();
    }
}
