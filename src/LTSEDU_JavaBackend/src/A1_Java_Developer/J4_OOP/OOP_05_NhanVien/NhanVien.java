package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_05_NhanVien;

public class NhanVien {
    private int MaNhanvien;
    private String HoVaTen, PhongBan, DiaChi, SoDienThoai;

    public int getMaNhanvien() {
        return MaNhanvien;
    }

    public void setMaNhanvien(int maNhanvien) {
        MaNhanvien = maNhanvien;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        HoVaTen = hoVaTen;
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String phongBan) {
        PhongBan = phongBan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public NhanVien(int maNhanvien, String hoVaTen, String phongBan, String diaChi, String soDienThoai) {
        MaNhanvien = maNhanvien;
        HoVaTen = hoVaTen;
        PhongBan = phongBan;
        DiaChi = diaChi;
        SoDienThoai = soDienThoai;
    }

    public void InThongTin() {
        System.out.println("Nhan vien: " + getHoVaTen() + ", thuộc phòng ban: " + getPhongBan() + ", có số điện thoại là: " + getSoDienThoai());
    }

}
