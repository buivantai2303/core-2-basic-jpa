package A1_Java_Developer.J1_JavaCore.JA1_3;

import java.util.Scanner;

public class JA1_3_10_DayOfMonthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month, year;


        do {
            System.out.print("Enter your year: ");
            year = scanner.nextInt();
            System.out.print("Enter your month: ");
            month = scanner.nextInt();

            if (month <= 0 || month > 12){
                System.out.println("Wrong month, Enter again!");
            }

            switch (month){
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("Tháng " + month + " Năm " + year + " có 31 ngày");
                    System.out.println();
                    break;
                case 4, 6, 9, 11:
                    System.out.println("Tháng " + month + " Năm " + year + " có 30 ngày");
                    System.out.println();
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                        System.out.println("Tháng " + month + " Năm " + year + " có 29 ngày");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Tháng " + month + " Năm " + year + " có 28 ngày");
                        System.out.println();
                    }
                    break;
            }

        } while (month >= 1 && month <= 12);



    }
}
