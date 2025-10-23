import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int bilangan = in.nextInt();

        if (24 % bilangan == 0 && 56 % bilangan == 0){
            System.out.println("Faktor dari 24 dan 56");
        }else{
            System.out.println("Bukan faktor dari 24 dan 56");
        }
    }
}
