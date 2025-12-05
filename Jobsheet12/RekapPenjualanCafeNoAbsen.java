import java.util.Scanner;

public class RekapPenjualanCafeNoAbsen {

    static Scanner sc = new Scanner(System.in);

    static void inputPenjualan(int[][] data, String[] menu) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Hari ke-" + (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Penjualan " + menu[j] + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilkanTabel(int[][] data, String[] menu) {
        System.out.println("=== Tabel Penjualan ===");

        System.out.print("Hari\t");
        for (String m : menu) System.out.print(m + "\t");
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void menuTertinggi(int[][] data, String[] menu) {

        int[] total = new int[menu.length];

        for (int j = 0; j < menu.length; j++) {
            for (int i = 0; i < data.length; i++) {
                total[j] += data[i][j];
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < total.length; i++) {
            if (total[i] > total[maxIndex]) maxIndex = i;
        }

        System.out.println("Menu dengan penjualan tertinggi: " +
                menu[maxIndex] + " (Total = " + total[maxIndex] + ")");
    }

   static void rataRataMenu(int[][] data, String[] menu) {

    for (int j = 0; j < menu.length; j++) {
        int total = 0;

        for (int i = 0; i < data.length; i++) {
            total += data[i][j];
        }

        double rata = (double) total / data.length;

        long rataBulat = Math.round(rata); // PEMBULATAN

        System.out.println("Rata-rata " + menu[j] + ": " + rataBulat);
    }
}


    public static void main(String[] args) {

        System.out.print("Masukkan jumlah hari: ");
        int hari = sc.nextInt();

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();

        sc.nextLine(); // buang newline

        String[] menu = new String[jumlahMenu];
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        int[][] data = new int[hari][jumlahMenu];

        inputPenjualan(data, menu);
        tampilkanTabel(data, menu);
        menuTertinggi(data, menu);
        rataRataMenu(data, menu);
    }
}