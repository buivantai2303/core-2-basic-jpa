package LTSEDU_JavaBackend.src.A1_Java_Developer.J1_JavaCore.JA1_4;

import java.util.Scanner;

public class JA1_4_01_PrintFrom_1to50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter your number : ");
//        int Num = scanner.nextInt();
        int Num = 50;

        for (int i = 1; i<= Num; i++ ){
            System.out.println(i);
        }
    }
}
