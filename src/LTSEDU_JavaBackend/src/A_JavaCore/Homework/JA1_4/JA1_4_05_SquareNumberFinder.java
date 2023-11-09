package A_JavaCore.Homework.JA1_4;

import java.util.Scanner;

public class JA1_4_05_SquareNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int x = scanner.nextInt();

        int result = 1;

        for (int i = 3; i < x; i++){
            int square = (int) Math.sqrt(i);

            if (square * square == i){
                result *= i;
            }

        }

        System.out.println("The result: " + result);

    }


}
