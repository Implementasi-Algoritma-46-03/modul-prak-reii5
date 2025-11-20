public class TP03 {
    
    public static boolean prima(int angka){
        if (angka < 2){
            return false;
        }else{
            for (int i = 2; i * i <= angka; i++){
                if (angka % i == 0){
                    return false;
                }
        }
    }return true;
}
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini

        for (int i = 2; i <= 100; i++){
            if (prima(i)){
                System.out.print(i + " ");
            }
        }


    }
}
