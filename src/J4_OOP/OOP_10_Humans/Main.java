package J4_OOP.OOP_10_Humans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Human Thu = new Human();
        Human Tai = new Human(23, "Bui Van Tai", LocalDate.parse("23/03/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Tai.InThongTin();
        System.out.println("=======================================");
        Thu.InThongTin();
    }
}
