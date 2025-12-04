import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int masukan = in.nextInt();

        int[][] matriks = new int[masukan][masukan];

        for (int i=0; i<masukan; i++) {
            for (int j=0; j<masukan; j++) {
                matriks[i][j] = in.nextInt();
            }
        }

        for (int i=masukan-1; i>=0; i--) {
            for (int j=0; j<masukan; j++) {
                System.out.print(matriks[i][j]);
                if (j < masukan -1)
                    System.out.print(" ");
            }
            System.out.println();     
         }}}