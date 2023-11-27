package A1_Java_Developer.J2_JavaCollection;

import java.util.Arrays;
import java.util.Scanner;

public class JA2_1_14_EvenNumberFullChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("hập chuỗi số cách nhau bằng dấu phẩy: ");
        String input = scanner.nextLine();

        String[] numberString = input.split("\\W+");

        int[] numbersArray = new int[numberString.length];

        for (int i = 0; i < numberString.length; i++) {
            numbersArray[i] = Integer.parseInt(numberString[i]);
        }

        System.out.println("- Default array: " + Arrays.toString(numbersArray));
        System.out.print("- Even array: ");


        int failCount = 0;
        for (int j : numbersArray) {
            if (CheckEven(j)) {
                System.out.print(j + ", ");
                failCount++;
            }
        }

        if (failCount == 0){
            System.out.println("Not found even element");
        }
    }

    public static boolean CheckEven(int x) {
        while (x > 0) {
            int temp = x % 10;
            if (temp % 2 == 0) {
                return true;
            }
            x /= 10;

        } return false;
    }
}
