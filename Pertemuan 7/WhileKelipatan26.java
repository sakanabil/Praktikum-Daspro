import java.util.Scanner;

public class WhileKelipatan26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int kelipatan, jumlah, counter, i;
        jumlah = 0;
        counter = 0;
        double rataRata = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = sc.nextInt();

        // loop while
        i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                rataRata = (double) jumlah / counter;
            }
            i++;
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }
}