package J4_OOP.MVC_03_SanPham;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MVC_003_InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static int IntHelper(String Message, String Error) {
        System.out.print(Message);
        int Value = 0;

        try {
            Value = Integer.parseInt(scanner.nextLine());
            return Value;
        } catch (Exception e) {
            System.out.println(Error);
            scanner.nextLine();
            return IntHelper(Message, Error);
        }
    }

    public static double DoubleHelper(String Message, String Error) {
        System.out.print(Message);
        double Value = 0;

        try {
            Value = Double.parseDouble(scanner.nextLine());
            return Value;
        } catch (Exception e) {
            System.out.println(Error);
            scanner.nextLine();
            return DoubleHelper(Message, Error);
        }
    }

    public static String StringHelper(String Message, String Error) {
        System.out.print(Message);
        String Value = scanner.nextLine();
        if (Value == null || Value.trim().isEmpty()) {
            System.out.println(Error);
            return StringHelper(Message, Error);
        }
        return Value;
    }

    public static LocalDate LocalDateHelper(String Message, String Error) {
        System.out.print(Message);
        LocalDate Value = null;

        try {
            Value = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return Value;
        } catch (Exception e) {
            System.out.println(Error);
            scanner.nextLine();
            return LocalDateHelper(Message, Error);
        }
    }

}
