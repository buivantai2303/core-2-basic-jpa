package JPA.JPA_003.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "khoaHocs")
public class KhoaHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "khoaHocId")
    private int khoaHocId;

    @Column(name = "tenKhoaHoc")
    @Max(value = 20, message = "Name maximum has 10 characters")
    private String tenKhoaHoc;


    @Column(name = "moTa")
    private String moTa;

    @Max(value = 10000000, message = "Tuition fees cannot be greater than 10 million VND")
    @Column(name = "hocPhi")
    private double hocPhi;

    @Column(name = "ngatBatDau")
    private LocalDate ngayBatDau;

    @Column(name = "ngayKetThuc")
    private LocalDate ngayKetThuc;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "khoaHoc")
    @JsonIgnoreProperties(value = "hocSinhs")
    private HocVien hocVien;
}
