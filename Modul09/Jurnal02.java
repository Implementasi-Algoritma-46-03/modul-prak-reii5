import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int masukan = in.nextInt();
        int total = 0;
        for (int i = 1; i <= masukan; i += 2){
            total += i;
        }
        System.out.println(total);
    }
}
 