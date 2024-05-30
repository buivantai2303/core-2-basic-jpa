package JPA.JPA_002.Services;

import JPA.JPA_002.Models.PhanCong;
import JPA.JPA_002.Repository.PhanCongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhanCongServices implements IPhanCongServices{

    private final PhanCongRepo phanCongRepo;

    @Autowired
    public PhanCongServices(PhanCongRepo phanCongRepo) {
        this.phanCongRepo = phanCongRepo;
    }


    @Override
    public List<PhanCong> getAllPhanCong() {
        return phanCongRepo.findAll();
    }


    @Override
    public PhanCong getPhanCongTheoId(int Id) {
        Optional<PhanCong> phanCongOptional = phanCongRepo.findById(Id);

        return phanCongOptional.orElse(null);
    }


    @Override
    public PhanCong addNewPhanCong(PhanCong phanCong) {
        phanCongRepo.save(phanCong);
        return phanCong;
    }


    @Override
    public PhanCong modifyPhanCong(PhanCong phanCong) {
        Optional<PhanCong> phanCongOptional = phanCongRepo.findById(phanCong.getPhanCongId());

        if (phanCongOptional.isEmpty()) {
            return null;
        }

        PhanCong newPhanCong = phanCongOptional.get();
        newPhanCong.setDuAn(phanCong.getDuAn());
        newPhanCong.setNhanVien(phanCong.getNhanVien());
        newPhanCong.setSoGioLam(phanCong.getSoGioLam());
        phanCongRepo.save(newPhanCong);
        return newPhanCong;
    }


    @Override
    public PhanCong removePhanCong(int Id) {
        Optional<PhanCong> phanCongOptional = phanCongRepo.findById(Id);

        if (phanCongOptional.isEmpty()) {
            return null;
        }

        phanCongRepo.delete(phanCongOptional.get());
        return phanCongOptional.get();
    }
}
