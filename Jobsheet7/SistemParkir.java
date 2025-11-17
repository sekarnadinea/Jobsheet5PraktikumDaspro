import java.util.Scanner;
import java.util.Arrays;

public class SistemParkir {

    // Array untuk merepresentasikan slot parkir.
    // Ukuran array (misalnya 10) adalah total slot parkir.
    private static String[] slotParkir = new String[10];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Inisialisasi semua slot sebagai "KOSONG"
        Arrays.fill(slotParkir, "KOSONG");

        int pilihan;
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    parkirKendaraan();
                    break;
                case 2:
                    keluarKendaraan();
                    break;
                case 3:
                    tampilkanStatus();
                    break;
                case 4:
                    System.out.println("Terima kasih, sistem parkir dimatikan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println("------------------------------------");
        } while (pilihan != 4);
    }

    private static void tampilkanMenu() {
        System.out.println("\n--- Sistem Parkir Sederhana ---");
        System.out.println("1. Parkirkan Kendaraan (Masuk)");
        System.out.println("2. Keluarkan Kendaraan (Keluar)");
        System.out.println("3. Tampilkan Status Parkir");
        System.out.println("4. Keluar Sistem");
        System.out.print("Masukkan pilihan: ");
    }

    // --- FUNGSI PARKIR KENDARAAN ---
    private static void parkirKendaraan() {
        System.out.print("Masukkan Plat Nomor Kendaraan: ");
        String platNomor = scanner.nextLine().toUpperCase();
        
        // Cari slot kosong
        for (int i = 0; i < slotParkir.length; i++) {
            if (slotParkir[i].equals("KOSONG")) {
                // Slot ditemukan! Simpan plat nomor di slot array
                slotParkir[i] = platNomor;
                System.out.println("\n✅ Kendaraan " + platNomor + " berhasil diparkir di slot #" + (i + 1) + ".");
                return; // Keluar dari fungsi setelah berhasil parkir
            }
        }

        // Jika loop selesai dan tidak ada return, berarti parkir penuh
        System.out.println("\n❌ Parkiran penuh! Tidak ada slot tersedia.");
    }

    // --- FUNGSI KELUAR KENDARAAN ---
    private static void keluarKendaraan() {
        System.out.print("Masukkan Plat Nomor Kendaraan yang akan keluar: ");
        String platNomor = scanner.nextLine().toUpperCase();
        
        // Cari plat nomor di seluruh slot array
        for (int i = 0; i < slotParkir.length; i++) {
            if (slotParkir[i].equals(platNomor)) {
                // Kendaraan ditemukan! Reset slot menjadi "KOSONG"
                slotParkir[i] = "KOSONG";
                System.out.println("\n✅ Kendaraan " + platNomor + " berhasil keluar dari slot #" + (i + 1) + ".");
                return; // Keluar dari fungsi setelah berhasil keluar
            }
        }

        // Jika loop selesai, berarti plat nomor tidak ditemukan
        System.out.println("\n❌ Plat nomor " + platNomor + " tidak ditemukan di parkiran.");
    }

    // --- FUNGSI TAMPILKAN STATUS ---
    private static void tampilkanStatus() {
        System.out.println("\n--- STATUS SLOT PARKIR ---");
        boolean adaSlotKosong = false;

        for (int i = 0; i < slotParkir.length; i++) {
            // Tampilkan slot dan statusnya
            System.out.print("Slot #" + (i + 1) + ": ");
            if (slotParkir[i].equals("KOSONG")) {
                System.out.println("[KOSONG]");
                adaSlotKosong = true;
            } else {
                System.out.println(slotParkir[i]);
            }
        }

        long slotTerisi = Arrays.stream(slotParkir).filter(s -> !s.equals("KOSONG")).count();
        long slotKosong = slotParkir.length - slotTerisi;

        System.out.println("\n➡ Ringkasan: " + slotTerisi + " Terisi, " + slotKosong + " Kosong (Total: " + slotParkir.length + ")");
    }
}