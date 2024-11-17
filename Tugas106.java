import java.util.Scanner;

public class Tugas106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        double rata2;
        double total = 0;
        
        int nilai [] = new int [jmlMhs];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }
        rata2 = total / nilai.length;
        
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai [i] > nilaiTertinggi) { 
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }
        
        System.out.println("Nilai rata-rata mahasiswa = "+rata2);
        System.out.println("Nilai tertinggi mahasiswa = "+nilaiTertinggi);
        System.out.println("Nilai terendah mahasiswa = "+nilaiTerendah);
        System.out.println("Nilai mahasiswa:");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]+" ");
        }

    }
}