import java.util.Scanner;
public class Jurnal01 {


public static void sout(String nama1, String nama2, int waktu){
    System.out.println("Halo, " + nama1 + ". Selamat " + sapa(waktu) + ".");
    System.out.println("Halo, " + nama2 + ". Selamat " + sapa(waktu) + ".");
}
  
public static String sapa(int waktu){  
    if (waktu >= 06 && waktu <= 11){ 
        return "pagi";
    }else if (waktu >= 12 && waktu <= 14){
        return "siang";
    }else if (waktu >= 15 && waktu <= 17){
        return "sore";
    }else{
        return "malam";
    }
}

public static void main(final String[] args) {
    Scanner in = new Scanner(System.in);
    String nama1 = in.nextLine();
    String nama2 = in.nextLine();
    int waktu = in.nextInt();

    sout(nama1, nama2, waktu);
}
}
