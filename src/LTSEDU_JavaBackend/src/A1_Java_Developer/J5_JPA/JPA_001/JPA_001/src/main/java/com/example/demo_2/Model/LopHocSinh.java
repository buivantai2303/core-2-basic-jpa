package com.example.demo_2.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "lophocsinh")
public class LopHocSinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lopHocSinhId")
    private int lopHocSinhId;

    @Column(name = "lopid", insertable = false, updatable = false)
    private int lopID;


    @Column(name = "hocsinhid", insertable = false, updatable = false)
    private int hocSinhId;


    @ManyToOne
    @JsonBackReference
    private Lop lop;

    @ManyToOne
    @JsonBackReference
    private HocSinh hocSinh;


    public int getLopHocSinhId() {
        return lopHocSinhId;
    }

    public void setLopHocSinhId(int lopHocSinhId) {
        this.lopHocSinhId = lopHocSinhId;
    }

    public int getLopID() {
        return lopID;
    }

    public void setLopID(int lopID) {
        this.lopID = lopID;
    }

    public int getHocSinhId() {
        return hocSinhId;
    }

    public void setHocSinhId(int hocSinhId) {
        this.hocSinhId = hocSinhId;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }
}
