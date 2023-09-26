import java.util.Scanner;
public class LatIndu2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int username = 123;
        int password = 999;
        System.out.println("Masukkan Username dan Password");
        System.out.println("Username    : ");
        int user = input.nextInt();
        System.out.println("Password    : ");
        int pw = input.nextInt();

        if (user == username && pw == password) {
            System.out.println("Berhasil Login");
        } else {
            System.out.println("Coba lagi");
        }

    }
}