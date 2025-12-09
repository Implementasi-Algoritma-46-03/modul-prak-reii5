import java.util.Scanner;

public class TP03 {

    public static int linearSearch(int[] data, int key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int jumlah = in.nextInt();
        int[] data = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            data[i] = in.nextInt();
        }

        int key = in.nextInt();

        int hasil = linearSearch(data, key);

        if (hasil != -1) {
            System.out.println("Ditemukan di indeks ke-" + hasil);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}
