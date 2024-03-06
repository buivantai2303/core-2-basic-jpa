package com.example.demo_2.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name = "DanhSachHocSinh")
public class HocSinh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hoTen")
    @Size(min = 2, max = 20, message = "Name needs to be between 2 and 20 characters")
    private String hoTen;

    @Column(name = "NamSinh")
    @Max(value = 2014, message = "Maximum birth year is 2014")
    @Min(value = 2002, message = "Minimum birth year is 2002")
    private int namSinh;

    @Column(name = "QueQuan")
    private String queQuan;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "hocSinh")
    @JsonManagedReference
    private Set<LopHocSinh> lopHocSinhs;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }


    public Set<LopHocSinh> getLopHocSinhs() {
        return lopHocSinhs;
    }

    public void setLopHocSinhs(Set<LopHocSinh> lop) {
        this.lopHocSinhs = lop;
    }
}
