package A_JavaCore.Homework.JA_1_5;


public class JA1_5_06_DeleteString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello Java ,Hello HvitClan");
        System.out.println("Old string: " + str);

        int index_1 = str.indexOf("Hello");
        int index_2 = str.lastIndexOf("Hello");

        System.out.println("New string: " + str.delete(index_1, index_2));
    }
}
