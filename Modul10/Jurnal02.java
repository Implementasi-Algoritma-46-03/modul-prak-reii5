import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);

        int masukan = in.nextInt();

        for (int i = 1; i <= masukan; i++){

            for (int j = 1; j <= masukan; j++){
                System.out.printf("%-4d", i *j);
            }
            System.out.println();
        }
    }
}
