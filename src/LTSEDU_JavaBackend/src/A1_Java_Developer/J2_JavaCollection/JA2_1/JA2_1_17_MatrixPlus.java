package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_1;

public class JA2_1_17_MatrixPlus {
    public static void main(String[] args) {
        int[][] str = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 }};
        int[][] str_2 = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };


        int rows = str.length;
        int columns = str[0].length;

        int[][] str_3 = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                str_3[i][j] = str[i][j] + str_2[i][j];
            }
        }


        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str_2[0].length; j++) {
                System.out.print(str_3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
