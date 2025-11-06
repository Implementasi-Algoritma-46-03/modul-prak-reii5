import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();       // angka yang akan diuji
        int originalNumber = number;          // menyimpan angka asli
        int sumFactorials = 0;                // total faktorial setiap digit
        int digit;

        // Memecah angka menjadi digit dan menjumlahkan faktorial tiap digit
        do {
            digit = number % 10;              // ambil digit terakhir
            sumFactorials += factorial(digit); // tambahkan hasil faktorial ke total
            number /= 10;                     // hapus digit terakhir
        } while (number > 0);

        // Menentukan apakah angka tersebut "strong number"
        if (sumFactorials == originalNumber) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }

    // Method untuk menghitung faktorial dari angka n
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
