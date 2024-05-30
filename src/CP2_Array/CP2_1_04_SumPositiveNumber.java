package CP2_Array;
import java.util.Scanner;

public class CP2_1_04_SumPositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of array (integer): ");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++){
            System.out.print("- Element " + i + 1 + " = ");
            arr[i] = scanner.nextInt();
        }

        int result = 0;

        for (int j : arr) {
            if (j > 0) {
                result += j;
            }
        }

        System.out.println("Result: " + result);
    }
}
