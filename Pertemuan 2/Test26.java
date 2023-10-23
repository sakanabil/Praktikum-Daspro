import java.util.Scanner;
public class Test26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
double nilaiMatdas, nilaiDaspro, nilaiBing, nilaiKti, nilaiCtps, nilaiPancasila, nilaiK3, rataRata, totalNilai;
        System.out.println("Masukkan nilai Matdas");
        nilaiMatdas = input.nextDouble();
        System.out.println("Masukkan nilai Daspro");
        nilaiDaspro = input.nextDouble();
        System.out.println("Masukkan nilai BING");
        nilaiBing = input.nextDouble();
        System.out.println("Masukkan nilai KTI");
        nilaiKti = input.nextDouble();
        System.out.println("Masukkan nilai CTPS");
        nilaiCtps = input.nextDouble();
        System.out.println("Masukkan nilai Pancasila");
        nilaiPancasila = input.nextDouble();
        System.out.println("Masukkan nilai K3");
        nilaiK3 = input.nextDouble();
        totalNilai = nilaiMatdas+nilaiDaspro+nilaiBing+nilaiKti+nilaiCtps+nilaiPancasila+nilaiK3;
        rataRata = totalNilai / 7;
        System.out.println("Rata-rata nilai adalah " + rataRata);
    }
}