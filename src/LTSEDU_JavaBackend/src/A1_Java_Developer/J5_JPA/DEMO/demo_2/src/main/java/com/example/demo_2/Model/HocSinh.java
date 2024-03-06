package com.example.demo_2.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "hocsinhs")
public class HocSinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tenhocsinh")
    private String tenHocSinh;
    @Column(name = "ngaySinh")
    private LocalDate ngaySinh;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "hocsinh")
    @JsonManagedReference
    private Set<LopHocSinh> lopHocSinhs;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getTenHocSinh() {
        return tenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        this.tenHocSinh = tenHocSinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Set<LopHocSinh> getLopHocSinhs() {
        return lopHocSinhs;
    }

    public void setLopHocSinhs(Set<LopHocSinh> lopHocSinhs) {
        this.lopHocSinhs = lopHocSinhs;
    }
}
