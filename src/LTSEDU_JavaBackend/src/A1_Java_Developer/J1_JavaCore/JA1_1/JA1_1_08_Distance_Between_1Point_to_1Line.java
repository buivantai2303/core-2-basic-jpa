package LTSEDU_JavaBackend.src.A1_Java_Developer.J1_JavaCore.JA1_1;

import java.util.Scanner;

public class JA1_1_08_Distance_Between_1Point_to_1Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bài toán có điểm A(x:y)");
        System.out.print("Nhập hoành độ x: ");
        double x = scanner.nextDouble();
        System.out.print("Nhập tung độ y: ");
        double y = scanner.nextDouble();

        System.out.println("Và đường thẳng ax + by + c = 0: ");
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        double result = (Math.abs(a*x + b*y + c) / (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))));
        System.out.println("Khoảng cách từ điểm A(" + x + ":" + y + ")" + "đến đường thẳng " + a + "x + " + b + "y + " + c + " = 0 là: " + result);

    }
}
