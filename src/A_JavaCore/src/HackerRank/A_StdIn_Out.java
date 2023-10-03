package HackerRank;
import java.util.Scanner;

public class A_StdIn_Out {
    public static void main(String[] args) {
        // Write your code here.

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
