import java.util.Scanner;

public class PemilihanPercobaan126 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input26.nextInt();

        String jenisBilangan = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " adalah bilangan " + jenisBilangan);
    }
}