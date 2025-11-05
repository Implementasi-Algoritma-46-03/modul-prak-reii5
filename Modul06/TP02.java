import java.util.Scanner;

public class TP02 {
    public static String hapus(String text){
        return text.replaceAll("[AIUEOaiueo]", "");
    }

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);

        String teks = in.nextLine();
        String hasil = hapus(teks);
        System.out.println(hasil);
    }
}
