package com.example.demo_2.Services;

import com.example.demo_2.Model.HocSinh;

import java.util.List;

public interface IHocSinhServices {
    List<HocSinh> getAllHocSinh();

    HocSinh addNewHocSinh(HocSinh hocSinh);

    HocSinh deleteMotHocSinh(int id);

    HocSinh remakeHocSinh(HocSinh hocSinh);

    HocSinh getHocSinhById(int id);

    List<HocSinh> getByBetween(int beginId, int endId);

}
