import java.util.Scanner;

public class NestedLoop_2341760056 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": ");
            // Menggunakan foreach untuk menampilkan array
            double total = 0;
            for (double reva : temps[i]) {
                System.out.print(reva + " ");

                // SUM untuk setiap kotanya
                total += reva;
            }
            double average = total / temps[i].length; // menghitung rata2 dan disumpan dalam variable
            System.out.printf("\nRata-rata: %.2f\n", average); // print rata2
        }
    }
}