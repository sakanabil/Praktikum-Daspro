import java.util.Scanner;
public class operatorairmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = input.nextInt();
        double totalNilai = 0;
        for (int i = 1; i <= jumlahMataKuliah; i++) {
            System.out.print("Masukkan nilai mata kuliah ke-" + i + ": ");
            totalNilai += input.nextDouble();
        }
        double rataRata = totalNilai / jumlahMataKuliah;
        System.out.println("Nilai rata-rata mahasiswa: " + rataRata);
        input.close();
    }
}