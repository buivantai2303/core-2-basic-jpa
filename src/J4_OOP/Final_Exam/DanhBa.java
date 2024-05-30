package J4_OOP.Final_Exam;

public class DanhBa {
    private int MaLienHe;
    private String TenLienHe, SoDienThoai;
    private Boolean TrangThaiChan;

    public int getMaLienHe() {
        return MaLienHe;
    }

    public void setMaLienHe(int maLienHe) {
        MaLienHe = maLienHe;
    }

    public String getTenLienHe() {
        return TenLienHe;
    }

    public void setTenLienHe(String tenLienHe) {
        TenLienHe = tenLienHe;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public Boolean getTrangThaiChan() {
        return TrangThaiChan;
    }

    public void setTrangThaiChan(Boolean trangThaiChan) {
        TrangThaiChan = trangThaiChan;
    }

    public DanhBa() {
        setMaLienHe(InputHelper.IntHelper("Nhập ID cho liên hệ: ", "Nhập sai cú pháp!"));
        setTenLienHe(InputHelper.StringHelper("Nhập tên liên hệ (nhỏ hơn 10 ký tự): ", "Nhập sai tên liên hệ!"));
        setSoDienThoai(InputHelper.StringHelper("Nhập số điện thoại: ", "Nhập sai cú pháp!"));
        setTrangThaiChan(InputHelper.booleanHelper("Trạng thái chặn (0 để hủy chặn, 1 để chặn): ", "Nhập sai cú pháp!"));
    }
}
