package JPA.JPA_002.Models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "phanCongs")
public class PhanCong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phanCongId")
    private int phanCongId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nhanVienId", foreignKey = @ForeignKey(name = "fk_phanCong_nhanVien"))
    @JsonBackReference
    private NhanVien nhanVien;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "duAnId", foreignKey = @ForeignKey(name = "fk_phanCong_duAn"))
    @JsonIgnoreProperties(value = "phanCongs")
    private DuAn duAn;

    @Column(name = "soGioLam")
    @Min(value = 1, message = "Working time cannot be less than one hour")
    private double soGioLam;

    public int getPhanCongId() {
        return phanCongId;
    }

    public void setPhanCongId(int phanCongId) {
        this.phanCongId = phanCongId;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public DuAn getDuAn() {
        return duAn;
    }

    public void setDuAn(DuAn duAn) {
        this.duAn = duAn;
    }

    public double getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(double soGioLam) {
        this.soGioLam = soGioLam;
    }
}
