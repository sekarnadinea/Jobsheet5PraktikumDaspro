import java.util.Scanner;

public class KafeOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine(); // membersihkan buffer

        // Deklarasi array untuk menyimpan nama pesanan dan harga
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        // Input data pesanan
        System.out.println("\n=== Input Data Pesanan ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = input.nextLine();

            System.out.print("Masukkan harga " + namaPesanan[i] + ": Rp ");
            hargaPesanan[i] = input.nextDouble();
            input.nextLine(); // bersihkan buffer newline
        }

        // Hitung total biaya
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }

        // Tampilkan daftar pesanan dan total biaya
        System.out.println("\n=== Daftar Pesanan Anda ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%d. %s - Rp %.2f\n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }

        System.out.printf("\nTotal Biaya Pesanan: Rp %.2f\n", totalBiaya);

        input.close();
    }
}