import java.util.Scanner;

public class Individu126 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
         
        int Jarak;
        System.out.print("Masukkan Jarak: ");
        Jarak = input26.nextInt();

        if (Jarak <= 5) {
            System.out.println("Gunakan Melee Weapon");
        } else {
            System.out.println("Gunakan Ranged Weapon");
        }
        }
            
        }