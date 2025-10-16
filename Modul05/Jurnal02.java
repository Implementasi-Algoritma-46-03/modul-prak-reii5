import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        String namaHari = in.nextLine().toLowerCase();
        int bilangan = in.nextInt();
        int sisaHari = bilangan % 7;

        switch (namaHari) {
            case "senin":
                switch (sisaHari) {
                    case 0:
                        System.out.println("Senin");
                        break;
                    case 1:
                        System.out.println("Selasa");
                        break;
                    case 2:
                        System.out.println("Rabu");
                        break;
                    case 3:
                        System.out.println("Kamis");
                        break;
                    case 4:
                        System.out.println("Jumat");
                        break;
                    case 5:
                        System.out.println("Sabtu");
                        break;
                    case 6:
                        System.out.println("Minggu");
                        break; 
                }
                break;
            case "selasa":
                switch (sisaHari) {
                    case 1:
                        System.out.println("Senin");
                        break;
                    case 2:
                        System.out.println("Selasa");

                        break;
                    case 3:
                        System.out.println("Rabu");
                        break;
                    case 4:
                        System.out.println("Kamis");
                        break;
                    case 5:
                        System.out.println("Jumat");
                        break;
                    case 6:
                        System.out.println("Sabtu");
                        break;
                    case 0:
                        System.out.println("Minggu");
                        break;
                }break;
                case "rabu":
                switch (sisaHari) {
                    case 5:
                        System.out.println("Senin");
                        break;
                    case 6:
                        System.out.println("Selasa");

                        break;
                    case 0:
                        System.out.println("Rabu");
                        break;
                    case 1:
                        System.out.println("Kamis");
                        break;
                    case 2:
                        System.out.println("Jumat");
                        break;
                    case 3:
                        System.out.println("Sabtu");
                        break;
                    case 4:
                        System.out.println("Minggu");
                        break;
                }break;
                case "kamis":
                switch (sisaHari) {
                    case 4:
                        System.out.println("Senin");
                        break;
                    case 5:
                        System.out.println("Selasa");

                        break;
                    case 6:
                        System.out.println("Rabu");
                        break;
                    case 0:
                        System.out.println("Kamis");
                        break;
                    case 1:
                        System.out.println("Jumat");
                        break;
                    case 2:
                        System.out.println("Sabtu");
                        break;
                    case 3:
                        System.out.println("Minggu");
                        break;
                }break;
                case "jumat":
                switch (sisaHari) {
                    case 3:
                        System.out.println("Senin");
                        break;
                    case 4:
                        System.out.println("Selasa");

                        break;
                    case 5:
                        System.out.println("Rabu");
                        break;
                    case 6:
                        System.out.println("Kamis");
                        break;
                    case 0:
                        System.out.println("Jumat");
                        break;
                    case 1:
                        System.out.println("Sabtu");
                        break;
                    case 2:
                        System.out.println("Minggu");
                        break;
                }break;
                case "sabtu":
                switch (sisaHari) {
                    case 2:
                        System.out.println("Senin");
                        break;
                    case 3:
                        System.out.println("Selasa");

                        break;
                    case 4:
                        System.out.println("Rabu");
                        break;
                    case 5:
                        System.out.println("Kamis");
                        break;
                    case 6:
                        System.out.println("Jumat");
                        break;
                    case 0:
                        System.out.println("Sabtu");
                        break;
                    case 1:
                        System.out.println("Minggu");
                        break;
                }break;
                case "minggu":
                switch (sisaHari) {
                    case 1:
                        System.out.println("Senin");
                        break;
                    case 2:
                        System.out.println("Selasa");

                        break;
                    case 3:
                        System.out.println("Rabu");
                        break;
                    case 4:
                        System.out.println("Kamis");
                        break;
                    case 5:
                        System.out.println("Jumat");
                        break;
                    case 6:
                        System.out.println("Sabtu");
                        break;
                    case 0:
                        System.out.println("Minggu");
                        break;
                }break;
                default:
                break;
        }

    }
}
