package com.example.demo_2.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "lophocsinh")
public class LopHocSinh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lophocsinhid")
    private int lopHocSinhId;

    @Column(name = "lopid", insertable = false, updatable = false)
    private int lopId;

    @Column(name = "hocsinhid", insertable = false, updatable = false)
    private int hocSinhId;


    @ManyToOne
    @JoinColumn(name = "lopid")
    @JsonBackReference

    private Lop lop;

    @ManyToOne
    @JoinColumn(name = "hocsinhid")
    @JsonBackReference
    private HocSinh hocsinh;

    public int getLopHocSinhId() {
        return lopHocSinhId;
    }

    public void setLopHocSinhId(int lopHocSinhId) {
        this.lopHocSinhId = lopHocSinhId;
    }

    public int getLopId() {
        return lopId;
    }

    public void setLopId(int lopId) {
        this.lopId = lopId;
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

    public HocSinh getHocsinh() {
        return hocsinh;
    }

    public void setHocsinh(HocSinh hocsinh) {
        this.hocsinh = hocsinh;
    }


}
