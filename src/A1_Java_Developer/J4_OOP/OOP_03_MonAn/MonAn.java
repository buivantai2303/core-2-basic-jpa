package A1_Java_Developer.J4_OOP.OOP_03_MonAn;

public class MonAn {
    private String TenMonAn;
    private int GiaBan;
    private String GioiThieu;
    private String NguyenLieuChinh;

    public String getTenMonAn() {
        return TenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        TenMonAn = tenMonAn;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int giaBan) {
        GiaBan = giaBan;
    }

    public String getGioiThieu() {
        return GioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        GioiThieu = gioiThieu;
    }

    public String getNguyenLieuChinh() {
        return NguyenLieuChinh;
    }

    public void setNguyenLieuChinh(String nguyenLieuChinh) {
        NguyenLieuChinh = nguyenLieuChinh;
    }

    public MonAn(String tenMonAn, int giaBan, String gioiThieu, String nguyenLieuChinh) {
        TenMonAn = tenMonAn;
        GiaBan = giaBan;
        GioiThieu = gioiThieu;
        NguyenLieuChinh = nguyenLieuChinh;
    }

    public void InThongTin() {
        System.out.println(TenMonAn + ", " + "Giá bán: " + + GiaBan + ", " + GioiThieu + ", dược làm từ các nguyên liệu chính: " +NguyenLieuChinh);
    }
}
