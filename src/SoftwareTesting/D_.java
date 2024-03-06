package SoftwareTesting;

import java.util.Scanner;

public class D_ {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a = DoubleHelper("Enter number a: ", "Error data type, Enter again");
        double b = DoubleHelper("Enter number b: ", "Error data type, Enter again");

        System.out.println("Result: " + (a+b));
    }

    public static double DoubleHelper(String Message, String Error) {
        System.out.print(Message);
        double Value = 0;

        try {
            Value = Double.parseDouble(scanner.nextLine());
            return Value;
        } catch (Exception e) {
            System.out.println(Error);
            scanner.nextLine();
            return DoubleHelper(Message, Error);
        }
    }
}
