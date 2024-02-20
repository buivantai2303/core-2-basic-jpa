package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.MVC_01;

import java.util.Scanner;

public class InputHelper {
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
}
