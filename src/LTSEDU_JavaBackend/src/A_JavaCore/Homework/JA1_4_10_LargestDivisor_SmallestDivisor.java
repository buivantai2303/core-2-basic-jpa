package A_JavaCore.Homework;

import java.util.Scanner;

public class JA1_4_10_LargestDivisor_SmallestDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int BCNN = 0, UCLN = 0;

        System.out.print("Enter your number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter your number b: ");
        int b = scanner.nextInt();

        if ( a > 0 && b > 0){

//            if (a > b){
//                for (int i = 1; i <= a; i++){
//                    if (a % i == 0 && b % i == 0){
//                        UCLN = i;
//                    }
//                }
//            }
//            else {
//                for (int i = 1; i <= b; i++){
//                    if (a % i == 0 && b % i == 0){
//                        UCLN = i;
//                    }
//                }
//            }

            BCNN = (a * b) / UCLN(a, b);
            System.out.println("UCLN = " + UCLN(a, b) + ", BCNN = " + BCNN);
        }
    }

    public static int UCLN(int a, int b) {
        while (b != 0) {        // Dùng vòng lặp while cho đến khi b = 0
            int temp = b;       // Tạo một biến tạm thời "temp" và gán giá trị của b cho nó
            b = a % b;          // Lấy phần dư của a chia cho b và gán kết quả cho b
            a = temp;           // Gán giá trị của biến tạm thời "temp" cho a
        }
        return a;              // Khi b = 0, UCLN là giá trị cuối cùng của a, trả về giá trị này
    }

}
