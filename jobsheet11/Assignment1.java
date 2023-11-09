import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // deklarasi variable
        int i, n;

        // inputan nilai N
        System.out.print("Enter N value: ");
        n = sc.nextInt();

        // pemilihan kondisi nilai N minimal 3
        if (n >= 3) {
            // mengontrol jumlah baris dalam pola. Dimulai dari i=1 hingga i=n.
            for (i = 1; i <= n; i++) {
                // perulangan untuk mencetak spasi sebelum mencetak angka
                for (int a = n - i; a >= 1; a--) {
                    System.out.print(" ");
                }
                // mencetak angka dari 1 hingga nilai i
                for (int b = 0; b < i; b++) {
                    System.out.print(b + 1);
                }
                System.out.println();
            }
        } else {
            System.out.println();
        }
    }
}
