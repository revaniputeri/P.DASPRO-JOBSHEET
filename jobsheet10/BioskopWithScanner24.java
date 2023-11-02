import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next, userChoice;
        String penonton[][] = new String[4][2];
        boolean running = false;
        while (!running) {
            System.out.println("");
            System.out.println("============Menu============");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("============================");
            System.out.print("Masukkan menu (1-3): ");
            userChoice = sc.nextLine();

            if (userChoice.equalsIgnoreCase("1")) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (userChoice.equalsIgnoreCase("2")) {
                System.out.println("Daftar penonton bioskop");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
                }
                continue;
            } else {
                break;
            }
        }

    }
}
