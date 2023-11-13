package SoftwareTesting;
import java.util.Scanner;
import java.lang.Math;

public class A_TestCase_PTBac2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First triangle: ");
        System.out.print("Enter a: ");
        float a = scan.nextFloat();
        System.out.print("Enter b: ");
        float b = scan.nextFloat();
        System.out.print("Enter c: ");
        float c = scan.nextFloat();

        float[] resultsFromCalculate = Calculate(a, b, c);

        System.out.println("------------------------------------");
        System.out.println("Second triangle: ");
        System.out.print("Enter a: ");
        float a_1 = scan.nextFloat();
        System.out.print("Enter b: ");
        float b_1 = scan.nextFloat();
        System.out.print("Enter c: ");
        float c_1 = scan.nextFloat();

        SoSanh(a_1, b_1, c_1, resultsFromCalculate);
    }

    public static float[] Calculate(float a, float b, float c){
        float Delta = b*b - 4*a*c;
        if (Delta > 0) {
            float X1 = (float) ((-b + Math.sqrt(Delta)) / (2*a));
            float X2 = (float) ((b + Math.sqrt(Delta)) / (2*a));
            return new float[] {X1, X2};
        } else if (Delta == 0) {
            float X =  ((-b / 2*a));
            return new float[] {X};
        } else {
            return new float[] {};
        }
    }

    public static void SoSanh(float a, float b, float c, float[] resultsFromCalculate){
        float Delta = b*b - 4*a*c;

        if (Delta > 0) {
            float X1 = (float) ((-b + Math.sqrt(Delta)) / (2*a));
            float X2 = (float) ((b + Math.sqrt(Delta)) / (2*a));

            if (resultsFromCalculate[0] == X1 && resultsFromCalculate[1] == X2) {
                System.out.println("2 nghiem - Pass");
            } else {
                System.out.println("2 nghiem - Failed");
            }
        } else if (Delta == 0) {
            float X = ((-b / 2*a));
            if (resultsFromCalculate[0] == X) {
                System.out.println("Nghiem kep - Pass");
            } else {
                System.out.println("Nghiem kep - Failed");
            }
        } else if (Delta < 0) {
            System.out.println("Vo nghiem - Pass");
        }
    }
}
