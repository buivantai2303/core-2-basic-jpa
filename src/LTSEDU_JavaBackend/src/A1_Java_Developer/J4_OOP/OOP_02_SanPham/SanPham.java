package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_02_SanPham;

public class SanPham {
    private int MaSanPham;
    private String TenSanPham;
    private String LoaiSanPham;
    private boolean LaSanPhamMoi;

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

    public String getLoaiSanPham() {
        return LoaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        LoaiSanPham = loaiSanPham;
    }

    public boolean isLaSanPhamMoi() {
        return LaSanPhamMoi;
    }

    public void setLaSanPhamMoi(boolean laSanPhamMoi) {
        LaSanPhamMoi = laSanPhamMoi;
    }

    public SanPham(int maSanPham, String tenSanPham, String loaiSanPham, boolean laSanPhamMoi) {
        MaSanPham = maSanPham;
        TenSanPham = tenSanPham;
        LoaiSanPham = loaiSanPham;
        LaSanPhamMoi = laSanPhamMoi;
    }

    public void InThongTin () {
        System.out.println("Sản phảm " + getTenSanPham() + " có mã là " + getMaSanPham() + ", thuộc loại " + getLoaiSanPham() + ", " + isLaSanPhamMoi() + " là sản phẩm mới.");

    }
}
