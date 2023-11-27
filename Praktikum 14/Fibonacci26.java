import java.util.Scanner;

public class Fibonacci26 {
    public static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        }
        return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan ke: ");
        int bulan = sc.nextInt();

        int jumlahPasangan = hitungPasanganMarmut(bulan);
        System.out.println("Total pasangan marmut pada bulan ke-" + bulan + " adalah " + jumlahPasangan);
    }
}