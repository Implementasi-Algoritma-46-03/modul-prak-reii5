import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int Dira = in.nextInt();
        int Radi = in.nextInt();
        int Idar = in.nextInt();


        if (Dira < Radi && Dira < Idar){
            if (Radi < Idar){
                System.out.println("Dira, Radi, Idar");
            }else{
                System.out.println("Dira, Idar, Radi");
            }
        }else if (Radi < Dira && Radi < Idar){
            if (Dira < Idar){
                System.out.println("Radi, Dira, Idar");
            }else{
                System.out.println("Radi, Idar, Dira");
            }
        }else if (Idar < Dira && Idar < Radi){
            if (Radi < Dira){
                System.out.println("Idar, Radi, Dira");
            }else {
                System.out.println("Idar, Dira, Radi");
            }
        }
    }
}
