import java.util.Scanner;

public class LinearSearch26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: "); // input jumlah elemen
        int jmlhArray = sc.nextInt();
        int[] arrayInt = new int[jmlhArray]; // inisialisasi array
        int key;
        int hasil = 0;

        // looping for input elemen array
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        
        // input key yang ingin dicari
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        // looping untuk mencari key
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        
        // output
        if (hasil != 0) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        } else {
        System.out.println("Key tidak ditemukan");
        }
    }
}