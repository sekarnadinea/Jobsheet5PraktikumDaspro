import java.util.Scanner;

public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu;

        do {
            System.out.println("\n=== Menu Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan baris (0-3): ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom (0-1): ");
                    int kolom = sc.nextInt();
                    sc.nextLine(); // buang newline

                    if (baris >= 0 && baris < 4 && kolom >= 0 && kolom < 2) {
                        if (penonton[baris][kolom] == null) {
                            System.out.print("Masukkan nama penonton: ");
                            String nama = sc.nextLine();
                            penonton[baris][kolom] = nama;
                            System.out.println("Data penonton berhasil dimasukkan!");
                        } else {
                            System.out.println("Kursi sudah terisi!");
                        }
                    } else {
                        System.out.println("Nomor kursi tidak tersedia!");
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print((penonton[i][j] == null ? "*" : penonton[i][j]) + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 3);
        sc.close();
    }
}