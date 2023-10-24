import java.util.Scanner;

public class PemilihanPercobaan226 {
    public static void main(String[] args) {
        Scanner input26 =new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input26.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input26.nextFloat();
        System.out.print("Nilai kuis     : ");
        float kuis = input26.nextFloat();
        System.out.print("Nilai tugas     : ");
        float tugas = input26.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if (total > 80 && total <= 100) {
            System.out.println("nilai A dengan kualisifikasi sangat baik" );
        }else if (total > 73 && total <= 80) {
            System.out.println("nilai B+ dengan kualisifikasi lebih dari baik" ); 
        }else if (total > 65 && total <= 73) {
            System.out.println("nilai B dengan kualisifikasi baik" );
        }else if (total > 60 && total <= 65) {
            System.out.println("nilai C+ dengan kualisifikasi lebih dari cukup" );
        }else if (total > 50 && total <= 60) {
            System.out.println("nilai C dengan kualisifikasi cukup" );
        }else if (total > 39 && total <= 50) {
            System.out.println("nilai D dengan kualisifikasi kurang" );
        }else{
            System.out.println("nilai E dengan kualisifikasi gagal" );
            
        }
    }
    
}
    
