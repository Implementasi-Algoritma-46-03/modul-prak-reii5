import java.util.Scanner;
import java.util.ArrayList;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int counter;
        int hasilAkhir = 0;
        int a;
        int modus = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        do {
            a = s.nextInt();
            if (a != -1)
                arr.add(a);
        } while (a != -1);

        for (int i=0; i<arr.size(); i++) {
            counter = 0;
            for (int j=0; j<arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))){
                    counter++;
                }
            }
            if (counter > hasilAkhir || (counter == hasilAkhir && arr.get(i) > modus)) {
                hasilAkhir = counter;
                modus = arr.get(i);
            }
        }
        System.out.println(modus);
    }}



    