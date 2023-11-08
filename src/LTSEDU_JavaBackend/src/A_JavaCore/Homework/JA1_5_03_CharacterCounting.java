package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_5_03_CharacterCounting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;
        char cr;
        int count = 0;
        System.out.print("Enter your string: ");
        str = scanner.nextLine();

        System.out.print("Enter your character to count: ");
        cr = scanner.next().charAt(0);

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == cr){
                count++;
            }
        }

        System.out.println("Character " + cr + " appear " + count + " times");
    }
}
