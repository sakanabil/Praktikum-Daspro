import java.util.Scanner;

public class WhileGaji26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi
        int jumlahKaryawan, jumlahJamLembur, i;
        double gajiLembur, totalGajiLembur;
        gajiLembur = 0;
        totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan : ");
        jumlahKaryawan = sc.nextInt();

        i = 0;

        //loop while dan continue
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + " : ");
            jabatan = sc.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = sc.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan tidak valid");
                i--;
                continue;
            }
            
            //total gaji lembur
            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur: " + totalGajiLembur);
        }
    }
}