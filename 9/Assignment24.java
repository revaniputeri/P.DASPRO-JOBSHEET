import java.util.Scanner;

public class Assignment24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = sc.nextInt();

        int[] arrayInt = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arrayInt[i] = sc.nextInt();
        }

        int nilaiTertinggi = arrayInt[0];
        int nilaiTerendah = arrayInt[0];
        int total = arrayInt[0];

        for (int i = 1; i < jumlahElemen; i++) {
            if (arrayInt[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayInt[i];
            }
            if (arrayInt[i] < nilaiTerendah) {
                nilaiTerendah = arrayInt[i];
            }
            total += arrayInt[i];
        }

        double rataRata = (double) total / jumlahElemen;

        // Menampilkan hasil
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
