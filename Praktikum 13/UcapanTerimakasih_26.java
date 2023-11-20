import java.util.Scanner;

public class UcapanTerimakasih_26 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Ucapan Tambahan:");
        String ucapan = sc.nextLine();
        sc.close();
        UcapanTambahan("Ucapan Tambahan : " + ucapan);
    }
}