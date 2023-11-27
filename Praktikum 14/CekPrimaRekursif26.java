import java.util.Scanner;

public class CekPrimaRekursif26 {
    public static int bilPrima(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? 1 : 0;
        }
        if (n % i == 0) {
            return 0;
        }
        if (i * i > n) {
            return 1;
        }
        return bilPrima(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();
        int result = bilPrima(n, 2);
        if (result == 1) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
}