import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        // outer loop untuk menampilkan banyaknya baris inner loop yang di tampilkan
        for (int iOuter = 1; iOuter <= N; iOuter++) { 
            // inner loop untuk menampilkan banyak N kesamping / sebagai kolom
            for (int i = 1; i <= N; i++) { 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}