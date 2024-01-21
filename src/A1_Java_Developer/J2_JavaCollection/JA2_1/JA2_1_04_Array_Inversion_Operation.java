package A1_Java_Developer.J2_JavaCollection.JA2_1;

import java.util.Scanner;

//Khai báo mảng ký tự gồm n phần tử. Hiển thị dạng đảo ngược của mảng ký tự vừa khai báo
//
//        Đầu vào: Một mảng kí tự
//        Đầu ra: Mảng đảo ngược của mảng kí tự đó
//
//        VD: ''Hello" => "olleH"


//Declare a character array of n elements. Displays the inverted form of the character array just declared
//
//        Input: An array of characters
//        Output: Reverse array of that character array
//
//        For example: ''Hello" => "olleH"

public class JA2_1_04_Array_Inversion_Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String arrChar = scanner.nextLine();

        String[] arr = arrChar.split("");
        System.out.print("Reverse string: ");
        for (int i = arrChar.length() - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}
