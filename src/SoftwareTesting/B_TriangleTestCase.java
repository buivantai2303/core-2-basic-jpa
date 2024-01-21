package SoftwareTesting;

import java.util.Scanner;
import java.util.Random;
public class B_TriangleTestCase {


    public static void main(String[] args) {
//        testTriangle();

        // Generate and test 10 random sets of triangle sides
        for (int i = 0; i < 10; i++) {
            double sideA = generateRandomSide();
            double sideB = generateRandomSide();
            double sideC = generateRandomSide();

            String result = determineTriangleType(sideA, sideB, sideC);
            System.out.printf("Triangle %d: Side A = %.2f and Side B = %.2f and Side C = %.2f => %s%n", i + 1, sideA, sideB, sideC, result);
        }
    }

    private static String determineTriangleType(double sideA, double sideB, double sideC) {
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            return "These sides do not form a triangle.";
        } else if (sideA == sideB && sideB == sideC) {
            return "This is an equilateral triangle.";
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "This is an isosceles triangle.";
        } else if (isRightTriangle(sideA, sideB, sideC) || isRightTriangle(sideB, sideA, sideC) || isRightTriangle(sideC, sideB, sideA)) {
            return "This is a right triangle.";
        } else {
            return "This is a scalene triangle.";
        }
    }

    private static boolean isRightTriangle(double a, double b, double c) {
        return Math.abs(a * a + b * b - c * c) < 1e-10;
    }

    //Enter form keyboard
//    private static void testTriangle() {
//        assert "This is an equilateral triangle.".equals(determineTriangleType(5, 5, 5));
//        assert "This is an isosceles triangle.".equals(determineTriangleType(5, 5, 7));
//        assert "This is a right triangle.".equals(determineTriangleType(3, 4, 5));
//        assert "This is a scalene triangle.".equals(determineTriangleType(3, 4, 6));
//        assert "These sides do not form a triangle.".equals(determineTriangleType(1, 2, 4));
//        System.out.println("All test cases passed!");
//    }

    private static double generateRandomSide() {
        Random random = new Random();
        return random.nextDouble() * 99 + 1; // Generate a random value between 1 and 100
    }
}
