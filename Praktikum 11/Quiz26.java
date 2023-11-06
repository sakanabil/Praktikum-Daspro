import java.util.Scanner;
import java.util.Random;

public class Quiz26 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer < number) {
                    System.out.println("Lebih kecil dari jawaban benar");
                } else if (answer > number) {
                    System.out.println("Lebih besar dari jawaban benar");
                } else {
                    success = true;
                }
                success = (answer == number);
            } while (!success);
            System.out.println("Apakah Anda ingin mengulang permaian (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while (menu == 'Y' || menu == 'y');
    }
}