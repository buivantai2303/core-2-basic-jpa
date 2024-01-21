package A1_Java_Developer.J1_JavaCore.JA1_3;

import java.util.Scanner;

public class JA1_3_08_SeasonChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;

        do {
            System.out.print("Enter your month: ");
            month = scanner.nextInt();

            if (month >= 13 || month <=0){
                System.out.println("Not a month of the year");
            }

            switch (month){

                case 1, 2, 3:
                    System.out.println("Spring");
                    break;
                case 4, 5, 6:
                    System.out.println("Summer");
                    break;
                case 7, 8, 9:
                    System.out.println("Autumn");
                    break;
                case 10, 11, 12:
                    System.out.println("Winter");
                    break;
            }
            break;
        } while (month <= 12);
    }
}
