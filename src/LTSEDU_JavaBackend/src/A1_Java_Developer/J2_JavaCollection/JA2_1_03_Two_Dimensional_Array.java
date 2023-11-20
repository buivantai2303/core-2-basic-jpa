package A1_Java_Developer.J2_JavaCollection;


//Cho mảng 2 chiều a = [ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } ]. Viết chương trình in mảng 2 chiều a ra màn hình.
//
//        Đầu vào: Mảng a
//        Đầu ra:  [ { 1, 2, 3 },
//        { 4, 5, 6 },
//        { 7, 8, 9 } ]


//Given a 2-dimensional array a = [ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } ]. Write a program to print a 2-dimensional array a to the screen.
//
//        Input: Array a
//        Output: [ { 1, 2, 3 },
//        { 4, 5, 6 },
//        { 7, 8, 9 } ]

public class JA2_1_03_Two_Dimensional_Array {
    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        int[][] arr = new int[row][column];
        int value = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = value;
                value++;
            }
        }

        System.out.println("The array 2D is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
