import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class TP02 {
    
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        Integer[] poin = new Integer[N];

        for (int i = 0; i < N; i++) {
            poin[i] = s.nextInt();
        }

        Arrays.sort(poin, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            System.out.print(poin[i] + " ");
        }}}