import java.util.Scanner;

public class TP03 {
    public static void persegi(int angka){
        int luas = angka * angka;
        int keliling = 4 * angka;
        System.out.println(luas);
        System.out.println(keliling);
    }
    public static void persegiPanjang(int angka, int angka2){
        int luas = angka * angka2;
        int keliling = 2 * (angka + angka2);
        System.out.println(luas);
        System.out.println(keliling);
    }
    public static void segitiga(int angka, int angka2){
        double luas =(double) 1 / 2 * angka * angka2;
        double sisiMiring = Math.sqrt((angka * angka) + (angka2 * angka2));
        double keliling = sisiMiring + angka + angka2;
        int kelilingint = (int) keliling;

        if (keliling - kelilingint > 0.5){
            kelilingint++;
        }else{
            kelilingint = kelilingint;
        }

        System.out.println((int) luas);
        System.out.println(kelilingint);
    }
    public static void lingkaran(int angka){
        double pi = 3.14;
        double jari_jari = (double) angka / 2;
        double luas = pi * ((double) jari_jari * jari_jari);
        double keliling = 2 * pi * jari_jari;
        System.out.printf("%.2f", luas);
        System.out.println();
        System.out.printf("%.2f", keliling);

    }

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        String bangunDatar = in.nextLine().toLowerCase();
        int bilangan = in.nextInt();

        if (bangunDatar.equals("persegi")|| bangunDatar.equals("lingkaran")){
            switch (bangunDatar) {
                case "persegi":
                    persegi(bilangan);
                    break;
                case "lingkaran":
                    lingkaran(bilangan);
                    break;
            }
        }else{
            int bilangan2 = in.nextInt();
            switch (bangunDatar) {
                case "persegi panjang":
                    persegiPanjang(bilangan2, bilangan);
                    break;
                case "segitiga":
                    segitiga(bilangan, bilangan2);
                    break;
                default:
                System.out.println("error bangun datar tidak ditemukan, cek apakah anda typo dalam pengetikan");
                    break;
            }
        }

    }
}
