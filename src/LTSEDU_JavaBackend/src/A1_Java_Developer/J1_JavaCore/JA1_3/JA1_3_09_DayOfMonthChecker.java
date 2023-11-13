package A1_Java_Developer.J1_JavaCore.JA1_3;
import java.util.Scanner;

//Cho hai biến month, year đại diện cho tháng và năm. Cho năm nằm trong khoảng từ 1000  đến 2022,
//        nếu thỏa mãn thì in ra các ngày trong tháng, kể cả năm nhuận.
//        Nếu không phải thì in ra không hợp lệ.

public class JA1_3_09_DayOfMonthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month, year;


        do {
            System.out.print("Enter your year: ");
            year = scanner.nextInt();
            System.out.print("Enter your month: ");
            month = scanner.nextInt();

            if (year < 1000 || year > 2022){
                System.out.println("Enter again!");
            }

            switch (month){
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("31 days");
                    break;
                case 4, 6, 9, 11:
                    System.out.println("30 days");
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

        } while (year >= 1000 && year <= 2022);



    }
}