public class TP01 {

    public static void main(final String[] args) {

        for (int i = 5; i >= 1; i--) {
            String bintang = "";
            for (int j = 1; j <= i; j++) {
                bintang += "*";
            }
            System.out.println(bintang);
        }
    }
}
