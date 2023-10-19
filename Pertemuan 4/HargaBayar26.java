import java.util.Scanner;

public class HargaBayar26 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int harga, jumlah, jmlHalamanBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan merk buku yang dibeli ");
        merkBuku=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku yang dibeli ");
        jmlHalamanBuku=input.nextInt();
        System.out.println("Masukkan diskon dalam persen ");
        dis=input.nextDouble();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*(dis/100);
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}