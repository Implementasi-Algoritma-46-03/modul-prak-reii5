import java.util.Scanner;
import java.util.Arrays;

public class TP02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] poin = new int[N];

        for (int i = 0; i < N; i++) {
            poin[i] = s.nextInt();
        }

        Arrays.sort(poin); 

   
        for (int i = 0; i < N / 2; i++) {
            int tmp = poin[i];
            poin[i] = poin[N - 1 - i];
            poin[N - 1 - i] = tmp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(poin[i]);
            if (i < N - 1) System.out.print(" ");
        }

    }
}
