package LTSEDU_JavaBackend.src.A1_Java_Developer.J2_JavaCollection.JA2_2;
import java.util.ArrayList;
import java.util.Arrays;


public class JA2_2_14_List_duplicate_elements_of_2_lists {
    public static void main(String[] args) {
        // Tạo một ArrayList từ một mảng
        ArrayList<Integer> list_1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list_2 = new ArrayList<>(Arrays.asList(12, 122, 3, 4));

        // Kiểm tra xem có phần tử chung giữa hai danh sách không
        list_1.retainAll(list_2);

        // Hiển thị kết quả
        System.out.println("Các phần tử trùng nhau giữa hai danh sách: " + list_1);
    }
}
