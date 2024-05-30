package com.example.demo_2.Services;

import com.example.demo_2.Model.HocSinh;

import java.util.List;

public interface IHocSinhServices {
    public List<HocSinh> getAllStudents();

    public HocSinh getStudentByID(int Id);

    public HocSinh addNewStudent(HocSinh hocSinh);
    public HocSinh deleteStudent(int Id);

    public HocSinh remakeStudent(HocSinh hocSinh);
}
