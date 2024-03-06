package JPA.JPA_002.Services;

import JPA.JPA_002.Models.NhanVien;

import java.util.List;

public interface INhanVienServices {
    List<NhanVien> getAllNhanVien();
    NhanVien getNhanVienById(int Id);
    NhanVien addNhanVien(NhanVien nhanVien);
    NhanVien removeNhanVien(int Id);
    NhanVien modifyNhanVien(NhanVien nhanVien);
}
