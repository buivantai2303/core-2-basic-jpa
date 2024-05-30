package JPA.JPA_002.Services;

import JPA.JPA_002.Models.PhanCong;

import java.util.List;

public interface IPhanCongServices {
    List<PhanCong> getAllPhanCong();

    PhanCong getPhanCongTheoId(int Id);

    PhanCong addNewPhanCong(PhanCong phanCong);

    PhanCong modifyPhanCong(PhanCong phanCong);

    PhanCong removePhanCong(int Id);
}
