package A1_Java_Developer.J2_JavaCollection;

import java.util.Random;
import java.util.Scanner;

//Cho một mảng số bao gồm n phần tử. Tính toán xuất hiện của lẻ phần tử trong mảng và trong các phần tử đó.
//
//        Đầu vào: Một mảng số nguyên bao gồm n phần tử
//        Đầu ra: Xuất hiện tỉ lệ các lẻ phần tử trong mảng (có thể hiển thị bằng dấu % và lấy sau dấu , 2 chữ số) và hiển thị các phần tử đó trên màn hình
//
//        VD: a[]={1,2,3,4,5,6} => Tỉ lệ = 3/6 = 50% và các phần tử là 1,3,5


//Given a numeric array consisting of n elements. Calculate the occurrence of odd elements in the array and within those elements.
//
//        Input: An integer array consisting of n elements
//        Output: Appears the ratio of odd elements in the array (can be displayed with a % sign and is followed by , 2 digits) and displays those elements on the screen
//
//        For example: a[]={1,2,3,4,5,6} => Ratio = 3/6 = 50% and the elements are 1,3,5


public class JA2_1_06_Calculating_Rate_Occurrence_Appears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int Length = scanner.nextInt();

        int[] arr = new int[Length];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(20);
        }

        System.out.print("Default array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int j : arr) {
            if (j % 2 == 1) {
                count++;
            }
        }

        double result = ((double) count / Length) * 100;
        System.out.print("\nRate of occurrence odd number appears: " + result + "%");
    }
}
