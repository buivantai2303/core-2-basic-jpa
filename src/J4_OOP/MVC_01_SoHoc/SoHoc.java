package J4_OOP.MVC_01_SoHoc;

public class SoHoc {
    private int GiaTri;
    private boolean LaSoChan, LaSoNguyenTo, LaSoDoiXung;

    public int getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(int giaTri) {
        GiaTri = giaTri;
    }

    public boolean isLaSoChan() {
        return LaSoChan = KTChan();
    }

    public boolean isLaSoNguyenTo() {
        return LaSoNguyenTo = KTNguyenTo();
    }

    public boolean isLaSoDoiXung() {
        return LaSoDoiXung = KTDoiXung();
    }

    public SoHoc(int giaTri) {
        GiaTri = giaTri;
    }

    public SoHoc() {
        setGiaTri(InputHelper.IntHelper("Nhập số cần thêm: ", "Lỗi nhập!"));
    }

    public boolean KTDoiXung() {
        int GiaTriGoc = getGiaTri(), GiaTriMoi = 0, temp;
        while (GiaTriGoc != 0) {
            temp = GiaTriGoc % 10;
            GiaTriMoi = GiaTriMoi * 10 + temp;
            GiaTriGoc /= 10;
        }

        return getGiaTri() == GiaTriMoi;
    }

    public boolean KTNguyenTo () {
        if (getGiaTri() < 2) return false;
        for (int i = 2; i*i <= getGiaTri(); i++) {
            if (getGiaTri() % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean KTChan() {
        return getGiaTri() % 2 == 0;
    }
}
