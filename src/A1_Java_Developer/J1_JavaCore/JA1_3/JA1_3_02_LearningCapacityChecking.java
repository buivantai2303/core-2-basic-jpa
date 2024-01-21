package A1_Java_Developer.J1_JavaCore.JA1_3;

import java.util.Scanner;

public class JA1_3_02_LearningCapacityChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your literature score: ");
        double literature = scanner.nextDouble();
        System.out.print("Enter your math score: ");
        double math = scanner.nextDouble();
        System.out.print("Enter your english score: ");
        double english = scanner.nextDouble();

        double score = (literature + math + english) / 3;
        System.out.println();

        if (score <= 4){
            System.out.println("Weak learning capacity");
        } else if (score > 4 && score <= 6.5){
            System.out.println("Medium learning capacity");
        } else if (score > 6.5 && score <= 8) {
            System.out.println("Academic pretty learning capacity");
        } else if (score > 8 && score <= 9){
            System.out.println("Good learning capacity");
        } else  if (score > 9 && score <= 10){
            System.out.println("Excellent learning capacity");
        } else {
            System.out.println("Wrong");
        }
    }
}
