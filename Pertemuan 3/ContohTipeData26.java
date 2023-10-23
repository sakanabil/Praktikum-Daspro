public class ContohTipeData26 {

    public static void main(String[] args) {
        char golonganDarah = 'A';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamSatuDusun = 1300;
        float suhu = 60.50;
        double berat = 0.84321234344;
        long saldo = 1500000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah\t\t\t\t\t: " + (byte) golonganDarah);
        System.out.println("Jarak\t\t\t\t\t\t: " + jarak);
        System.out.println("Jumlah penduduk dalam satu dusun\t\t: " + jumlahPendudukDalamSatuDusun);
        System.out.println("Suhu\t\t\t\t\t\t: " + suhu);
        System.out.println("Berat\t\t\t\t\t\t: " + (float) berat);
        System.out.println("Saldo\t\t\t\t\t\t: " + saldo);
        System.out.println("Angka desimal\t\t\t\t\t: " + angkaDesimal);
    }
}