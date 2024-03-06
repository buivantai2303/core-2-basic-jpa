package JPA.JPA_002.Controllers;

import JPA.JPA_002.Models.NhanVien;
import JPA.JPA_002.Models.PhanCong;
import JPA.JPA_002.Repository.NhanVienRepo;
import JPA.JPA_002.Repository.PhanCongRepo;
import JPA.JPA_002.Services.NhanVienServices;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "api/version/1.0")
public class NhanVienController {

    private final NhanVienServices nhanVienServices;
    private final PhanCongRepo phanCongRepo;
    private final NhanVienRepo nhanVienRepo;


    @Autowired
    public NhanVienController(NhanVienServices nhanVienServices, PhanCongRepo phanCongRepo, NhanVienRepo nhanVienRepo) {
        this.nhanVienServices = nhanVienServices;
        this.phanCongRepo = phanCongRepo;
        this.nhanVienRepo = nhanVienRepo;
    }


    private Gson GsonDateFormatter() {
        return new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, (JsonDeserializer<LocalDate>)
                        (json, type, jsonDeserializationContext) -> LocalDate.parse(json.getAsJsonPrimitive()
                                .getAsString()))
                .create();
    }

    @GetMapping(value = "allEmployee")
    public List<NhanVien> getAllNhanVien() {
        return nhanVienServices.getAllNhanVien();
    }

    @GetMapping(value = "employeeDetail")
    public NhanVien getNhanVien(@RequestParam int Id) {
        return nhanVienServices.getNhanVienById(Id);
    }

    @PostMapping(value = "newEmployee")
    public NhanVien addNhanVien(@RequestBody String nhanVien) {
        Gson gson = GsonDateFormatter();
        NhanVien newNhanVien = gson.fromJson(nhanVien, NhanVien.class);
        return nhanVienServices.addNhanVien(newNhanVien);
    }

    @PutMapping(value = "modifyEmployee")
    public NhanVien modifyNhanVien(@RequestBody String nhanVien) {
        Gson gson = new Gson();
        NhanVien modifyNhanVien = gson.fromJson(nhanVien, NhanVien.class);

        return nhanVienServices.modifyNhanVien(modifyNhanVien);
    }

    @DeleteMapping(value = "deleteEmployee")
    public NhanVien deleteNhanVien(@RequestParam int Id) {
        return nhanVienServices.removeNhanVien(Id);
    }

    public void tinhLuong() {
        List<PhanCong> phanCongList = phanCongRepo.findAll();
        List<NhanVien> nhanVienList = nhanVienRepo.findAll();

        nhanVienList.forEach(x -> {
            double tongGio = 0;
            for (PhanCong phanCong : phanCongList) {
                if (x.getNhanVienId() == phanCong.getNhanVien().getNhanVienId()) {
                    tongGio += phanCong.getSoGioLam();
                }
            }

            double luong = tongGio * 15 * x.getHeSoLuong();

            System.out.println(x.getHoTen() + ":" + luong);
        });
    }

    @GetMapping(value = "getEmployeeAndSalary")
    public List<NhanVien> Get() {
        tinhLuong();
        return nhanVienRepo.findAll();
    }
}
