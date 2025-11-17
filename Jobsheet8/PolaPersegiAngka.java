public class PolaPersegiAngka {

    /**
     * Metode utama untuk menjalankan program.
     */
    public static void main(String[] args) {
        // Panggil metode untuk mencetak pola gabungan
        // N_kiri = 3 (untuk angka 3), N_kanan = 5 (untuk angka 5)
        System.out.println("Contoh n = 3, dan n = 5");
        cetakPolaGabungan(3, 5);
    }

    /**
     * Mencetak pola persegi berongga.
     *
     * @param n     Ukuran persegi (misalnya 3 atau 5).
     * @param angka Angka yang akan dicetak di tepi.
     * @return Array String yang merepresentasikan pola baris demi baris.
     */
    public static String[] buatPola(int n, char angka) {
        String[] pola = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder baris = new StringBuilder();

            for (int j = 0; j < n; j++) {
                // Cek apakah di tepi (baris pertama/terakhir atau kolom pertama/terakhir)
                boolean isBorder = (i == 0 || i == n - 1 || j == 0 || j == n - 1);

                if (isBorder) {
                    baris.append(angka);
                } else {
                    baris.append(' ');
                }

                // Tambahkan spasi antar angka, kecuali di akhir kolom
                if (j < n - 1) {
                    baris.append(' ');
                }
            }

            pola[i] = baris.toString();
        }

        return pola;
    }

    /**
     * Menggabungkan dan mencetak kedua pola sesuai dengan tata letak pada gambar.
     *
     * @param nKiri  Ukuran persegi kiri (angka 3), harus 3.
     * @param nKanan Ukuran persegi kanan (angka 5), harus 5.
     */
    public static void cetakPolaGabungan(int nKiri, int nKanan) {
        // Buat pola untuk persegi angka 3 (kiri)
        String[] polaKiri = buatPola(nKiri, '3');
        // Buat pola untuk persegi angka 5 (kanan)
        String[] polaKanan = buatPola(nKanan, '5');

        // Spasi di awal untuk menyesuaikan posisi pola kanan di baris 1 & 2
        String paddingAwal = "     "; // 5 spasi

        // Baris 1 & 2: Hanya pola kanan
        System.out.println(paddingAwal + polaKanan[0]);
        System.out.println(paddingAwal + polaKanan[1]);

        // Jarak antara kedua pola (kiri dan kanan)
        String jarakAntarKotak = "    "; // 4 spasi

        // Baris 3: Pola kiri (baris 1) & pola kanan (baris 3)
        System.out.println(polaKiri[0] + jarakAntarKotak + polaKanan[2]);

        // Baris 4: Pola kiri (baris 2) & pola kanan (baris 4)
        System.out.println(polaKiri[1] + jarakAntarKotak + polaKanan[3]);

        // Baris 5: Pola kiri (baris 3) & pola kanan (baris 5)
        System.out.println(polaKiri[2] + jarakAntarKotak + polaKanan[4]);
    }
}