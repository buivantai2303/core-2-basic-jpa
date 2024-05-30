package J1_JavaCore.JA1_5;

public class JA1_5_09_SpecialCharCounting {
    public static void main(String[] args) {
        String str = "Baby, I don't feel so good. 6 words you never understood";

        countCharacters(str);
    }

    public static void countCharacters(String input) {
        int digitCount = 0;
        int letterCount = 0;
        int specialCharCount = 0;

        for (char ch : input.toCharArray()) { // Convert string to character in array
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                letterCount++;
            } else {
                specialCharCount++;
            }
        }

        // In kết quả
        System.out.println("Chuoi " + input + " co " + digitCount + " chu so, " + letterCount + " chu cai va " + specialCharCount + " ky tu");
    }

}