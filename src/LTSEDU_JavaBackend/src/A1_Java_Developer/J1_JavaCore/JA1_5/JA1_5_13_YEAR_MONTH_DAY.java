package LTSEDU_JavaBackend.src.A1_Java_Developer.J1_JavaCore.JA1_5;

import java.util.Calendar;

public class JA1_5_13_YEAR_MONTH_DAY {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        System.out.println("Time now: ");
//        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month: " + cal.get(Calendar.MONTH));
        System.out.println("Year: : " + cal.get(Calendar.YEAR));

    }

}
