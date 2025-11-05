import java.util.Scanner;

public class TP01 {
    public static double konversCel(double suhu){
        double celcius = 5.0 / 9 * (suhu - 32); 
        return celcius;
    }
    public static double konversiRea(double suhu){
        double reamur = 4.0 / 9 * (suhu - 32);
        return reamur;
    }
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        double suhu1 = in.nextDouble();
        double suhu2 = in.nextDouble();
        double suhu3 = in.nextDouble();

        double celMin = konversCel(suhu1);
        double celAvr = konversCel(suhu2);
        double celMAx = konversCel(suhu3);
        double reMin = konversiRea(suhu1);
        double reAvr = konversiRea(suhu2);
        double reMax = konversiRea(suhu3);

        System.out.printf("Celcius: %.1f %.1f %.1f%n", celMin, celAvr, celMAx);
        System.out.printf("Reamur: %.2f %.2f %.2f%n", reMin, reAvr, reMax);

    }   
}
