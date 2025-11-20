import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);

        int masukan = in.nextInt();
        int s = 0;
        for (int i = masukan; i >= 1; i--){

            for(int j = 0; j < i; j++) {               
                System.out.print(s);
                s++;
                if(s > 9){
                    s = 0;
                }
            }
            System.out.println();
        }
    }
}
 