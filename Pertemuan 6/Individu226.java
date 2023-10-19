import java.util.Scanner;

public class Individu226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan jenis buku: ");
        String jenisBuku = input26.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input26.nextInt();

        System.out.print("Masukkan harga buku: ");
        double harga = input26.nextDouble();

        double diskon = 0;

        // Nested If
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else if (jenisBuku.equalsIgnoreCase("Lainnya")) {
            diskon = 0;
            if (jumlahBuku > 3) {
                diskon += 5;
            }
        }
        double totalBayar = jumlahBuku * harga;

        //output
        System.out.println("Diskon yang diberikan: " + diskon + "%");
        System.out.println("Total yang harus dibayar: Rp" + (totalBayar - (totalBayar * diskon / 100)));
    }
}
       
       