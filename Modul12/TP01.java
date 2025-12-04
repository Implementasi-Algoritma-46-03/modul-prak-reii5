import java.util.Scanner;

public class TP01 {

    
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);

        int masukan = in.nextInt();

        int[][] matrix = new int[masukan][masukan];

        for (int i = 0; i < masukan;i++){
            for(int j =0; j < masukan;j++){
            matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0;i < masukan;i++){
            for(int j = 0;j < masukan/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][masukan - 1-j];
                matrix[i][masukan-1-j] = temp;
            }
        }
        
        for (int i =0; i < masukan;i++){
            for(int j=0; j < masukan; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}