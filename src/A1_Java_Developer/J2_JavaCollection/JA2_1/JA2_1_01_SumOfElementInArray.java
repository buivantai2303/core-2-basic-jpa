package A1_Java_Developer.J2_JavaCollection.JA2_1;

//Viết chương trình nhập một mảng số nguyên và thực hiện tính tổng các phần tử của mảng rồi in ra màn hình
//
//        Đầu vào: 1 mảng số nguyên
//        Đầu ra: Tổng tất cả các phần tử của mảng


//Write a program that enters an integer and calculates the sum of the elements of the array on the screen
//
//        Input: 1 array of integers
//        Output: Sum of all elements of the array

import java.util.Scanner;

public class JA2_1_01_SumOfElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your length of your Array: ");
        int Length = scanner.nextInt();
        int Sum = 0;

        int[] arr = new int[Length];

        for (int i = 0; i < Length; i++) {
            System.out.print("Element " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
            Sum += arr[i];
        }

        System.out.println("- Sum of array: " + Sum);


    }
}
