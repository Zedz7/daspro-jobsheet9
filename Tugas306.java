import java.util.Scanner;

public class Tugas306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", 
            "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("------- Selamat Datang -------");
        System.out.println();

        System.out.print("Masukkan nama menu: ");
        String key = sc.nextLine();
        int hasil = 0;

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Menu "+key+" tersedia ");
        } else {
            System.out.println("Menu "+key+" tidak tersedia");
        }
    }
}