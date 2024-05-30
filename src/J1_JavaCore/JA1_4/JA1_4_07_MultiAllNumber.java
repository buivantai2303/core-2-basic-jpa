package J1_JavaCore.JA1_4;

import java.util.Scanner;

public class JA1_4_07_MultiAllNumber {
    public static void main(String[] args) {
        int count = 1, END;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int Num = scanner.nextInt();

        while (Num>0){
            END = Num % 10;
            count *= END;
            Num /= 10;
        }

        System.out.println("Num: " + count);
    }
}
