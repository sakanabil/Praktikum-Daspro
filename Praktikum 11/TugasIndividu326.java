import java.util.Scanner;

public class TugasIndividu326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input nilai N
        System.out.print("Masukkan Nilai N (minimal 3): ");
        int N = sc.nextInt();

        // proses mencetak persegi angka
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}