import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        String bangunDatar = in.nextLine().toLowerCase();


        switch (bangunDatar) {
            case "persegi":
                int sisi = in.nextInt();
                int luas = sisi * sisi;
                int keliling = sisi * 4;
                System.out.println(luas + " " + keliling);
                
                break;
            case "persegi panjang":
                int panjang = in.nextInt();
                int lebar = in.nextInt();
                int luasp = panjang * lebar;
                int kelilingp = 2 * (panjang + lebar);
                System.out.print(luasp + " " + kelilingp);
           
                break;
            case "segitiga":
                int alas = in.nextInt();
                int tinggi = in.nextInt();
                double luass = 0.5 * alas * tinggi;
                double kelilings = alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
                int kelilingint = (int) kelilings;


                if (kelilings - kelilingint > 0.5){
                    kelilingint ++;
                }else{
                    kelilingint = kelilingint;
                }
                System.out.print((int)luass + " " + kelilingint);

                break;
    
            case "lingkaran":
                int diameter = in.nextInt();
                double jari_jari = (double) diameter / 2;
                double pi = 3.14;
                double luasl = pi * (jari_jari * jari_jari);
                double kelilingl = pi * diameter;

                System.out.printf("%.2f ", luasl);
                System.out.printf("%.2f", kelilingl);

        }

    }
}
