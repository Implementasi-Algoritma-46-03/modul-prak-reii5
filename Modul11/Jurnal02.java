import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String kalimat = s.nextLine();

        String[] arr = kalimat.split("\\s+");
        String hasil = String.join(" ", arr);

        System.out.println(hasil);
    }}
    