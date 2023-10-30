import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi dan inisialisasi array penonton
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) { // Looping
            System.out.println("Menu:");
            System.out.println("1.Input data penonton");
            System.out.println("2.Tampilkan daftar penonton");
            System.out.println("3.Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) { // Input data penonton
                System.out.println("Input data penonton");
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                boolean kursiTersedia = true;
                while (kursiTersedia) {
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    // Validasi penonton
                    if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            kursiTersedia = false;
                            System.out.println("Nomor baris atau kolom kursi tersedia, data disimpan.");
                        } else {
                            System.out.println("Nomor baris atau kolom kursi tidak tersedia, data gagal disimpan.");
                            System.out.println("Silahkan memasukkan baris dan kolom kembali.");
                        }
                    }
                }
            // Tampilkan daftar penonton
            } else if (menu == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***" );
                        }
                    }
                }
            // Exit
            } else if (menu == 3) {
                break;
            }
        }
    }
}