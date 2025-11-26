import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int jumlah = in.nextInt();
        in.nextLine();
        String[] list_nama = new String[jumlah];
        for (int i = 0; i < jumlah; i++){
           list_nama[i] = in.nextLine();
        }
        for (int i = 0; i < jumlah; i++){
            System.out.println("Bulan " + (i + 1) + ": " + list_nama[i]);
        }
    }
}
