package A1_Java_Developer.J2_JavaCollection;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Cho 1 mảng số nguyên N phần tử. In ra tổng bình phương của phần tử bé nhất và lớn nhất trong mảng.
//
//        Đầu vào: Một mảng số nguyên gồm n phần tử
//        Đầu ra: In ra số lớn nhất và bé nhất trong mảng và tính tổng bình phương của chúng
//
//        VD: a[]= {1,2,3,4,5} => Phan tu nho nhat la: 1 - Phan tu lon nhat la 5=> Tong binh phuong 2 so do la : min^2 + max^2 = 26


//Given an integer element N. Print out the synthesis method of the smallest and largest element in the array.
//
//        Input: An integer array consisting of n elements
//        Output: The largest and smallest quantities in the array and calculate their method sum
//
//        For example: a[]= {1,2,3,4,5} => The smallest factor is: 1 - The largest factor is 5=> Total square of 2 is: min^2 + max^2 = 26

public class JA2_1_10_Sum_Of_Squares_MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int Length = scanner.nextInt();

        int[] arr = new int[Length];


        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(20);
        }

        System.out.print("- Default array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.print("\n- Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int SUM = (int) (Math.pow(arr[0], 2) + Math.pow(arr[arr.length - 1], 2));
        System.out.println("\nSum of square sum max and min number in array: " + SUM);
    }
}
