package com.example.demo_2.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "lops")
public class Lop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tenLop")
    private String tenLop;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lop")
//    @JsonManagedReference
//    private Set<HocSinh> hocSinhs;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lop")
    @JsonManagedReference
    private Set<LopHocSinh> lopHocSinhs;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

//    public Set<HocSinh> getHocSinhs() {
//        return hocSinhs;
//    }
//
//    public void setHocSinhs(Set<HocSinh> hocSinhs) {
//        this.hocSinhs = hocSinhs;
//    }


    public Set<LopHocSinh> getLopHocSinhs() {
        return lopHocSinhs;
    }

    public void setLopHocSinhs(Set<LopHocSinh> lopHocSinhs) {
        this.lopHocSinhs = lopHocSinhs;
    }
}
