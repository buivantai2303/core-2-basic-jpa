package J1_JavaCore.JA1_1;
import java.util.Scanner;

public class JA1_1_09_SpeedTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Để tính vận tốc ta cần có thời gian và quãng đường:");

        double Hours, Minutes, Sec, DistanceKM;

        do {
            System.out.print("Nhập số giờ: ");
            Hours = scanner.nextDouble();
            System.out.print("Nhập số phút: ");
            Minutes = scanner.nextDouble();
            System.out.print("Nhập số giây: ");
            Sec = scanner.nextDouble();
            System.out.print("Nhập vào quãng đường (km): ");
            DistanceKM = scanner.nextDouble();

            if (Hours < 0 || Minutes < 0 || Sec < 0 || DistanceKM < 0) {
                System.out.println("Đơn vị không được âm. Vui lòng nhập lại.");
            }
        } while (Hours < 0 || Minutes < 0 || Sec < 0 || DistanceKM < 0);

        double TimeHours = (Hours) + (Minutes / 60) + (Sec / 3600);

        System.out.println("Km/h: " + DistanceKM / TimeHours);
        System.out.println("M/s: " + ((DistanceKM / TimeHours) * 5 / 18));
        System.out.println("M/h: " + (DistanceKM * 1000) / TimeHours);
    }
}
