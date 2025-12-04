import java.util.Scanner;

public class TP02 {
    
    public static int[][] array01(Scanner in, int masukan){
        
        int[][] array1 = new int[masukan][masukan];
        for (int i = 0;i < masukan; i++){
            for (int j = 0;j < masukan;j++){
                array1[i][j] = in.nextInt();
            }
        }
        return array1;
    }
    
    
    public static int[][] hasil(int[][] array1, int[][] array2, int masukan){
        int[][] hasil = new int[masukan][masukan];
        for (int i = 0; i < masukan;i++){
            for (int j =0; j < masukan;j++){
                hasil[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return hasil;
    }
    

    public static void print(int[][] array, int masukan){
        for (int i = 0;i < masukan; i++){
            for (int j = 0;j < masukan;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int masukan = in.nextInt();
        
        int[][] array1 = array01(in, masukan);
        int[][] array2= array01(in, masukan);

        int[][] hasilnya = hasil(array1, array2, masukan);
        print(hasilnya, masukan);

        
    }
}