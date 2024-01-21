package A2_DataStructure_and_Algorithms;

import java.util.Scanner;

public class BinarySort {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your array numbers: ");
        int ArrayNumber = scanner.nextInt();


//      Array declaration
        int[] ArrayList = new int[ArrayNumber];

//      Insert elements into the array
        System.out.println("-----------------------------");
        System.out.println("Enter your array: ");
        for (int i = 0; i < ArrayNumber; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            ArrayList[i] = scanner.nextInt();
        }
        ARR(ArrayList);

        System.out.println("Enter your number want to find: ");
        int x = scanner.nextInt();


        int result = binarySearch(ArrayList, x);
        System.out.println();
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);

    }

    public static void ARR(int[] ArrayList) {
        int temp;
        for (int i = 0; i < ArrayList.length; i++){
            for (int j = i + 1; j < ArrayList.length; j++){
                if (ArrayList[i] > ArrayList[j]){
                    temp = ArrayList[i];
                    ArrayList[i] = ArrayList[j];
                    ArrayList[j] = temp;
                }
            }
        }

        System.out.println("Array: ");
        for (int i = 0; i < ArrayList.length; i++) {
            System.out.print(ArrayList[i] + " ");
        }


    }

    public static int binarySearch(int[] ARR, int x)
    {
        int l = 0, r = ARR.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (ARR[m] == x)
                return m;

            // If x greater, ignore left half
            if (ARR[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }
}
