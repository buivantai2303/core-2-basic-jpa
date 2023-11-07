package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_1_07_Function_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your value: ");
        int value = scanner.nextInt();

        String result = String.valueOf(Double.parseDouble(String.format("%.2f", Math.pow(value, 2) + 3 * value + 2)));

        System.out.println("The result is: " + result);
    }
}
