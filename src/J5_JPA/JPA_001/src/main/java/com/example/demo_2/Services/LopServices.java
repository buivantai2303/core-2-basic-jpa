package com.example.demo_2.Services;

import com.example.demo_2.Model.HocSinh;
import com.example.demo_2.Model.Lop;
import com.example.demo_2.Model.LopHocSinh;
import com.example.demo_2.Repository.LopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class LopServices implements ILopServices {
    @Autowired
    private LopRepo lopRepo;

    @Override
    public List<Lop> getAllClasses() {
        return lopRepo.findAll();
    }

    @Override
    public Lop findClassById(int Id) {
        Optional<Lop> getClass = lopRepo.findById(Id);
        return getClass.orElse(null);
    }

    @Override
    public Lop addNewClass(Lop lop) {
        lopRepo.save(lop);
        return lop;
    }

    @Override
    public Lop deleteClass(int Id) {
        Optional<Lop> deleteOptional = lopRepo.findById(Id);
        if (deleteOptional.isEmpty()) {
            return null;
        }
        lopRepo.delete(deleteOptional.get());
        return deleteOptional.get();
    }

    @Override
    public Lop remakeClass(Lop lop) {
        Optional<Lop> remakeOptional = lopRepo.findById(lop.getId());
        if (remakeOptional.isEmpty()) {
            return null;
        }

        Lop lopRemake = remakeOptional.get();
        lopRemake.setTenLop(lop.getTenLop());
        lopRemake.setSiSo(lop.getSiSo());
        lopRepo.save(lopRemake);

        return lop;
    }

    @Override
    public Set<HocSinh> getHocSinhOfThisLop(int idLop) {
        Optional<Lop> optionalLop = lopRepo.findById(idLop);

        if (optionalLop.isEmpty()) {
            return null; // Hoặc có thể trả về một Set rỗng tùy thuộc vào yêu cầu của bạn
        }

        Lop lop = optionalLop.get();
        Set<LopHocSinh> lopHocSinhs = lop.getLopHocSinhs();
        Set<HocSinh> resultList = new HashSet<>();

        for (LopHocSinh hs : lopHocSinhs) {
            resultList.add(hs.getHocSinh());
        }

        if (resultList.isEmpty()) {
            return null;
        }

        return resultList;
    }
}
