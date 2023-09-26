import java.util.Scanner;
public class PemilihanPercobaan206_1 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        String nilai_huruf;

        System.out.println("Masukkan nilai UAS  : ");
        float uas = input06.nextFloat();
        System.out.println("Masukkan nilai UTS  : ");
        float uts = input06.nextFloat();
        System.out.println("Nilai Kuis          : ");
        float kuis = input06.nextFloat();
        System.out.println("Nilai tugas         : ");
        float tugas = input06.nextFloat();

        float total = (uas * 0.4F)+(uts * 0.3F)+(kuis * 0.1F)+(tugas * 0.2F);

        if (total >80 && total <=100) {
            nilai_huruf= "A" ;
        } else if(total >73 && total <=80){
            nilai_huruf= "B+" ;
        }else if(total >65 && total <=73){
            nilai_huruf= "B";
        }else if(total >60 && total <=65){
            nilai_huruf= "C+";
        }else if(total >50 && total <=60){
            nilai_huruf= "C";
        }else if(total >39 && total <= 50){
            nilai_huruf= "D";
        }else{
            nilai_huruf= "E";
        }

        String message = total < 65 ? "Remidi" :"Tidak Remidi";
        System.out.println("Nilai huruf = "+ nilai_huruf);
        System.out.println("Nilai akhir = "+ total +" sehingga "+message);
        
    }
}