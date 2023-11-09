import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                //menambahkan pemilihan agar input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari jawaban/number yang di random
                if (answer < 1) {
                    System.out.println("Inputan kurang dari angka 1");
                } else if (answer > 10) {
                    System.out.println("Inputan melebihi angka 10 ");
                } else {
                    success = (answer == number);
                }
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)? ");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
