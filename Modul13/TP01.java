import java.util.Scanner;
import java.util.ArrayList;

public class TP01 {
    public static float[][] hasilSortng(float[][] data){
        for (int i = 0; i< 2; i++){
            for(int j = 1; j < 10;j++){
                for(int k = 10-1; k>=1;k--){
                    if  (data[i][k] < data[i][k - 1]){
                        float temp = data[i][k];
                        data[i][k] = data[i][k -1];
                        data[i][k - 1] = temp;
                    }
                }
            }
        }
        return data;
    }
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);

        float[][] data = new float[2][10];

        for (int i =  0; i < 2; i++){
            for (int j = 0;j < 10; j++){
                data[i][j] = in.nextFloat();
            }
        }

        float[][] hasil = hasilSortng(data);

        for(int i = 0; i <2; i++){
            for (int j = 0; j < 10;j++){
                System.out.printf("%.2f",hasil[i][j]);
                if (j <10-1){
                System.out.print(" ");}
            }
            System.out.println();
        }

        

    }
}