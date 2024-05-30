package J2_JavaCollection.JA2_1;
import java.util.Random;
import java.util.Scanner;


//
//Viết chương trình nhập vào một mảng số nguyên. Thực hiện chia mảng thành 2 mảng số nguyên chẵn và lẻ, hiển thị ra màn hình kết quả
//        Đầu vào: 1 mảng số nguyên bât kì
//        Đầu ra: 1 danh sách các mảng số nguyên, 1 mảng chứa số chẵn và 1 mảng chứa số lẻ. (Mảng số chẵn được hiển thị trước mảng số lẻ)



//Write a program to input an array of integers. Divide the array into 2 even and odd integer arrays, display the results on the screen
//        Input: 1 array of any integers
//        Output: 1 list of integer arrays, 1 array containing even numbers and 1 array containing odd numbers. (The even number array is displayed before the odd number array)
public class JA2_1_05_Devide_Odd_Even_Aray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int Length = scanner.nextInt();

        int[] arr = new int[Length];

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(20);
        }

        System.out.print("- Even array: ");
        for (int i : arr){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.print("\n- Odd array: ");
        for (int i : arr){
            if (i % 2 == 1){
                System.out.print(i + " ");
            }
        }
    }
}
