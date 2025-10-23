import java.util.Scanner;

public class TP01 {
    public static void konversCel(double suhu){
        double celcius = 5.0 / 9 * (suhu - 32); 
        System.out.print("Celcius: ");
        System.out.printf("%.1f", celcius);
    }
    public static void konversiRea(double suhu){
        double reamur = 4.0 / 9 * (suhu - 32);
        System.out.print("Reamur: ");
        System.out.printf("%.2f", reamur);
    }
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        double suhu1 = in.nextDouble();
        double suhu2 = in.nextDouble();
        double suhu3 = in.nextDouble();

        konversCel(suhu1);
        System.out.println();
        konversCel(suhu2);
        System.out.println();
        konversCel(suhu3);
        System.out.println();
        konversiRea(suhu1);
        System.out.println();
        konversiRea(suhu2);
        System.out.println();
        konversiRea(suhu3);
    }
}
