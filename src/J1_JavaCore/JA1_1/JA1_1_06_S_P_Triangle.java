package J1_JavaCore.JA1_1;

import java.util.Scanner;

public class JA1_1_06_S_P_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your radius: ");
        double radius = scanner.nextDouble();

        double S = Double.parseDouble(String.format("%.2f", Math.PI * radius * radius));
        double P = Double.parseDouble(String.format("%.2f", 2 * Math.PI * radius));


        System.out.println("S of triangle is: " + S);
        System.out.println("P of triangle is: " + P);
    }
}
