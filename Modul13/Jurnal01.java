import java.util.*;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int masukan = in.nextInt();
        String[] data = new String[masukan];

        for (int i = 0; i < masukan; i++) {
         data[i] = in.next();
        }

        for (int i = 1; i < masukan; i++) {
            String teks = data[i];
            int indeks = i - 1;

            while (indeks >= 0 && data[indeks].compareTo(teks) < 0) {
             data[indeks + 1] = data[indeks];
                indeks--;
            }
         data[indeks + 1] = teks;
        }

        for (int i = 0; i < masukan; i++) {
            System.out.print(data[i]);
            if (i < masukan - 1) System.out.print(" ");
        }
    }
}
