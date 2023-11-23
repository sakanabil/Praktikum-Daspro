import java.util.Scanner;
public class Kubus26 {
    public static int hitungVolume(int s){
        int volume=s*s*s;
        return volume;
    }
    public static int hitungLuasPermukaan(int s){
        int luasPermukaan=6*s*s;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sisi :");
        int sisi=input.nextInt();

        System.out.println("Volume kubus adalah :" +hitungVolume(sisi));
        System.out.println("Luas permukaan adalah :" +hitungLuasPermukaan(sisi));
    }
}