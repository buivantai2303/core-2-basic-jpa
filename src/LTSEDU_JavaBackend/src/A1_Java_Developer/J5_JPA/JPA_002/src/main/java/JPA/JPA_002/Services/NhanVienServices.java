package JPA.JPA_002.Services;

import JPA.JPA_002.Models.NhanVien;
import JPA.JPA_002.Repository.NhanVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienServices implements INhanVienServices {

    private final NhanVienRepo nhanVienRepo;

    @Autowired
    public NhanVienServices(NhanVienRepo nhanVienRepo) {
        this.nhanVienRepo = nhanVienRepo;
    }

    @Override
    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepo.findAll();
    }

    @Override
    public NhanVien getNhanVienById(int Id) {
        Optional<NhanVien> getEmployeeById = nhanVienRepo.findById(Id);
        return getEmployeeById.orElse(null);
    }

    @Override
    public NhanVien addNhanVien(NhanVien nhanVien) {
        nhanVienRepo.save(nhanVien);
        return nhanVien;
    }


    @Override
    public NhanVien modifyNhanVien(NhanVien nhanVien) {
        Optional<NhanVien> nhanVienOptional = nhanVienRepo.findById(nhanVien.getNhanVienId());

        if (nhanVienOptional.isEmpty()) {
            return null;
        }

        NhanVien newNhanVienModify = nhanVienOptional.get();
        newNhanVienModify.setHoTen(nhanVien.getHoTen());
        newNhanVienModify.setNgaySinh(nhanVien.getNgaySinh());
        newNhanVienModify.setDiaChi(nhanVien.getDiaChi());
        newNhanVienModify.setSoDienThoai(nhanVien.getSoDienThoai());
        newNhanVienModify.setEmail(nhanVien.getEmail());
        newNhanVienModify.setHeSoLuong(nhanVien.getHeSoLuong());
        newNhanVienModify.setPhanCongs(nhanVien.getPhanCongs());

        return newNhanVienModify;
    }

    @Override
    public NhanVien removeNhanVien(int Id) {
        Optional<NhanVien> nhanVienOptional = nhanVienRepo.findById(Id);

        if (nhanVienOptional.isEmpty()) {
            return null;
        }

        nhanVienRepo.delete(nhanVienOptional.get());
        return nhanVienOptional.get();
    }

}
