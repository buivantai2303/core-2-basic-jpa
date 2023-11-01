package SoftwareTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_PolynomialsOfDegree5NotMissPolynomialsOfDegree3 {

    public static void main(String[] args) {
        List<Double> coefficients = getEquationCoefficients();

        checkCoefficients(coefficients);
        checkSumOfCoefficients(coefficients);


        double root = findRootUsingNewtonRaphson(coefficients, 1.0);
        System.out.println("Estimated root: " + root);
    }

    public static List<Double> getEquationCoefficients() {
        Scanner scan = new Scanner(System.in);
        String[] terms = {"5th", "4th", "3rd", "2nd", "1st", "0"};
        List<Double> coefficients = new ArrayList<>();

        for (String term : terms) {
            System.out.print("Enter the " + term + " degree of the equation: ");
            coefficients.add(scan.nextDouble());
        }

        return coefficients;
    }

    public static void checkSumOfCoefficients(List<Double> coefficients) {
        double sum = coefficients.get(1) + coefficients.get(4);
        if (sum > 150) {
            System.err.println("Error: The sum of the coefficient of 4th degree and the coefficient of 1st degree is greater than 150!");
            System.exit(1);
        }
    }


    public static void checkCoefficients(List<Double> coefficients) {
        List<Double> HS01245 = generateList(0, 100);
        List<Double> HS3 = generateList(1, 100);
        String[] terms = {"5th", "4th", "3rd", "2nd", "1st", "0"};

        for (int i = 0; i < coefficients.size(); i++) {
            double coefficient = coefficients.get(i);

            if ((i == 2 && !HS3.contains(coefficient)) || (i != 2 && !HS01245.contains(coefficient))) {
                System.out.println("Incorrectly entered the " + terms[i] + " degree value of the equation. Enter again!");
                System.exit(1);
            }
        }
    }

    public static List<Double> generateList(double start, double end) {
        List<Double> list = new ArrayList<>();
        for (double i = start; i <= end; i++) {
            list.add(i);
        }
        return list;
    }

    public static double f(List<Double> coefficients, double x) {
        return coefficients.get(0)*x*x*x*x*x + coefficients.get(1)*x*x*x*x +
                coefficients.get(2)*x*x*x + coefficients.get(3)*x*x +
                coefficients.get(4)*x + coefficients.get(5);
    }

    public static double df(List<Double> coefficients, double x) {
        return 5*coefficients.get(0)*x*x*x*x + 4*coefficients.get(1)*x*x*x +
                3*coefficients.get(2)*x*x + 2*coefficients.get(3)*x +
                coefficients.get(4);
    }

    public static double findRootUsingNewtonRaphson(List<Double> coefficients, double initialGuess) {
        double tolerance = 1e-10;
        double x = initialGuess;
        double diff = f(coefficients, x) / df(coefficients, x);

        while (Math.abs(diff) >= tolerance) {
            diff = f(coefficients, x) / df(coefficients, x);
            x -= diff;
        }

        return x;
    }
}
