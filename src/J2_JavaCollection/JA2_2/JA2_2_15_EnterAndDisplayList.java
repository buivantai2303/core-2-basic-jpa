package J2_JavaCollection.JA2_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JA2_2_15_EnterAndDisplayList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        NhapDS(list);

    }

    static List<Integer> NhapMotDanhSach(){
        List<Integer> lists = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong danh sách: ");
        int len = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            lists.add(scanner.nextInt());
        }

        return lists;
    }

    static void NhapDS(List<List<Integer>> list){
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> newlist = new ArrayList<List<Integer>>();
        System.out.print("Nhập số lượng danh sách con: ");
        int len = scanner.nextInt();

        for (int i = 0; i < len; i++) {
            newlist.add(NhapMotDanhSach());
        }

        System.out.println(newlist);
    }
}
