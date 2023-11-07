package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_4_14_Sum {
    public static void main(String[] args) {
        double Sum = 0, n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your number: ");
            n = scanner.nextDouble();

            if(n > 0){
                for (int i = 1; i <= n; i++){
                    Sum += (double) 1 /(i*(i+1));
                }
            } else {
                System.out.println("Wrong! Enter again");
            }
        } while (n < 0);

        System.out.println("Result sum of S(n) = " + Sum);
    }
}
