package LTSEDU_JavaBackend.src.A1_Java_Developer.J1_JavaCore.JA1_3;

import java.util.Scanner;

public class JA1_3_05_LineChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter (a1): ");
        double a1 = scanner.nextDouble();
        System.out.print("Enter (b1): ");
        double b1 = scanner.nextDouble();

        System.out.print("Enter (a2): ");
        double a2 = scanner.nextDouble();
        System.out.print("Enter (b2): ");
        double b2 = scanner.nextDouble();

        if (a1 * a2 == -1){
            System.out.println("2 đường thẳng vuông góc");
        } else if (a1 != a2){
            System.out.println("2 đường thẳng cắt nhau");
        } else if (a1 == a2 && b1 != b2){
            System.out.println("2 đường thẳng song song");
        } else if (a1 == a2 && b1 == b2){
            System.out.println("2 đường thẳng trùng nhau");
        } else {
            System.out.println("Wrong");
        }


    }
}
