package com.example.demo_2.Services;

import com.example.demo_2.Model.HocSinh;
import com.example.demo_2.Model.Lop;

import java.util.List;
import java.util.Set;

public interface ILopServices {
    public List<Lop> getAllClasses();

    public Lop findClassById(int Id);

    public Lop addNewClass(Lop lop);

    public Lop deleteClass(int Id);

    public Lop remakeClass(Lop lop);

    public Set<HocSinh> getHocSinhOfThisLop(int idLop);
}
