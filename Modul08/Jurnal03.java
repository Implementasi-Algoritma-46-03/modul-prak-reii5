import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();       // angka yang akan diuji
        int originalNumber = number;          // menyimpan angka asli
        int sumFactorials = 0;                // untuk menampung jumlah faktorial setiap digit
        int digit;

        // Memecah setiap digit dan menghitung faktorialnya
        do {
            digit = number % 10;              // ambil digit terakhir
            sumFactorials += factorial(digit); // tambahkan faktorial digit ke total
            number /= 10;                     // hapus digit terakhir
        } while (number > 0);

        // Mengecek apakah jumlah faktorial digit sama dengan angka aslinya
        if (sumFactorials == originalNumber) {
            System.out.println("YA");         // jika sama → angka spesial
        } else {
            System.out.println("BUKAN");      // jika tidak sama
        }
    }

    // Method untuk menghitung faktorial dari suatu angka n
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;                      // result = result × i
        }
        return result;
    }
}
