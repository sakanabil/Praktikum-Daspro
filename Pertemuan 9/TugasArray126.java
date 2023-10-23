import java.util.Scanner;

public class TugasArray126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: "); //input jumlah elemen
        int jumlahElemen = sc.nextInt();
        int[] nilaiElemen = new int[jumlahElemen];
        double total = 0;
        double rataRata;
        
        //input nilai elemen
        for (int i = 0; i < nilaiElemen.length; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + " : ");
            nilaiElemen[i] = sc.nextInt();
            total += nilaiElemen[i];
        }

        int nilaiTertinggi = nilaiElemen[0];
        int nilaiTerendah = nilaiElemen[0];

        for (int i = 1; i < nilaiElemen.length; i++) {
            if (nilaiElemen[i] > nilaiTertinggi) { //menghitung nilai tertinggi
                nilaiTertinggi = nilaiElemen[i];
            }
            if (nilaiElemen[i] < nilaiTerendah) { //menghitung nilai terendah
                nilaiTerendah = nilaiElemen[i];
            }
        }

        rataRata = total / nilaiElemen.length; //menghitung rata-rata
        //output
        System.out.println("Rata-rata Nilai = " + rataRata);
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai terendah = " + nilaiTerendah);
    }
}