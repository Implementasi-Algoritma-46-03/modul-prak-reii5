import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        String namaPembeli = input.nextLine();
        int Jumlah_Barang = input.nextInt();
        int Harga_perbarang = input.nextInt();

        int Total_harga = Jumlah_Barang * Harga_perbarang;

        System.out.println("Hi, " + namaPembeli + ". Total belanja adalah " + Total_harga + " rupiah.");
    }
}
