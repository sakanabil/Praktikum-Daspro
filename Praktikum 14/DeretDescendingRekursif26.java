import java.util.Scanner;
public class DeretDescendingRekursif26 {
    // Fungsi rekursif
    public static void deretRekursif(int n) {
        if (n >= 0) {
            System.out.println(n);
            deretRekursif(n - 1);
        }
    }

    // Fungsi iteratif
    public static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Masukkan bilangan: ");
        int n = sc.nextInt();
        System.out.println("Deret menggunakan fungsi rekursif:");
        deretRekursif(n);
        System.out.println("\nDeret menggunakan fungsi iteratif:");
        deretIteratif(n);
    }
}

     System.out.print(hasil);
        for (int i = 1; i < f; i++) {
            System.out.print("x" + hasil);
        }

        System.out.println(" = " + penjumlahanRekursif(f, f - 1));