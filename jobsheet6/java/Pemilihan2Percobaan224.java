import java.util.Scanner;

public class Pemilihan2Percobaan224 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner (System.in);

        int sudut1, sudut2, sudut3;

        System.out.print("Masukkan sudut pertama    : ");
        sudut1 = input24.nextInt();
        System.out.print("Masukkan sudut kedua      : ");
        sudut2 = input24.nextInt();
        System.out.print("Masukkan sudut ketiga     : ");
        sudut3 = input24.nextInt();

        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90)||(sudut2==90)||(sudut3==90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else {
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
            }
        } else {
            System.out.println("Bukan segitiga");
        }
    }
}