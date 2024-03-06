package JPA.JPA_002.Services;

import JPA.JPA_002.Models.DuAn;
import JPA.JPA_002.Repository.DuAnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DuAnServices implements IDuAnServices {

    private final DuAnRepo duAnRepo;

    @Autowired
    public DuAnServices(DuAnRepo duAnRepo) {
        this.duAnRepo = duAnRepo;
    }

    @Override
    public List<DuAn> getAllDuAn() {
        return duAnRepo.findAll();
    }

    @Override
    public DuAn getDuAnById(int Id) {
        Optional<DuAn> duAnOptional = duAnRepo.findById(Id);
        return duAnOptional.orElse(null);
    }

    @Override
    public DuAn addNewDuAn(DuAn duAn) {
        duAnRepo.save(duAn);
        return duAn;
    }

    @Override
    public DuAn modifyDuAn(DuAn duAn) {
        Optional<DuAn> duAnOptional = duAnRepo.findById(duAn.getDuAnId());

        if (duAnOptional.isEmpty()) {
            return null;
        }

        DuAn newDuAn = duAnOptional.get();
        newDuAn.setTenDuAn(duAn.getTenDuAn());
        newDuAn.setMoTa(duAn.getMoTa());
        newDuAn.setGhiChu(duAn.getGhiChu());
        newDuAn.setPhanCongs(duAn.getPhanCongs());
        return newDuAn;
    }

    @Override
    public DuAn removeDuAn(int Id) {
        Optional<DuAn> duAnOptional = duAnRepo.findById(Id);

        if (duAnOptional.isEmpty()) {
            return null;
        }

        duAnRepo.delete(duAnOptional.get());

        return duAnOptional.get();
    }
}
