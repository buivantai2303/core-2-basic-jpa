package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_16_ThoiGian;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class ThoiGian {
    private Scanner scanner = new Scanner(System.in);
    private int Ngay, Thang, Nam, Thu;
    boolean LaNamNhuan;

    public int getNgay() {
        return Ngay;
    }

    public void setNgay(int ngay) {
        Ngay = ngay;
        Calendar c = Calendar.getInstance();
        c.set(Nam, Thang - 1, Ngay);
        Thu = c.get(Calendar.DAY_OF_WEEK);
    }

    public int getThang() {
        return Thang;
    }

    public void setThang(int thang) {
        Thang = thang;
    }

    public int getNam() {
        return Nam;
    }

    public void setNam(int nam) {
        Nam = nam;
    }

    public int getThu() {
        return Thu;
    }

    public void setThu(int thu) {
        Thu = thu;
    }

    public boolean isLaNamNhuan() {
        return LaNamNhuan;
    }

    public void setLaNamNhuan(boolean laNamNhuan) {
        LaNamNhuan = (Nam % 4 == 0 && Nam % 100 != 0) || (Nam % 400 == 0);
    }

    public void TinhKhoangThoiGian(ThoiGian thoiGian) {
        LocalDate start = LocalDate.of(Nam, Thang, Ngay);
        LocalDate end = LocalDate.of(thoiGian.getNam(), thoiGian.getThang(), thoiGian.getNgay());
        Period period = Period.between(start, end);

        if (period.isZero()) {
            System.out.println("Hai thời điểm giống nhau.");
        } else {
            int years = period.getYears();
            int months = period.getMonths();
            int days = period.getDays();

            System.out.println("Khoảng thời gian giữa hai thời điểm là: "
                    + Math.abs(years) + " năm, " + Math.abs(months) + " tháng, " + Math.abs(days) + " ngày.");
        }
    }


    public ThoiGian(int ngay, int thang, int nam) {
        Ngay = ngay;
        Thang = thang;
        Nam = nam;
    }

    public ThoiGian (){
        NhapNam();
        NhapThang();
        NhapNgay();
    }

    public void NhapNgay(){
        int ngay;
        try {
            System.out.print("Nhập ngày: ");
            ngay = scanner.nextInt();

            if (isLaNamNhuan()){
                if (ngay >= 1 && ngay <= 29) {
                    setNgay(ngay);
                } else {
                    System.out.println("Ngày không hợp lệ cho năm nhuận. Nhập lại!");
                    NhapNgay();
                }
            } else {
                if (ngay >= 1 && ngay <= 28) {
                    setNgay(ngay);
                } else {
                    System.out.println("Ngày không hợp lệ cho năm không nhuận. Nhập lại!");
                    NhapNgay();
                }
            }
        } catch (Exception e) {
            System.out.println("Nhập sai kiểu dữ liệu. Nhập lại!");
            scanner.nextLine();
            NhapNgay();
        }
    }


    public void NhapThang(){
        boolean check = false;
        int thang;
        do {
            try {
                System.out.print("Nhập tháng: ");
                thang = scanner.nextInt();

                if (thang >= 1 && thang <= 12) {
                    setThang(thang);
                    check = true;
                } else {
                    System.out.println("Tháng không hợp lệ. Nhập lại!");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu dữ liệu. Nhập lại!");
                scanner.nextLine();
            }
        } while (!check);
    }

    public void NhapNam(){
        boolean check = false;
        int nam;
        do {
            try {
                System.out.print("Nhập năm: ");
                nam = scanner.nextInt();

                if (nam >= 1) {
                    setNam(nam);
                    setLaNamNhuan((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0));
                    check = true;
                } else {
                    System.out.println("Năm không hợp lệ. Nhập lại!");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu dữ liệu. Nhập lại!");
                scanner.nextLine();
            }
        } while (!check);
    }

    public void LayThongTin (){
        String checkNam, checkThu = null;

        if (getThu() == 1) {
            checkThu = "Chủ Nhật";
        }
                

        checkNam = isLaNamNhuan() ? "Là năm nhuận" : "Không là năm nhuận";
        System.out.println("Là thứ: " + checkThu);
        System.out.println("Thời gian hiện tại là: " + getNgay() + "/" + getThang() + "/" + getNam());
        System.out.println("- " + checkNam);

    }

}
