import java.util.Scanner;

public class Suhu26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        int suhu;
        char hujan;

        System.out.print("Masukkan suhu: ");
        suhu = input26.nextInt();
        input26.nextLine(); 

        if (suhu > 27) {
            System.out.println("Memakai dress");
            System.out.print("Apakah hujan? (y/n): ");
            hujan = input26.nextLine().charAt(0);
            if (Character.toLowerCase(hujan) == 'y') {
                System.out.println("Membawa payung");
            }else{
                System.out.println("Memakai sunscreen");
            }
        } else {
            System.out.println("Memakai celana panjang");
        }
    }
}