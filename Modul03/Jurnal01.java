import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int jumlahUang = input.nextInt();

        int sisa = jumlahUang  % 1000;
        int jumlahUangPecahan = jumlahUang / 1000;
        System.out.println(jumlahUangPecahan);
        System.out.println(sisa);
    }
}
