import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int nilaiUjian1 = input.nextInt();
        int nilaiUjian2 = input.nextInt();
        int nilaiUjian3 = input.nextInt();

        int nilaiRatarata = (nilaiUjian1 + nilaiUjian2 + nilaiUjian3) / 3;

        System.out.printf("Nilai rata-rata: %.2f", (double) nilaiRatarata);
    }
}
