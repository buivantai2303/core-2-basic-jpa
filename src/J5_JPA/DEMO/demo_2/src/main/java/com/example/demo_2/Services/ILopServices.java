package com.example.demo_2.Services;

import com.example.demo_2.Model.HocSinh;

import java.util.Set;

public interface ILopServices {
    //    public Set<HocSinh> getAllHocSinhOfThisClass(int idLop);
    public Set<HocSinh> getHocSinhOfThisLop(int idLop);
}
