package JPA.JPA_002.Services;

import JPA.JPA_002.Models.DuAn;

import java.util.List;

public interface IDuAnServices {

    List<DuAn> getAllDuAn();

    DuAn getDuAnById(int Id);

    DuAn addNewDuAn(DuAn duAn);

    DuAn modifyDuAn(DuAn duAn);

    DuAn removeDuAn(int Id);

}
