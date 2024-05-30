package com.example.demo_2.Services;

import com.example.demo_2.Model.HocSinh;
import com.example.demo_2.Repository.HocSinhRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HocSinhServices implements IHocSinhServices {

    @Autowired
    private HocSinhRepo hocSinhRepo;


    @Override
    public List<HocSinh> getAllHocSinh() {
        return hocSinhRepo.findAll();
    }

    @Override
    public HocSinh addNewHocSinh(HocSinh hocSinh) {
        hocSinhRepo.save(hocSinh);
        return hocSinh;
    }

    @Override
    public HocSinh deleteMotHocSinh(int id) {
        Optional<HocSinh> hocSinh = hocSinhRepo.findById(id);
        if (hocSinh.isEmpty()) {
            return null;
        }
        hocSinhRepo.delete(hocSinh.get());
        return hocSinh.get();
    }

    @Override
    public HocSinh remakeHocSinh(HocSinh hocSinh) {
        Optional<HocSinh> hocSinhRemake = hocSinhRepo.findById(hocSinh.getId());
        if (hocSinhRemake.isEmpty()) {
            return null;
        }
        HocSinh hs = hocSinhRemake.get();
        hs.setTenHocSinh(hocSinh.getTenHocSinh());
        hs.setNgaySinh(hocSinh.getNgaySinh());
        hocSinhRepo.save(hs);
        return hocSinh;
    }

    @Override
    public HocSinh getHocSinhById(int id) {
        Optional<HocSinh> getMotHocSinh = hocSinhRepo.findById(id);
        return getMotHocSinh.orElse(null);
    }

    @Override
    public List<HocSinh> getByBetween(int beginId, int endId) {
        if (beginId > endId) {
            int temp = beginId;
            beginId =endId;
            endId = temp;
        }

        List<HocSinh> resultList = new ArrayList<>();

        for (HocSinh hs : hocSinhRepo.findAll()) {
            if (hs.getId() >= beginId && hs.getId() <= endId) {
                resultList.add(hs);
            }
        }

        return resultList;
    }

}
