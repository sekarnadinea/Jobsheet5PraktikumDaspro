import java.util.Scanner;

public class PenjualanKopiSenjaNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang: ");
        int jumlahCabang = sc.nextInt();

        int totalPelangganKeseluruhan = 0;
        int totalItemKeseluruhan = 0;

        for (int cabang = 1; cabang <= jumlahCabang; cabang++) {
            System.out.println("\nCabang ke-" + cabang);
            System.out.print("Masukkan jumlah pelanggan hari ini: ");
            int pelanggan = sc.nextInt();

            int totalItemCabang = 0;
            for (int i = 1; i <= pelanggan; i++) {
                System.out.print("  Jumlah item yang dipesan oleh pelanggan ke-" + i + ": ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            totalPelangganKeseluruhan += pelanggan;
            totalItemKeseluruhan += totalItemCabang;

            System.out.println("Total item terjual di cabang ke-" + cabang + ": " + totalItemCabang);
        }

        System.out.println("\n=== Ringkasan Penjualan ===");
        System.out.println("Total seluruh pelanggan: " + totalPelangganKeseluruhan);
        System.out.println("Total seluruh item terjual: " + totalItemKeseluruhan);

        sc.close();
    }
}