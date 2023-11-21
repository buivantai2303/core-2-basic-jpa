package A1_Java_Developer.J2_JavaCollection;

//import java.util.Arrays;
import java.util.*;

public class JA2_1_11_Sort_Operator_1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter length of array: ");
//        int length = scanner.nextInt();
//
//        int[] arr = new int[length];
//
//        for (int i = 0; i < arr.length; i++) {
//            Random random = new Random();
//            arr[i] = random.nextInt(20);
//        }
//
//        System.out.print("- Default array: ");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//
//        // Sort even numbers in ascending order
//        int[] evenArr = Arrays.stream(arr)
//                .filter(x -> x % 2 == 0)
//                .sorted()
//                .toArray();
//
//        // Sort odd numbers in descending order
//        int[] oddArr = Arrays.stream(arr)
//                .filter(x -> x % 2 != 0)
//                .boxed()
//                .sorted((a, b) -> b.compareTo(a))
//                .mapToInt(Integer::intValue)
//                .toArray();
//
//        // Merge even and odd arrays
//        int[] sortedArr = new int[length];
//        System.arraycopy(evenArr, 0, sortedArr, 0, evenArr.length);
//        System.arraycopy(oddArr, 0, sortedArr, evenArr.length, oddArr.length);
//
//        System.out.print("\n- Sorted array: ");
//        for (int i : sortedArr) {
//            System.out.print(i + " ");
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(20);
        }

        System.out.print("- Default array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        Arrays.sort(arr);

        int countEven = 0, countOdd = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        int[] Even = new int[countEven];
        int[] Odd = new int[countOdd];



        int EvenTemp = 0;
        int OddTemp = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                Even[EvenTemp] = i;
                EvenTemp++;
            } else {
                Odd[OddTemp] = i;
                OddTemp++;
            }
        }

        int temp;
        for (int i = 0; i < Odd.length; i++) {
            for (int j = i + 1; j < Odd.length; j++) {
                if (Odd[i] < Odd[j]) {
                    temp = Odd[i];
                    Odd[i] = Odd[j];
                    Odd[j] = temp;
                }
            }
        }


        int[] both = Arrays.copyOf(Even, Even.length + Odd.length);
        System.arraycopy(Odd, 0, both, Even.length, Odd.length);

        System.out.print("\n- Sorted array: ");
        for (int i : both) {
            System.out.print(i + " ");
        }
    }
}
