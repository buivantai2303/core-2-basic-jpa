package J3_JavaMethods.JA3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JA3_2_03_DeclareListArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of array in list: ");
        int num = scanner.nextInt();

        System.out.println("Your string: " + listDeclare(num));


    }


    public static List<String> listDeclare(int x) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            System.out.print("Enter string " + i + ": ");
            list.add(scanner.nextLine().strip());
        }

        return list;
    }
}
