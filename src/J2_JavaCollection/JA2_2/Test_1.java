package J2_JavaCollection.JA2_2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        List<int[]> list = new LinkedList<>();
        NhapDS(list);

        // Sắp xếp mảng theo giá trị trung bình cộng
        SapXepTheoTrungBinhCong(list);

        // Hiển thị giá trị của từng mảng trong danh sách sau khi sắp xếp
        HienThiDS(list);
    }

    static int[] NhapMotMang() {
        System.out.println("------------------------------");
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        Scanner scanner = new Scanner(System.in);

        int soLuong = scanner.nextInt();
        int[] arr = new int[soLuong];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            int giaTriPhanTu = scanner.nextInt();
            arr[i] = giaTriPhanTu;
        }

        return arr;
    }

    static void NhapDS(List<int[]> list) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng mảng con: ");
        int len = scanner.nextInt();

        for (int i = 0; i < len; i++) {
            list.add(NhapMotMang());
        }
    }

    static void SapXepTheoTrungBinhCong(List<int[]> list) {
        // Sắp xếp danh sách mảng theo giá trị trung bình cộng giảm dần
        Collections.sort(list, (arr1, arr2) -> {
            double avg1 = tinhTrungBinhCong(arr1);
            double avg2 = tinhTrungBinhCong(arr2);
            return Double.compare(avg2, avg1);
        });
    }

    static double tinhTrungBinhCong(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return (double) sum / arr.length;
    }

    static void HienThiDS(List<int[]> list) {
        System.out.println("------------------------------");
        System.out.println("Danh sách các mảng sau khi sắp xếp theo trung bình cộng:");
        int count = 0;
        for (int[] array : list) {
            System.out.print("- Mảng thứ " + count + ": ");
            count++;
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
