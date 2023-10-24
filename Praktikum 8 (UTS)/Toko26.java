import java.util.Scanner;

public class Toko26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        //Input nama
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = input26.nextLine();

        //deklarasi variabel
        int totalItem = 0;
        double totalHarga = 0;
        double totalDiskon = 0;

        String tambahProduk = "y";
        //looping while jika tambahProduk = y
        while (tambahProduk.equalsIgnoreCase("y")) {

            System.out.print("Nama Produk: "); //input nama produk
            String namaProduk = input26.nextLine();
            System.out.print("Banyaknya: "); //input kuantitas
            int kuantitas = input26.nextInt();
            System.out.print("Harga Satuan: "); //input harga satuan
            double hargaSatuan = input26.nextDouble();
            System.out.print("Diskon (%): "); //input diskon
            double diskon = input26.nextDouble() / 100;
            double hargaProduk = kuantitas * hargaSatuan; //menghitung harga produk
            double hargaSetelahDiskon = hargaProduk - (hargaProduk * diskon); //menghitung harga setelah diskon

            //menghitung total
            totalItem += kuantitas;
            totalHarga += hargaProduk;
            totalDiskon += hargaProduk * diskon;

            input26.nextLine();
            //input tambahProduk
            System.out.print("Apakah Anda Mau Menambahkan Produk? (Y/T): ");
            tambahProduk = input26.nextLine();
        }
        //input member
        System.out.print("Apakah Pelanggan Member? (Y/T): ");
        String member = input26.nextLine();
        double diskon = 0;
        //menghitung diskon menggunakan nested if
        if (member.equalsIgnoreCase("y")) {
            if (totalHarga >= 200000) {
                diskon = 0.1;
            } else {
                diskon = 0.05;
            }
        }

        //output
        System.out.println("----------Total Pembelian----------");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Total Item Barang yang Dibeli: " + totalItem);
        System.out.println("Subtotal: " + totalHarga);
        System.out.println("Total Diskon: " + totalDiskon);
        System.out.println("Total yang Harus Dibayar: " + (totalHarga - totalDiskon));
        System.out.println("-----------------------------------");
    }
}