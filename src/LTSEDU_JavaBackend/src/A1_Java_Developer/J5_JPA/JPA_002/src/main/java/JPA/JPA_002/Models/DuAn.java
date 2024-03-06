package JPA.JPA_002.Models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import java.util.Set;

@Entity
@Table(name = "duAns")
public class DuAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "duAnId")
    private int duAnId;

    @Column(name = "tenDuAn")
    @Max(value = 10, message = "Project name maximum has 10 characters")
    @Min(value = 2, message = "Project name minimum has 2 characters")
    private String tenDuAn;

    @Column(name = "moTa")
    private String moTa;

    @Column(name = "ghiChu")
    private String ghiChu;

    @OneToMany(mappedBy = "duAn")
    @JsonIgnoreProperties(value = "duAn")
    Set<PhanCong> phanCongs;

    public int getDuAnId() {
        return duAnId;
    }

    public void setDuAnId(int duAnId) {
        this.duAnId = duAnId;
    }

    public String getTenDuAn() {
        return tenDuAn;
    }

    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Set<PhanCong> getPhanCongs() {
        return phanCongs;
    }

    public void setPhanCongs(Set<PhanCong> phanCongs) {
        this.phanCongs = phanCongs;
    }
}
