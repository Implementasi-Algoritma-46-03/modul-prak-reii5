import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);

        int masukan = in.nextInt();
        int[][] board = new int[masukan][masukan];

        // input matriks
        for (int i = 0; i < masukan; i++) {
            for (int j = 0; j < masukan; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int winner = cekPemenang(board, masukan);

        if (winner == 1) {
            System.out.println("O");
        } else if (winner == 2) {
            System.out.println("X");
        } else {
            if (isFull(board, masukan)) {
                System.out.println("-");
            } else {
                System.out.println("?");
            }
        }
    }

    // Cek baris, kolom, diagonal
    private static int cekPemenang(int[][] b, int masukan) {

        // Cek semua baris
        for (int i = 0; i < masukan; i++) {
            int first = b[i][0];
            if (first != 0) {
                boolean sama = true;
                for (int j = 1; j < masukan; j++) {
                    if (b[i][j] != first) {
                        sama = false;
                        break;
                    }
                }
                if (sama) return first;
            }
        }

        // Cek semua kolom
        for (int j = 0; j < masukan; j++) {
            int first = b[0][j];
            if (first != 0) {
                boolean sama = true;
                for (int i = 1; i < masukan; i++) {
                    if (b[i][j] != first) {
                        sama = false;
                        break;
                    }
                }
                if (sama) return first;
            }
        }

        // Cek diagonal utama
        int first = b[0][0];
        if (first != 0) {
            boolean sama = true;
            for (int i = 1; i < masukan; i++) {
                if (b[i][i] != first) {
                    sama = false;
                    break;
                }
            }
            if (sama) return first;
        }

        // Cek diagonal anti (kebalikan)
        first = b[0][masukan-1];
        if (first != 0) {
            boolean sama = true;
            for (int i = 1; i < masukan; i++) {
                if (b[i][masukan - 1 - i] != first) {
                    sama = false;
                    break;
                }
            }
            if (sama) return first;
        }

        return 0; // tidak ada pemenang
    }

    // Cek apakah papan penuh
    private static boolean isFull(int[][] b, int masukan) {
        for (int i = 0; i < masukan; i++) {
            for (int j = 0; j < masukan; j++) {
                if (b[i][j] == 0) return false;
            }
        }
        return true;
    }
}
