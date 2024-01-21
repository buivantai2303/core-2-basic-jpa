package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_1;
import java.util.Scanner;

//Cho một mảng số nguyên gồm n phần tử. Hãy tìm phần tử đầu tiên chia hết cho 10. Hãy in số đó và vị trí của nó ra màn hình. Nếu không có thì in ra "Khong co so nao la boi cua 10"
//
//        Đầu vào: Một mảng số nguyên gồm n phần tử
//        Đầu ra: Hiển thị phần tử đầu tiên trong mảng chia hết cho 10 và vị tri của số đó. Nếu không có số nào hiển thị "Khong co so nao la boi cua 10"
//
//        VD: a[]= {1,2,3,4,5,6,7,8,9,10} => So dau tien trong mang la boi cua 10 la 10 o vi tri thu 9


//Given an integer array of n elements. Find the first element divisible by 10. Print that number and its position to the screen. If there is no number, print "There is no number that is the number 10"
//
//        Input: An integer array of n elements
//        Output: Displays the first element in the array divisible by 10 and the position of that number. If there is no number displayed "No number is the number 10"
//
//        For example: a[]= {1,2,3,4,5,6,7,8,9,10} => The first number in the number is the number of 10 which is 10 with the value of 9


public class JA2_1_08_First_Num_Divisible_by_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int Length = scanner.nextInt();


        int[] arr = new int[Length];

        for (int i = 0; i < Length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("- Default array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }



        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0) {
                System.out.println("\nThe first number in the array is divisible by 10: " + arr[i] + ", and position: " + i);
                return;
            }
        }

        System.out.println("\nNot have number divisible by 10");
        }
    }

