package LTSEDU_JavaBackend.src.A1_Java_Developer.J3_JavaMethods.JA3_FinalExam;

import java.util.*;

public class Examination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cau 1: ");
        System.out.println("-----------------------------------------------");
        System.out.println("List element: " + Cau_1());
        System.out.println("-----------------------------------------------");
        System.out.println("Cau 2: ");
        System.out.print("Enter your string: ");
        String string = scanner.nextLine();
        System.out.println("Result: " + Cau_2(string));
        System.out.println("-----------------------------------------------");
        System.out.println("Cau 3: ");
        System.out.print("- Enter number of strings in list: ");
        int Cau_3N = scanner.nextInt();
        System.out.println("New list: " + Cau_3(Cau_3N));
        System.out.println("-----------------------------------------------");
        System.out.println("Cau 4: ");
        System.out.println("New list: " + Cau_4());

    }

    public static List<Integer> Cau_1() {
        int number;
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("- Enter your number (until enter 0 to exit): ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                list.add(number);
            } else {
                System.out.println("[Enter wrong datatype, enter again!]");
                scanner.nextLine();
                number = 1;
            }
        } while (number != 0);
        list.remove(list.size() - 1);

        return list;
    }

    public static String Cau_2(String str) {
        char[] charArray = str.toCharArray();

        // Note: Set không chứa ký tự trùng lặp;
        Set<Character> charSet = new LinkedHashSet<>();

        for (char c : charArray) {
            charSet.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (Character character : charSet) {
            result.append(character);
        }

        return result.toString();
    }

    public static List<String> Cau_3(int N) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> newList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.print("- Enter string " + i + ": ");
            String string = scanner.nextLine();
            list.add(string);
        }

        for (String i : list) {
            if (i.length() > N) {
                newList.add(i.substring(0, N).toUpperCase() + i.substring(N));
            } else {
                newList.add(i.toUpperCase());
            }
        }

        return newList;
    }

    public static List<Integer> Cau_4() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("- Enter your number of array: ");
        int number = scanner.nextInt();
        int[] IntArray = new int[number];

        for (int i = 0; i < IntArray.length; i++) {
            System.out.print("- Enter number " + i + ": ");
            IntArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < IntArray.length; i++) {
            if (PrimeNum(IntArray[i])) {
                if (IntArray[i] == 2) {
                    IntArray[i] = IntArray[i] + 2;
                    list.add(IntArray[i]);
                } else {
                    IntArray[i] = IntArray[i] + 1;
                    list.add(IntArray[i]);
                }
            } else {
                list.add(IntArray[i]);
            }
        }
        return list;
    }

    public static boolean PrimeNum (int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
