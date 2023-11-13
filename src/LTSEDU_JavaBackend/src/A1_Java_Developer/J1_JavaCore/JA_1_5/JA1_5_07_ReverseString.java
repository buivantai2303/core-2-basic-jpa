package A1_Java_Developer.J1_JavaCore.JA_1_5;


//Viết chương trình đảo ngược 1 chuỗi.
//
//        Nếu chuỗi đảo ngược đó bằng chuỗi ban đầu, thì in chuỗi đó
//        Ngược lại, thì in ra chuỗi chứa cả 2 chuỗi đó
//        Đầu vào: 1 chuỗi bất kì
//        Đầu ra: 1 chuỗi thỏa mãn yêu cầu
//
//        VD: input: Hello HvitClan => Hiển thị: "nalCtivH olleHHello HvitClan"
//        NOON => Hiển thị: "NOON"

import java.util.Scanner;

public class JA1_5_07_ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first string: ");
        String str = scanner.nextLine();

        System.out.print("Enter your second string: ");
        String str_2 = scanner.nextLine();

        StringBuilder strB = new StringBuilder(str_2);

        if (str.contentEquals(strB.reverse())){
            System.out.println("Your string: " + str);
        } else {
            System.out.println("String 1: " + str);
            System.out.println("String 2: " + strB);
        }
    }
}
