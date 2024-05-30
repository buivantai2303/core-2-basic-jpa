package J1_JavaCore.JA1_5;

import java.util.Scanner;

public class JA1_5_10_EngEng_AmericanEng {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = scanner.nextLine();

        int tempAA = 0;
        int tempAM = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's' || str.charAt(i) == 'S'){
                tempAA++;
            }
            if (str.charAt(i) == 't' || str.charAt(i) == 'T'){
                tempAM++;
            }
        }

        if (tempAM >= tempAA) {
            System.out.println("American English");
        } else {
            System.out.println("England English");
        }

    }
}
