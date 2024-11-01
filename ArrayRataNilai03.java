import java.util.Scanner;
public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0, totalTidakLulus = 0;
        int jmlLulus = 0, jmlTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1)+ " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }   
            }
            double rata2Lulus = jmlLulus > 0 ? totalLulus / jmlLulus : 0;
            double rata2TidakLulus = jmlLulus > 0 ? totalTidakLulus / jmlTidakLulus : 0;

            System.out.println("Rata-Rata nilai lulus = " + rata2Lulus);
            System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
        }
    }
