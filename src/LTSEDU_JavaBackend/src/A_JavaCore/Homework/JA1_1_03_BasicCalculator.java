package A_JavaCore.Homework;
import java.util.Scanner;

public class JA1_1_03_BasicCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scan.nextDouble();
        System.out.print("Enter b: ");
        double b = scan.nextDouble();

        Calculator(a, b);
    }

    public static void Calculator (double a, double b){
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

}
