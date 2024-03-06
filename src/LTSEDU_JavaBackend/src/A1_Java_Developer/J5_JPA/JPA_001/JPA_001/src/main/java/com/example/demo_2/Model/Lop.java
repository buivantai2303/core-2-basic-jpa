package com.example.demo_2.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name = "danhSachLop")
public class Lop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Size(max = 10, message = "Class name maximum has 10 characters")
    @Column(name = "tenLop")
    private String tenLop;

    @Column(name = "siSo")
    @Max(value = 20, message = "Maximum has 20 students")
    private int siSo;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "lop")
    @JsonManagedReference
    private Set<LopHocSinh> lopHocSinhs;
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public Set<LopHocSinh> getLopHocSinhs() {
        return lopHocSinhs;
    }

    public void setLopHocSinhs(Set<LopHocSinh> lopHocSinhs) {
        this.lopHocSinhs = lopHocSinhs;
    }
}
