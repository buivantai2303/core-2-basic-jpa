package J3_JavaMethods.JA3_2;

import java.util.Scanner;

public class JA3_2_04_FindSmallestNumberOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        System.out.println("Smallest number: " + smallestNumber(a, b, c));
    }

    public static double smallestNumber(double a, double b, double c) {
        return Math.min(Math.min(a, b), Math.min(b, c));
    }
}
