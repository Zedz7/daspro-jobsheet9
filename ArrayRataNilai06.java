import java.util.Scanner;

public class ArrayRataNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int [] nilaiMhs = new int [jumlahMhs];
        double total = 0;
        double rata2;
        int lulus = 0;
        int tidakLulus = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rataLulus = 0;
        double rataTidakLulus = 0;


        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt(); 
        }

        for(int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if(nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            }
            else{
                totalTidakLulus += nilaiMhs[i];
                tidakLulus++;
            }
        }
        rata2 = total/nilaiMhs.length;

        if (lulus > 0) {
            rataLulus = totalLulus/lulus;
        } else {
            lulus = 0;
        }

        if (tidakLulus > 0) {
            rataTidakLulus = totalTidakLulus/tidakLulus;
        } else {
            tidakLulus = 0;
        }

        System.out.println("Rata-rata nilai seluruh mahasiswa = "+rata2);
        System.out.println("Jumlah mahasiswa yang lulus = "+lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = "+tidakLulus);
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rataTidakLulus);
    }
}