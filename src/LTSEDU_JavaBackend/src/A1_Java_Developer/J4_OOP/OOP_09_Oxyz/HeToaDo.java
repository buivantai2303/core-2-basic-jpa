package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_09_Oxyz;

import java.util.Scanner;

public class HeToaDo {
    private double X;
    private double Y;
    private double Z;

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getZ() {
        return Z;
    }

    public void setZ(double z) {
        Z = z;
    }

    public HeToaDo(double x, double y, double z) {
        X = x;
        Y = y;
        Z = z;
    }

    public HeToaDo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X2: ");
        setX(scanner.nextDouble());

        System.out.print("Enter Y2: ");
        setY(scanner.nextDouble());

        System.out.print("Enter Z2: ");
        setZ(scanner.nextDouble());
    }

    public void InThongTin() {
        System.out.println("Hệ tọa độ (X:Y:Z) = (" + getX() + ":" + getY() + ":" + getZ() + ")");
        System.out.println("Khoảng cách giữa hai điểm: ");
    }

    public double tinhKhoanhCach(HeToaDo diem) {
        return Math.sqrt(Math.pow(X - diem.getX(), 2) + Math.pow(Y - diem.getY(), 2) + Math.pow(Z - diem.getZ(), 2));
    }
}
