import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //inputan nilai N dengan minimal inputan 3
        System.out.print("Enter the number N (minimum 3): ");
        int N = input.nextInt();
        
        //Memeriksa apakah nilai N kurang dari 10.
        //limit 10 karena jika lebih dari 9 output tidak membentuk kotak seperti contoh
        if (N < 10) {
            //Memeriksa apakah nilai N lebih besar dari 2.
            if (N > 2) {
                //mengontrol jumlah baris dalam pola.
                for(int i = 1; i <= N; i++) {
                    //Memeriksa apakah ini adalah baris pertama atau terakhir.
                    if (i == 1 || i == N) {
                        //mencetak angka N sebanyak N kali pada baris pertama dan terakhir.
                        for (int j = 1; j <= N; j++) {
                            System.out.print(N + " ");
                        }
                        System.out.println();
                    } else {//ini akan dijalankan jika bukan baris pertama atau terakhir.
                        //apakah kolom pertama atau terakhir, mencetak angka N.
                        for (int k = 1; k <= N; k++) {
                            //Jika ini adalah kolom di antara kolom pertama dan terakhir, mencetak spasi
                            if (k == 1 || k == N) {
                                System.out.print(N + " ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                }        
            } else { //dijalankan jika nilai N kurang dari atau sama dengan 2.
                System.out.println("Nilai N <= 2");
            }
        } else if (N < 3) { //ini akan dijalankan jika nilai N kurang dari 3.
            System.out.println("Nilai N < 3");
        } else {//jika nilai N lebih dari atau sama dengan 10.
            System.out.println("nilai N >= 10");
        }
    }
}