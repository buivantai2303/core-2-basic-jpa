package JPA.JPA_002.Models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "nhanViens")
public class NhanVien {

    @Id
    @Column(name = "nhanVienId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nhanVienId;

    @Max(value = 20, message = "Name maximum has 20 characters")
    @Min(value = 2, message = "Name minimum has 2 characters")
    @Column(name = "hoTen")
    private String hoTen;

    @Column(name = "ngaySinh")
    @Min(value = 1970, message = "Age cannot be older than 1970")
    @Max(value = 2000, message = "Age cannot be less than 2000")
    private LocalDate ngaySinh;
    @Column(name = "soDienThoai")
    private String soDienThoai;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "email")
    private String email;

    @Column(name = "heSoLuong")
    private double heSoLuong;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanVien")
    @JsonIgnoreProperties(value = "nhanVien")
    private Set<PhanCong> phanCongs;


    public int getNhanVienId() {
        return nhanVienId;
    }

    public void setNhanVienId(int nhanVienId) {
        this.nhanVienId = nhanVienId;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Set<PhanCong> getPhanCongs() {
        return phanCongs;
    }

    public void setPhanCongs(Set<PhanCong> phanCongs) {
        this.phanCongs = phanCongs;
    }
}
