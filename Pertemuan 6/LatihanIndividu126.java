import java.util.Scanner;

public class LatihanIndividu126 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan bilangan 1: ");
        int bil1 = input26.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        int bil2 = input26.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        int bil3 = input26.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("bilangan terbesar adalah" + bil1);
            } else {
                System.out.println("bilangan terbesar adalah " + bil3);
            }
        } else {
            if (bil2 > bil3)  {
                System.out.println("bilangan terbesar adalah " + bil2);
            } else {
                System.out.println("bilangan terbesar adalah " + bil3);
            }
         }
    }
}

    
                