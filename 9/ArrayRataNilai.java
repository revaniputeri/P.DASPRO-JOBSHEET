import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double totallulus = 0, totalTidaklulus = 0;
        double rata2lulus, rata2tidaklulus;
        int jml_lulus = 0, jml_tidakLulus = 0;
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahmahasiswa = sc.nextInt();

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (i < jumlahmahasiswa) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilaiMhs[i] = sc.nextInt();
                if (nilaiMhs[i] > 70) {
                    jml_lulus++;
                    totallulus += nilaiMhs[i];
                } else {
                    jml_tidakLulus++;
                    totalTidaklulus += nilaiMhs[i];
                }
            }
        }
        rata2lulus = (jml_lulus> 0) ? totallulus / jml_lulus : 0;
        rata2tidaklulus = (jml_tidakLulus> 0) ? totalTidaklulus / jml_tidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = "+rata2lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2tidaklulus);
    }
}
