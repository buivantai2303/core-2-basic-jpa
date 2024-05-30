package JPA.JPA_003.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "hocViens")
public class HocVien {
    @Id
    @Column(name = "hocVienId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hocVienId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "khoaHocId", foreignKey = @ForeignKey(name = "fk_hocVien_khoaHoc"))
    @JsonIgnoreProperties(value = "hocVien")
    Set<KhoaHoc> khoaHocs;

    @Column(name = "hoTen")
    @Max(value = 20, message = "Name maximum has 20 characters")
    @Min(value = 2, message = "Name minimum has 2 characters")
    private String hoTen;

    @Column(name = "ngaySinh")
    private LocalDate ngaySinh;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "queQuan")
    private String queQuan;

    @Column(name = "soDienThoai")
    private String soDienThoai;
}
