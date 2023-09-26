import java.util.Scanner;
public class PemilihanPercobaan106_1 {

    public static void main(String[] args) {
        int angka;
        String hasil;
        Scanner input06 = new Scanner (System.in);

        System.out.println("Masukkan angka : ");
        angka = input06.nextInt();

        hasil = (angka % 2 == 0) ? " bilangan genap" : " bilangan ganjil";
        System.out.println("Angka "+ angka + " adalah "+hasil);
    }
}