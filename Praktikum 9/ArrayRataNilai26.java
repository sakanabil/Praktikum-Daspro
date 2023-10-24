import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rataLulus, rataTidakLulus;
        int jmlLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }
        rataLulus = totalLulus / jmlLulus;
        rataTidakLulus = totalTidakLulus / (nilaiMhs.length - jmlLulus);
        System.out.println("Rata-rata Nilai Lulus = "+rataLulus);
        System.out.println("Rata-rata Nilai Tidak Lulus = "+rataTidakLulus);
    }
}