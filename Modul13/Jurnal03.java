import java.util.Scanner;

public class Jurnal03 {

    public static void binarySearch(String[] data, String target) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (data[mid].equals(target)) {
                System.out.println("Ditemukan di indeks ke-" + mid);
                return;
            }

            if (target.compareTo(data[mid]) < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Data tidak ditemukan");
    }

    public static void sort(String[] data, int n) {
        for (int i = 1; i < n; i++) {
            String key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].compareTo(key) > 0) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
    }

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine(); // buang newline

        String[] data = new String[n];

        for (int i = 0; i < n; i++) {
            data[i] = in.next();
        }

        String search = in.next();

        sort(data, n);
        binarySearch(data, search);
    }
}
