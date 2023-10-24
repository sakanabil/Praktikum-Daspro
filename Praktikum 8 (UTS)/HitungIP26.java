import java.util.Scanner;

public class HitungIP26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input nama mahasiswa
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        //deklarasi variabel
        int totalSKS = 0;
        double totalNilai = 0;
        int jumlahRemidi = 0;
        int totalMatkul = 0;
        String lanjut = "y";

        //looping menggunakan while jika lanjut = y
        while (lanjut.equalsIgnoreCase("y")) {

            System.out.print("Nama Mata Kuliah: "); //input nama mata kuliah
            String namaMatkul = input.nextLine();

            System.out.print("Indeks Nilai (A, B+, B, C+, C, D, E): "); //input indeks nilai
            String indeksNilai = input.nextLine();

            System.out.print("Jumlah SKS: "); //input jumlah sks
            int sks = input.nextInt();

            //konversi nilai
            double nilai = 0;
            if (indeksNilai.equalsIgnoreCase("A")) {
                nilai = 4.0;
            } else if (indeksNilai.equalsIgnoreCase("B+")) {
                nilai = 3.5;
            } else if (indeksNilai.equalsIgnoreCase("B")) {
                nilai = 3.0;
            } else if (indeksNilai.equalsIgnoreCase("C+")) {
                nilai = 2.5;
            } else if (indeksNilai.equalsIgnoreCase("C")) {
                nilai = 2.0;
            } else if (indeksNilai.equalsIgnoreCase("D")) {
                nilai = 1.0;
                jumlahRemidi++; //menghitung jumlah remidi
            } else if (indeksNilai.equalsIgnoreCase("E")) {
                nilai = 0.0;
                jumlahRemidi++; //menghitung jumlah remidi
            }

            totalSKS += sks; //menghitung total sks
            totalNilai += nilai * sks; //menghitung total nilai yang kemudian akan digunakan untuk menghitung ip
            totalMatkul++; //menghitung total mata kuliah

            input.nextLine();
           
            //input lanjut (Y/T)
            System.out.print("Apakah Lanjut Input Nilai? (Y/T): ");
            lanjut = input.nextLine();
        }
        
        //menghitung ip
        double ip = totalNilai / totalSKS;

        //output
        System.out.println("----------Hasil Perhitungan----------");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.printf("Indeks Prestasi (IP)\t: %.2f%n ", ip);
        System.out.println("Jumlah Mata Kuliah\t: " + totalMatkul);
        System.out.println("Jumlah SKS\t\t: " + totalSKS);
        System.out.println("Jumlah Mata Kuliah yang Harus Perbaikan/Remidi\t: " + jumlahRemidi);
        System.out.println("---------------------------------------");
    }
}