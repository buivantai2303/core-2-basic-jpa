package J1_JavaCore.JA1_3;

import java.util.Scanner;

public class JA1_3_06_TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b ,c;
        do {
            System.out.print("Enter a: ");
            a = scanner.nextDouble();
            System.out.print("Enter b: ");
            b = scanner.nextDouble();
            System.out.print("Enter c: ");
            c = scanner.nextDouble();

            if (a + b < c || a + c < b || c + b < a){
                System.out.println("It's not 3 line of triangle! Enter again");
            }

            if (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) == Math.sqrt(Math.pow(c, 2))){
                System.out.println("This is right triangle");
                break;
            } else if ( a == b && b == c){
                System.out.println("This is isosceles triangle");
                break;
            } else {
                System.out.println("This is normal triangle");
                break;
            }


        } while (a + b > c || a + c > b || c + b > a);
    }
}
