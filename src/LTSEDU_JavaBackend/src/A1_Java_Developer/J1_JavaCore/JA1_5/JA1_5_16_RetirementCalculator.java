package A1_Java_Developer.J1_JavaCore.JA1_5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

//Cho biết thông tin ông Nguyễn Văn A sinh ngày 5/1/1980.
//        Hãy hiển thị ra màn hình chi tiết thông tin và ngày về hưu của của ông A.
//        Biết rằng ông A sẽ về hưu khi 60 tuổi.
//
//        Đầu vào: Họ tên và ngày sinh của người đó
//        Đầu ra: Họ tên và ngày họ sẽ về hưu

public class JA1_5_16_RetirementCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int date, month, year;

        do {

            System.out.print("Date of Birth: ");
            date = scanner.nextInt();

            System.out.print("Month of Birth: ");
            month = scanner.nextInt();

            System.out.print("Year of Birth: ");
            year = scanner.nextInt();

            if (month > 12 || month < 1 || date > 31 || date < 1) {
                System.out.println("Wrong month or date! Enter again");
            }


            Calendar calendar = new GregorianCalendar(year,  month - 1, date);
            calendar.add(calendar.YEAR, 60);

            System.out.println("Your retirement day: " + calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(calendar.MONTH) + 1) + "/" + calendar.get(Calendar.YEAR) );

            System.out.println();

        } while ((date > 31 || date < 1) || (month > 12 || month < 1));

    }
}
