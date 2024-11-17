import java.util.Scanner;

public class Tugas206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------- Selamat Datang -------");
        System.out.println();

        System.out.print("Masukkan jumlah pesanan = ");
        int pesanan = sc.nextInt();
        
        String menu [] = new String[pesanan];
        double harga [] = new double [pesanan];

        for (int i = 0; i < pesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-"+(i+1)+" : ");
            menu[i] = sc.next();

            System.out.print("Masukkan harga untuk "+menu[i]+" : ");
            harga[i] = sc.nextDouble();
        }

        double hargaTotal = 0;
        for (int i = 0; i < pesanan; i++) {
            hargaTotal += harga[i];
        }
        System.out.println();

        System.out.println("Daftar Pesanan: ");
        for (int i = 0; i < pesanan; i++) {
            System.out.println((i+1) + ". " + menu[i] + " Rp "+harga[i]);
        }
        
        System.out.println("Total harga = "+hargaTotal);
    }
}