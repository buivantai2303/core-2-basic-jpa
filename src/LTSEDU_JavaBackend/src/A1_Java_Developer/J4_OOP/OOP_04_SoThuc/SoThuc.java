package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_04_SoThuc;

import java.util.Scanner;

public class SoThuc {
    private double GiaTri;
    private boolean laSoDuong;

    private double getGiaTri() {
        return GiaTri;
    }

    private void setGiaTri(double giaTri) {
        GiaTri = giaTri;
    }

    private boolean isLaSoDuong() {
        setLaSoDuong();
        return laSoDuong;
    }


    private void setLaSoDuong() {
        laSoDuong = GiaTri > 0;
    }


    public SoThuc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value: ");
        GiaTri = scanner.nextDouble();
    }

    public SoThuc TimMax(SoThuc a, SoThuc b, SoThuc c) {
        if (Math.max(a.getGiaTri(), Math.max(b.getGiaTri(), c.getGiaTri())) == a.getGiaTri()) {
            return a;
        } else if (Math.max(a.getGiaTri(), Math.max(b.getGiaTri(), c.getGiaTri())) == b.getGiaTri()) {
            return b;
        } else {
            return c;
        }
    }

    public double TinhCanBacN(SoThuc CanBacN) {
        return GiaTri = Math.pow(getGiaTri(), (1 / CanBacN.getGiaTri()));
    }


    public void InThongTin() {
        System.out.println("Result: " + GiaTri + ", " + isLaSoDuong() + " is a positive number");
    }


    public SoThuc(double giaTri, boolean laSoDuong) {
        GiaTri = giaTri;
        this.laSoDuong = laSoDuong;
    }
}
