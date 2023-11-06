import java.util.Scanner;

public class TugasIndividu126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input nilai N
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();

        // proses mencetak segitiga
        for (int i=1; i<=N; i++) {
            for (int j=N-i; j>0; j--) {
                System.out.print("  ");
            }
            for (int k=1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}