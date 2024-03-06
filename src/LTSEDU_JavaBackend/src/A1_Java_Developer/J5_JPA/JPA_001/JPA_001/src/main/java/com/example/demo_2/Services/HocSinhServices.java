package com.example.demo_2.Services;

import com.example.demo_2.Model.HocSinh;
import com.example.demo_2.Repository.HocSinhRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HocSinhServices implements IHocSinhServices {

    @Autowired
    private HocSinhRepo hocSinhRepo;


    @Override
    public List<HocSinh> getAllStudents() {
        return hocSinhRepo.findAll();
    }

    @Override
    public HocSinh getStudentByID(int Id) {
        Optional<HocSinh> hocSinhOptional = hocSinhRepo.findById(Id);
        return hocSinhOptional.orElse(null);
    }

    @Override
    public HocSinh addNewStudent(HocSinh hocSinh) {
        hocSinhRepo.save(hocSinh);
        return hocSinh;
    }

    @Override
    public HocSinh deleteStudent(int Id) {
        Optional<HocSinh> hocSinhOptional = hocSinhRepo.findById(Id);
        if (hocSinhOptional.isEmpty()) {
            return null;
        }
        hocSinhRepo.delete(hocSinhOptional.get());
        return hocSinhOptional.get();
    }

    @Override
    public HocSinh remakeStudent(HocSinh hocSinh) {
        Optional<HocSinh> hocSinhOptional = hocSinhRepo.findById(hocSinh.getId());
        if (hocSinhOptional.isEmpty()) {
            return null;
        }
        HocSinh hs = hocSinhOptional.get();
        hs.setHoTen(hocSinh.getHoTen());
        hs.setId(hocSinh.getId());
        hs.setNamSinh(hocSinh.getNamSinh());
        hs.setQueQuan(hocSinh.getQueQuan());
        hocSinhRepo.save(hs);
        return hocSinh;
    }

}
