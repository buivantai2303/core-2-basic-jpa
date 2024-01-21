package LTSEDU_JavaBackend.src.A1_Java_Developer.J1_JavaCore.JA1_FinalExam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("-------------------------");
                    System.out.println("BAI 1: ");

                    System.out.print("Enter length of your array: ");
                    int length = scanner.nextInt();
                    int[] arr = new int[length];
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("Element " + (i+1) + ":");
                        arr[i] = scanner.nextInt();
                    }

                    System.out.print("Enter your element you want to remove from array: ");
                    int value;
                    value = scanner.nextInt();

                    BAI_1(arr, value);

                } else if (choice == 2) {
                    System.out.println("-------------------------");
                    System.out.println("BAI 2: ");

                    System.out.print("Enter length of your array: ");
                    int length_2 = scanner.nextInt();

                    int[] arr_2 = new int[length_2];
                    for (int i = 0; i < arr_2.length; i++) {
                        System.out.print("Element " + (i+1) + ":");
                        arr_2[i] = scanner.nextInt();
                    }

                    System.out.print("Enter index to adding: ");
                    int index = scanner.nextInt();

                    System.out.print("Enter value to adding: ");
                    int value_2 = scanner.nextInt();

                    int[] newArr = BAI_2(arr_2, value_2, index);

                    System.out.println("New array:");
                    for (int element : newArr) {
                        System.out.print(element + " ");
                    }

                } else if (choice == 3) {
                    System.out.println("-------------------------");
                    System.out.println("BAI 3: ");
                    int num;
                    System.out.print("Enter your number: ");
                    num = scanner.nextInt();

                    System.out.print("SNT: ");

                    for(int i = 2; i <= num; i++){
                        while (num % i == 0){
                            if (PrimeNum(i)){
                                System.out.print(i+" ");
                                num = num / i;
                            }
                        }
                    }
                } else {
                    System.out.println("Please choose range 1 to 3!");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
                choice = 0;
            }

        } while (choice < 1 || choice > 3);


    }

    public static void BAI_1 (int[] arr, int value){
        int count = 0;

        System.out.print("- Default array: ");
        for (int j : arr) {
            System.out.print(j + " ");
            if (j != value) {
                count++;
            }
        }

        count++;

        int[] newArr = new int[count - 1];
        for(int i = 0, k = 0; i < arr.length; i++){
            if(arr[i] != value){
                newArr[k]=arr[i];
                k++;
            }
        }

        System.out.print("\n- New array: ");
        for (int j : newArr) {
            System.out.print(j + " ");
        }
    }

    public static int[] BAI_2(int[] arr, int value, int index) {
        int length = arr.length;
        if (index > length) {
            index = length;
        }
        int[] newArr = new int[length + 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        newArr[index] = value;
        System.arraycopy(arr, index, newArr, index + 1, length - index);
        return newArr;
    }


    public static boolean PrimeNum (int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
