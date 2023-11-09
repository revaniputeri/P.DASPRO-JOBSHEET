import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // deklarasi variable
        int n, i;
        // inputan nilai N
        System.out.print("Enter the value of N: ");
        n = sc.nextInt();
        // pemilihan dengan kondisi nilai N minimal 5
        if (n >= 5) {
            // mengontrol jumlah baris dalam pola mulai dari nilai N sampai 1
            for (i = n; i >= 1; i--) {
                // mencetak bintang pada setiap baris, Jumlah bintang bergantung pada nilai i
                for (int j = 1; j <= i; j++) {
                    // Mencetak baris baru setelah mencetak bintang
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            // mencetak "null" jika nilai n kurang dari 5.
            System.out.println("null");
        }

    }
}