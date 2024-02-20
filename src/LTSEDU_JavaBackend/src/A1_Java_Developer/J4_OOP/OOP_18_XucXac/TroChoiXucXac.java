package LTSEDU_JavaBackend.src.A1_Java_Developer.J4_OOP.OOP_18_XucXac;

import java.util.Random;
import java.util.Scanner;

public class TroChoiXucXac {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int GiaTri_1, GiaTri_2;
    private Boolean Thang = false, Thua = false, Hoa = false;

    public int getGiaTri_1() {
        return GiaTri_1;
    }

    public void setGiaTri_1(int giaTri_1) {
        GiaTri_1 = giaTri_1;
    }

    public int getGiaTri_2() {
        return GiaTri_2;
    }

    public void setGiaTri_2(int giaTri_2) {
        GiaTri_2 = giaTri_2;
        if (GiaTri_1 < GiaTri_2) Thua = true;
        else if (GiaTri_1 > GiaTri_2) Thang = true;
        else Hoa = true;
    }

    public Boolean getThang() {
        return Thang;
    }

    public Boolean getThua() {
        return Thua;
    }

    public Boolean getHoa() {
        return Hoa;
    }

    public void BatDau (){
        do {
            setGiaTri_1(NhapGiaTri());
            if (getGiaTri_1() < 3 || getGiaTri_1() > 18){
                System.out.println("End game!");
            }

            int L1 = random.nextInt(6) + 1;
            int L2 = random.nextInt(6) + 1;
            int L3 = random.nextInt(6) + 1;

            System.out.println("- Your result: " + getGiaTri_1());
            System.out.println("- Bot result: " + (L1 + L2 + L3) + " (" + L1 + ", " + L2 + ", " + L3 +")");
            setGiaTri_2(L1 + L2 + L3);
            InThongTin();
            Thang = Thua = Hoa = false;
        } while (GiaTri_1 >= 3 && GiaTri_1 <= 18);
    }

    public int NhapGiaTri (){
        int number = 0;
        boolean check = false;
        do {
            try {
                System.out.print("Enter your number request: ");
                number = scanner.nextInt();
                check = true;
            } catch (Exception e){
                System.out.println("Wrong datatype! Enter again.");
                scanner.nextLine();
            }
        } while (!check);
        return number;
    }

    public void InThongTin(){
        if (Thang) System.out.println("You are won!");
        else if (Thua) System.out.println("You are lose!");
        else System.out.println("We are draw!");
    }

}
