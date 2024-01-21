package A1_Java_Developer.J2_JavaCollection.JA2_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Cho 1 mảng số nguyên n phần tử. Hãy sắp xếp mảng và tìm vị trí đầu tiên xuất hiện của 1 số cho trước
// ( sử dụng hàm binarySearch() trong lớp Arrays)
//
//        Đầu vào: 1 mảng số nguyên và 1 số nguyên bất kì
//        Đầu ra: Hiển thị mảng đã sắp xếp và vị trí đầu tiên xuất hiện số đó

//Given an array of integers. Let's sort the array and find the first occurrence of the previous number
// (use binarySearch() function in Array class)
//
//        Input: 1 array of integers and 1 any integer
//        Output: Shows the array sort and the first occurrence position

public class JA2_1_07_Find_First_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int Length = scanner.nextInt();

        System.out.print("Enter element (integer) want to find: ");
        int x = scanner.nextInt();

        int[] arr = new int[Length];


        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(20);
        }

        System.out.print("- Default array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }


        Arrays.sort(arr);
        System.out.print("\n- Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\n- Position of 1st element '" + x + "': " + Arrays.binarySearch(arr, x));
    }
}
