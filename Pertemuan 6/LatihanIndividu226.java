import java.util.Scanner;

public class LatihanIndividu226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        
        System.out.print("Jumlah buku yang dibeli: ");
        int jumlahBuku = input26.nextInt();
        input.nextLine(); // Membaca karakter newline setelah memasukkan jumlah buku
        
        System.out.print("Jenis buku (kamus/novel): ");
        String jenisBuku = input.nextLine();

        double diskon = 0.0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;

            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;

            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else {
                diskon += 0.01;
            }
        } else if (jumlahBuku > 3) {
            diskon = 0.05;
        }

        double totalDiskon = diskon * jumlahBuku;

        System.out.println("Diskon yang diberikan: " + (totalDiskon * 100) + "%");
    }
}