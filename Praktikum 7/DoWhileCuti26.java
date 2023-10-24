import java.util.Scanner;

public class DoWhileCuti26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        //loop do while
        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                }
            }else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("Program selesai");
                break;
            }
        } while (jatahCuti > 0);
    }
}