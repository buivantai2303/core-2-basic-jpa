package J3_JavaMethods.JA3_2;

import java.util.Scanner;

public class JA3_2_02_SolveQuadraticEquations {
    public static void main(String[] args) {
        input();
    }

    static void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        getDelta(a, b, c);
    }

    static void getDelta(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double[] solutions = DeltaGreaterThanZero(delta, a, b);
            System.out.println("Two distinct solutions: x1 = " + solutions[0] + ", x2 = " + solutions[1]);
        } else if (delta == 0) {
            double solution = DeltaEqualZero(a, b);
            System.out.println("One repeated solution: x = " + solution);
        } else if (a == 0 && b == 0 && c == 0) {
            VSN();
        } else {
            DeltaLessThanZero();
        }
    }

    static double[] DeltaGreaterThanZero(double delta, double a, double b) {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return new double[]{x1, x2};
    }

    static double DeltaEqualZero(double a, double b) {
        return (-b) / (2 * a);
    }

    static void DeltaLessThanZero() {
        System.out.println("The equation has no real solutions.");
    }

    static void VSN() {
        System.out.println("The equation has infinitely many solutions.");
    }

}
