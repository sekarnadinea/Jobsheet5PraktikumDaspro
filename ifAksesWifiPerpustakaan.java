import java.util.Scanner;

public class ifAksesWifiPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Sistem Perpustakaan & Akses WiFi Kampus ---");
        System.out.print("Apakah Anda sudah terdaftar sebagai mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = input.nextBoolean();

        if (mahasiswaAktif) {
            System.out.print("Apakah Anda sudah memiliki kartu perpustakaan? (true/false): ");
            boolean punyaKartu = input.nextBoolean();

            if (punyaKartu) {
                System.out.println("Anda dapat mengakses perpustakaan dan WiFi kampus.");
            } else {
                System.out.println("Silakan buat kartu perpustakaan terlebih dahulu untuk mengakses fasilitas kampus.");
            }
        } else {
            System.out.println("Akses ditolak. Hanya mahasiswa aktif yang dapat menggunakan fasilitas kampus.");
        }

        input.close();
    }
}