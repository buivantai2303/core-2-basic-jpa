package A1_Java_Developer.J3_JavaMethods.JA3_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JA3_1_09_ReverseList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Nguyen Duc Toan");
        stringList.add("Nguyen Hoang Truong");
        stringList.add("Nguyen Dong Khanh");

        displayReverseString(getReverseString(stringList));
    }

    static void displayReverseString(List<String> list) {
        for (String i : list){
            System.out.println(i);
        }
    }

    static List<String> getReverseString(List<String> list) {
        List<String> newList = new ArrayList<>(list);
        Collections.reverse(newList);
        return newList;
    }
}
