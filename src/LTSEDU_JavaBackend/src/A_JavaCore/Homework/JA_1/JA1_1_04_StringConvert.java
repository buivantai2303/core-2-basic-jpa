package A_JavaCore.Homework.JA_1;

import java.util.Scanner;

public class JA1_1_04_StringConvert {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        char c = scanner.next().charAt(0);
        System.out.print("Enter d: ");
        Boolean d = scanner.nextBoolean();

        String str = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d);
        System.out.println(str);
    }
}
