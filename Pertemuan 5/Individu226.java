import java.util.Scanner;

public class Individu226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        String username ="Saka Nabil";
        String password ="Saka12345";

        System.out.print("Masukkan username: ");
        username = input26.nextLine();
        System.out.print("Masukkan password: ");
        password = input26.nextLine();

        if (username.equals("Saka Nabil") && password.equals("Saka12345")) {
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Username dan Password Salah");
        }
    }
        }



