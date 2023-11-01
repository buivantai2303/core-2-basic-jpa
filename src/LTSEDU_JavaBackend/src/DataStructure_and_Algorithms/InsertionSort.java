package DataStructure_and_Algorithms;
import java.util.Scanner;

public class InsertionSort {
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
}