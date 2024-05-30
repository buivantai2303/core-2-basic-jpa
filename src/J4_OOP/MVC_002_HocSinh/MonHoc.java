package J4_OOP.MVC_002_HocSinh;

public class MonHoc {
    private int MaMH, SoTiet;
    private String TenMH;

    public int getMaMH() {
        return MaMH;
    }

    public void setMaMH(int maMH) {
        MaMH = maMH;
    }

    public int getSoTiet() {
        return SoTiet;
    }

    public void setSoTiet(int soTiet) {
        SoTiet = soTiet;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String tenMH) {
        TenMH = tenMH;
    }

    public MonHoc(int maMH, int soTiet, String tenMH) {
        MaMH = maMH;
        SoTiet = soTiet;
        TenMH = tenMH;
    }

    public MonHoc() {
        setMaMH(MVC_002_InputHelper.IntHelper("Nhập mã môn học: ", "Nhập sai mã môn học!"));
        setTenMH(MVC_002_InputHelper.StringHelper("Nhập tên môn học: ", "Nhập sai tên môn học!"));
        setSoTiet(MVC_002_InputHelper.IntHelper("Nhập số tiết của môn học: ", "Nhập sai số tiết!"));
    }

    public void InThongTin() {
        System.out.println("Mã môn học: " + getMaMH());
        System.out.println("Tên môn học: " + getTenMH());
        System.out.println("Số tiết của môn học: " + getSoTiet());
    }
}
