import java.util.Scanner;

public class Individu326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i=1;
        while(i<=N){
            int j=0;
            while(j<N){
                System.out.print("  *  ");
                j++;
            }
            i++;
            System.out.println("  *  ");
        }
    }
}
