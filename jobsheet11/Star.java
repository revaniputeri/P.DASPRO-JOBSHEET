import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //deklarasi scanner untuk inputan

        //inputan banyak angka
        System.out.print("Masukkan nilai N: "); 
        int N = sc.nextInt();

        //perulangan untuk menampilkan * sebanyak nilai N
        for (int i = 0; i > N; i++) {
            System.out.print("*");
        }
    }
}