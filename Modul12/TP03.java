import java.util.Scanner;

public class TP03 {

    public static int[][] array(Scanner in, int masukan){
        int[][] array1 = new int[masukan][masukan];
        for (int i =0;i < masukan; i++){
            for(int j =0; j< masukan;j++){
                array1[i][j] = in.nextInt();
            }
        }
        return array1;
    }

    public static int[][] hasil(int[][] array1, int[][] array2, int masukan){
        int[][] hasilnya = new int[masukan][masukan];
        for (int i = 0; i < masukan; i++){
            for (int j = 0;j < masukan;j++){
                hasilnya[i][j] = 0;
                for (int k = 0; k < masukan ;k++){
                    hasilnya[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return hasilnya;
    }

    public static void print(int[][] hasil, int masukan){
        for(int i = 0;i < masukan;i++){
            for (int j = 0;j <masukan;j++){
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int masukan = in.nextInt();

        int[][] array1 = array(in, masukan);
        int[][] array2 = array(in, masukan);

        int[][] hasil = hasil(array1, array2, masukan);
        print(hasil, masukan);
    

    }
}
