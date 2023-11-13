package A1_Java_Developer.J1_JavaCore.JA1_3;

import java.util.Scanner;

//Nhập vào từ bàn phím chiều cao của một người. Phân loại xem người đó là người Rất Lùn, Lùn, Bình Thường, Cao, Rất Cao
//        Gợi ý:
//        -    Rất lùn: < 145cm
//        -    Lùn: < 150cm
//        -    Bình Thường: >= 150cm và < 1m70
//        -    Cao:  >= 170cm và <= 180cm
//        -    Rất Cao: > 180cm
public class JA1_3_07_HeightChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.println();

        if (height < 145){
            System.out.println("Very short");
        } else if (height < 150 && height > 145){
            System.out.println("Short");
        } else if (height>= 150 && height < 170){
            System.out.println("Normal");
        } else if (height >= 170 && height <= 180){
            System.out.println("Tall");
        } else if (height > 180 && height < 300) {
            System.out.println("Very tall");
        } else {
            System.out.println("Not a human");
        }

    }
}
