import java.util.Scanner;
public class PemilihanPercobaan206 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        System.out.println("Masukkan nilai UAS  : ");
        float uas = input06.nextFloat();
        System.out.println("Masukkan nilai UTS  : ");
        float uts = input06.nextFloat();
        System.out.println("Nilai Kuis          : ");
        float kuis = input06.nextFloat();
        System.out.println("Nilai tugas         : ");
        float tugas = input06.nextFloat();

        float total = (uas * 0.4F)+(uts * 0.3F)+(kuis * 0.1F)+(tugas * 0.2F);

        String message = total < 65 ? "Remidi" :"Tidak Remidi";
        System.out.println("Nilai akhir = "+ total +" sehingga "+message);
        
    }
}