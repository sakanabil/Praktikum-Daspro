import java.util.Scanner;

public class TugasIndividu226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input nilai N
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();

        // proses mencetak segitiga
        for (int i=N; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}