package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.MVC_03_SanPham;

public class LoaiSanPham {
    private int LoaiSP;
    private String TenLoai;

    public int getLoaiSP() {
        return LoaiSP;
    }

    public void setLoaiSP(int loaiSP) {
        LoaiSP = loaiSP;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String tenLoai) {
        TenLoai = tenLoai;
    }

    public LoaiSanPham(int loaiSP, String tenLoai) {
        LoaiSP = loaiSP;
        TenLoai = tenLoai;
    }

    public LoaiSanPham() {
        setLoaiSP(MVC_003_InputHelper.IntHelper("Nhập mã loại sản phẩm: ", "Nhập sai mã loại sản phẩm!"));
        setTenLoai(MVC_003_InputHelper.StringHelper("Nhập tên loại sản phẩm: ", "Nhập sai tên sản phẩm!"));
    }

    public void InThongTin() {
        System.out.println("- Mã loại sản phẩm: " + getLoaiSP());
        System.out.println("- Tên loại sản phẩm: " + getTenLoai());
    }
}
