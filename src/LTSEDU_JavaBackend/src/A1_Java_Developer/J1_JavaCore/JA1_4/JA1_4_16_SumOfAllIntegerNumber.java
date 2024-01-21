package LTSEDU_JavaBackend.src.A1_Java_Developer.J1_JavaCore.JA1_4;

import java.util.Scanner;

public class JA1_4_16_SumOfAllIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, result = 0;

        System.out.print("Enter your number: ");
        num = scanner.nextInt();

        while (num > 0){
            int temp = num % 10;
            result += temp;
            num /= 10;
        }


        System.out.println("Sum of all number of integer number: " + result);
    }
}
