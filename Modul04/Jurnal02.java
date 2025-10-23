import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int penghasilan1 = in.nextInt();
        int penghasilan = penghasilan1 * 1000000;

        double jumlahPajak = 0;
        String pajak = "";


        if (penghasilan1 <= 50){
            jumlahPajak = penghasilan * 0.05;
            pajak = "5%";
        }else if (penghasilan1 > 50 && penghasilan1 <= 250){
            jumlahPajak = penghasilan * 0.15;
            pajak = "15%";
        }else if (penghasilan1 > 250 && penghasilan1 <= 500){
            jumlahPajak = penghasilan * 0.25;
            pajak = "25%";
        }else if (penghasilan1 > 500){
            jumlahPajak = penghasilan * 0.30;
            pajak = "30%";
        }

        int jumlahPajak1 = (int) jumlahPajak;
        int penghasilanBersih = penghasilan - jumlahPajak1;

        System.out.println("Penghasilan kotor = " + penghasilan1 + " juta Rupiah");
        System.out.println("Pajak " + pajak + " = Rp. " + jumlahPajak1);
        System.out.println("Penghasilan bersih = Rp. " + penghasilanBersih);

    }
}
