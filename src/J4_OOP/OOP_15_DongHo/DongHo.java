package J4_OOP.OOP_15_DongHo;

import java.util.Scanner;

public class DongHo {
    private Scanner scanner = new Scanner(System.in);
    private int Gio, Phut, Giay;
    private Boolean LaBuoiSang;

    public int getGio() {
        return Gio;
    }

    public void setGio(int gio) {
        Gio = gio;
    }

    public int getPhut() {
        return Phut;
    }

    public void setPhut(int phut) {
        Phut = phut;
    }

    public int getGiay() {
        return Giay;
    }

    public void setGiay(int giay) {
        Giay = giay;
    }

    public Boolean getLaBuoiSang() {
        return LaBuoiSang = Gio < 12;
    }

    private int NhapGio() {
        int hour;
        do {
            System.out.print("- Nhập giờ: ");
            if (scanner.hasNextInt()) {
                hour = scanner.nextInt();
                if (hour > 24 || hour < 0) {
                    System.out.println("[!] Nhập sai khoảng giờ");
                }
            } else {
                System.out.println("Nhập sai kiểu dữ liệu!");
                hour = -1;
            }
            scanner.nextLine();
        } while (hour > 23 || hour < 0);

        return Gio = hour;
    }

    private int NhapPhut() {
        int min;
        do {
            System.out.print("- Nhập phút: ");
            if (scanner.hasNextInt()) {
                min = scanner.nextInt();
                if (min > 59 || min < 0) {
                    System.out.println("[!] Nhập sai khoảng phút");
                }
            } else {
                System.out.println("Nhập sai kiểu dữ liệu!");
                min = -1;
            }
            scanner.nextLine();
        } while (min > 59 || min < 0);

        return Phut = min;
    }

    private int NhapGiay() {
        int sec;
        do {
            System.out.print("- Nhập giây: ");
            if (scanner.hasNextInt()) {
                sec = scanner.nextInt();
                if (sec > 59 || sec < 0) {
                    System.out.println("[!] Nhập sai khoảng giây");
                }
            } else {
                System.out.println("Nhập sai kiểu dữ liệu!");
                sec = -1;
            }
            scanner.nextLine();
        } while (sec > 59 || sec < 0);

        return Giay = sec;
    }

    public DongHo(int gio, int phut, int giay) {
        Gio = gio;
        Phut = phut;
        Giay = giay;
    }

    public DongHo() {
        System.out.println("Nhập thông tin: ");
        NhapGio();
        NhapPhut();
        NhapGiay();
    }

    public void LayThongTin() {
        System.out.println(getGio() + ":" + getPhut() + ":" + getGiay());

        if (getLaBuoiSang()) {
            System.out.println("Bây giờ là buổi sáng");
        } else {
            System.out.println("Bây giờ là buổi chiều");
        }
    }

    public void LayKhoangThoiGian(DongHo n) {
        // Tính tổng số giây
        long tongSoGiay1 = Gio * 3600L + Phut * 60L + Giay;
        long tongSoGiay2 = n.getGio() * 3600L + n.getPhut() * 60L + n.getGiay();
        long khoangThoiGianGiay = Math.abs(tongSoGiay2 - tongSoGiay1);

        // Tính giờ, phút, giây từ tổng số giây
        int kGio = (int) (khoangThoiGianGiay / 3600);
        int kPhut = (int) (khoangThoiGianGiay % 3600) / 60;
        int kGiay = (int) (khoangThoiGianGiay % 60);

        // Xử lý trường hợp thời gian âm
        if (tongSoGiay2 < tongSoGiay1) {
            System.out.print("-");  // Biểu thị thời gian âm
        }

        System.out.println("Khoang thoi gian: " + kGio + ":" + kPhut + ":" + kGiay);
    }

}
