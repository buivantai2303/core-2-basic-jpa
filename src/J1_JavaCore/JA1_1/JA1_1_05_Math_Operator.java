package J1_JavaCore.JA1_1;

public class JA1_1_05_Math_Operator {
    public static void main(String[] args) {

        double a = 3.14;
        double b = -8.72;
        double c = 12.65;

        sin(Math.sqrt(Math.abs(b)));
        SQRT(Math.sin(Math.abs(b)));
        POW(Math.sin(c), Math.sqrt(Math.abs(b)));
        ABS(b);
    }

    public static void ABS (double value) {
        System.out.println(Math.abs(value));
    }

    public static void SQRT (double value){
        System.out.println(Math.sqrt(value));
    }

    public static void sin (double value){
        System.out.println(Math.sin(value));
    }

    public static void POW (double value_1, double value_2){
        System.out.println(Math.pow(value_1, value_2));
    }
}
