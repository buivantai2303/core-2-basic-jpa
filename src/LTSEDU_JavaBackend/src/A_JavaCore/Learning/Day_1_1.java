package A_JavaCore.Learning;

public class Day_1_1 {
    public static void main(String[] args) {

        int soNguyen_1 = 6, soNguyen_2 = 4;

        int ketQua_1 = soNguyen_1 + soNguyen_2;
        int ketQua_2 = soNguyen_1 - soNguyen_2;
        int ketQua_3 = soNguyen_1 * soNguyen_2;
        int ketQua_4 = soNguyen_1 / soNguyen_2;
        int ketQua_5 = soNguyen_1 % soNguyen_2;

        System.out.println(ketQua_1);
        System.out.println(ketQua_2);
        System.out.println(ketQua_3);
        System.out.println(ketQua_4);
        System.out.println(ketQua_5);


        System.out.println(soNguyen_1++);
        System.out.println(++soNguyen_1);

        // ++i change before the command is executed
        // i++ change after the command is executed
        // EXAMPLE: int soNguyen_1 = 1, print(soNguyen_1++) will present: 1 and print(++soNguyen_1) is 2
    }
}
