import java.util.Scanner;

public class Jurnal03 {
    public static double volume(int jari_jari, int tinggi){
        double volume = 3.14159 * ((double) jari_jari * jari_jari) * tinggi;
        return volume;
    }
    public static void persentase(int tinggiAir, int jari_jari, int tinggi){
        double air = 3.14159 * ((double) jari_jari * jari_jari) * tinggiAir;
        double persentase =air / volume(jari_jari, tinggi) * 100;
        System.out.printf("%.2f", volume(jari_jari, tinggi));
        System.out.println();
        System.out.printf("%.2f", air);
        System.out.println();
        System.out.printf("%.1f", persentase);
        System.out.println("%");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jari_jari = in.nextInt();
        int tinggi = in.nextInt();
        int tinggiAir = in.nextInt();;

        persentase(tinggiAir, jari_jari, tinggi);

    }
    
}
