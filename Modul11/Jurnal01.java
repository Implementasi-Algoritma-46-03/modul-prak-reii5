import java.util.ArrayList;
import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> kalimat = new ArrayList<>();
        String input;

        do {
            input = s.nextLine();

            if (!input.equals("-"))
                kalimat.add(input);

        } while (!input.equals("-"));

        for (int i = 0; i<kalimat.size(); i++) {
            System.out.println("Bulan " + (i + 1) + ": " + kalimat.get(i));
        }
    }}