import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Cetak KRS ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        System.out.print("Apakah mahasiswa memiliki presensi >= 75%? (true/false): ");
        boolean presensi = input.nextBoolean();

        // Menggunakan ternary operator
        String hasil = (uktLunas && presensi) 
            ? "KRS dapat dicetak" 
            : (!uktLunas ? "UKT belum lunas, KRS tidak dapat dicetak" 
                         : "Presensi kurang dari 75%, KRS tidak dapat dicetak");

        System.out.println(hasil);
    }
}