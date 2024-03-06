package com.example.demo_2.Services;

import com.example.demo_2.Model.HocSinh;
import com.example.demo_2.Model.Lop;
import com.example.demo_2.Model.LopHocSinh;
import com.example.demo_2.Repository.LopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class LopServices implements ILopServices {

    @Autowired
    private LopRepo lopRepo;
    @Override
    public Set<HocSinh> getHocSinhOfThisLop(int idLop) {
        Lop lop = lopRepo.findById(idLop).get();
        Set<LopHocSinh> lopHocSinhs = lop.getLopHocSinhs();
        Set<HocSinh> resultList = new HashSet<>();

        for (LopHocSinh hs : lopHocSinhs) {
            resultList.add(hs.getHocsinh());
        }

        return resultList;
    }


//
//    @Override
//    public Set<HocSinh> getAllHocSinhOfThisClass (int idLop) {
//        Lop lop = lopRepo.findById(idLop).get();
//        return lop.getHocSinhs();
//    }
}
