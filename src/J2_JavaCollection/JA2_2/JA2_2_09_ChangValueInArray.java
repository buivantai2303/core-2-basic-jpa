package J2_JavaCollection.JA2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JA2_2_09_ChangValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.asList("one", "Two", "three", "Four", "five", "six", " one", " three", "Four");

        list.replaceAll(s -> s.equals("one") ? "ten" : s);

        System.out.println(list);
    }
}
