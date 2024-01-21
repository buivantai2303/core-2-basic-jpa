package LTSEDU_JavaBackend.src.A1_Java_Developer.J1_JavaCore.JA1_4;

import java.util.Scanner;

public class JA1_4_06_Check_If_The_Number_Is_Divisible_ByThree_Or_Not {
    public static void main(String[] args) {
        int s = 0, a;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int Num = scanner.nextInt();

        while (Num < 0){
            a = Num % 10;
            s += a;
            Num = Num / 10;
        }

        if (s % 3 == 0){
            System.out.println("The number is divisible by three");
        } else {
            System.out.println("Number not divisible by three");
        }
    }
}
