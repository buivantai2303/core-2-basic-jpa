package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_1;

//Cho sẵn mảng số nguyên N phần tử. Hãy in tất cả những phần tử ở vị trí chẵn và lẻ trong mảng.
//
//        Đầu vào: Một mảng số nguyên gồm n phần tử
//        Đầu ra: In ra tất cả những phần tử ở vị trí chẵn, tất cả những phần tử ở vị trí lẻ trong mảng theo mẫu:
//        Cac phan tu o vi tri chan la: [So o vi tri chan]
//        Cac phan tu o vi tri le la: [So o vi tri le]
//
//        VD: a[] = {1,2,3,4,5,6,7,8,9}
//        Cac phan tu o vi tri chan la: 1,3,5,7
//        Cac phan tu o vi tri le la: 2,4,6,8


//Given an integer array of N elements. Print all the elements in even and odd positions in the array.
//
//        Input: An integer array of n elements
//        Output: Print out all elements in even positions, all elements in odd positions in the array according to the form:
//        The components of the chan position are: [Compare the chan position]
//        The components of the le position are: [Compare the le position]
//
//        For example: a[] = {1,2,3,4,5,6,7,8,9}
//        The corresponding elements are: 1,3,5,7
//        The remaining elements are: 2,4,6,8

import java.util.Scanner;

public class JA2_1_02_DisplayOddEvenPositionNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your length of your Array: ");
        int Length = scanner.nextInt();

        int[] arr = new int[Length];

        for (int i = 0; i < Length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Element in even position: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\nElement in odd position: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
