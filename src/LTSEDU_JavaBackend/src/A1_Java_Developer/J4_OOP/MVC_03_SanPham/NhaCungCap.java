package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.MVC_03_SanPham;

public class NhaCungCap {
    private int NhaCC;
    private String TenCC, SoDT;

    public int getNhaCC() {
        return NhaCC;
    }

    public void setNhaCC(int nhaCC) {
        NhaCC = nhaCC;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String soDT) {
        SoDT = soDT;
    }

    public String getTenCC() {
        return TenCC;
    }

    public void setTenCC(String tenCC) {
        TenCC = tenCC;
    }

    public NhaCungCap() {
        setNhaCC(MVC_003_InputHelper.IntHelper("Nhập mã nhà cung cấp: ", "Nhập sai mã nhà cung cấp, vui lòng nhập số!"));
        setTenCC(MVC_003_InputHelper.StringHelper("Nhập tên nhà cung cấp: ", "Nhập sai tên nhà cung cấp, vui lòng nhập lại"));
        setSoDT(MVC_003_InputHelper.StringHelper("Nhập số điện thoại nhà cung cấp: ", "Nhập sai số điện thoại!"));
    }

    public void InThongTin() {
        System.out.println("- Mã nhà cung cấp: " + getNhaCC());
        System.out.println("- Tên nhà cung cấp: " + getTenCC());
        System.out.println("- Số điện thoại: " + getSoDT());
    }
}
