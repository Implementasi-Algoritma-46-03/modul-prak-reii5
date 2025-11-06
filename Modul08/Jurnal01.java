import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        double gram = input.nextDouble(); // input berat awal dalam gram
        int N = input.nextInt();          // input jumlah hari

        double sisa = gram;               // variabel untuk menyimpan berat sisa
        int hari = 0;                     // penghitung hari

        // Setiap 10 hari berat akan berkurang setengahnya
        while (hari + 10 <= N)  {
            sisa = sisa / 2;
            hari += 10;
        }

        System.out.printf("%.3f", sisa);  // menampilkan hasil dengan 3 angka di belakang koma
    }
}
