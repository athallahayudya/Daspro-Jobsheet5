import java.util.Scanner;

public class LatIndu1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jarak;

        System.out.println("Masukkan jarak: ");
        jarak = input.nextInt();

        if (jarak <= 5) {
            System.out.println("Anda menggunakan Melee weapon ");
        }else if( jarak <=1000){
            System.out.println("Anda menggunakan Ranged weapon");
        }
    }
}
