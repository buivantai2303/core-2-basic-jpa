package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_4_03_FindTheLargestOddDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;

        System.out.print("Enter your number to find the largest odd divisor: ");
        int number = scanner.nextInt();

        if (number > 0){
            for (int i = 0; i < number; i++){
                if (i % 2 == 1){
                    if (number % i == 0){
                        temp = i;
                    }
                }
            }
        } else {
            System.out.println("Wrong input");
        }
        System.out.println("The largest odd divisor: " + temp);
    }
}
