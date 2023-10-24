import java.util.Scanner;

public class LatihanIndividuA26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaMahasiswa = new String[30];
        String[] jenisKelamin = new String[30];

        for (int i = 0; i < 30; i++) {
            System.out.print("Masukkan nama mahasiswa: ");
            namaMahasiswa[i] = sc.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            jenisKelamin[i] = sc.nextLine();
        }

        System.out.println("Daftar mahasiswa perempuan:");
        for (int i = 0; i < 30; i++) {
            if (jenisKelamin[i].equalsIgnoreCase("P")) {
                System.out.println(namaMahasiswa[i]);
            }
        }
    }
}