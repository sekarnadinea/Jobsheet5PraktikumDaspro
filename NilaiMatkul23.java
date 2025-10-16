import java.util.Scanner;

public class NilaiMatkul23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String matkul1="Algoritma dan Pemrograman", matkul2 = "Struktur Data", namaMahasiswa, nilaiHuruf1, nilaiHuruf2, NIM, statusKelulusan1 = "Tidak Lulus", statusKelulusan2 = "Tidak Lulus";
        double nilaiAwal1_UTS = 0, nilaiAwal1_UAS = 0, nilaiAwal1_Tugas = 0, nilaiAwal2_UTS = 0, nilaiAwal2_UAS = 0, nilaiAwal2_Tugas = 0;
        double nilaiAkhir1 = 0, nilaiAkhir2 = 0;
        boolean kelulusanMatkul1 = false, kelulusanSemester = false, kelulusanMatkul2 = false;

        System.out.print("Masukkan Nama Mahasiswa   :");
        namaMahasiswa = input.nextLine();
        System.out.print("Masukkan Nama NIM         :");
        NIM = input.nextLine();

        System.out.println("");

        System.out.println("=== MASUKKAN NILAI MATKUL " + matkul1 + " ===");
        System.out.print("Masukkan Nilai UTS (0 - 100)    :");
        nilaiAwal1_UTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS (0 - 100)    :");
        nilaiAwal1_UAS = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas (0 - 100)  :");
        nilaiAwal1_Tugas = input.nextDouble();
        System.out.println("===============================================");

        System.out.println("=== MASUKKAN NILAI MATKUL " + matkul2 + " ===");
        System.out.print("Masukkan Nilai UTS (0 - 100)    :");
        nilaiAwal2_UTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS (0 - 100)    :");
        nilaiAwal2_UAS = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas (0 - 100)  :");
        nilaiAwal2_Tugas = input.nextDouble();
        System.out.println("===============================================");

        nilaiAkhir1 = ((nilaiAwal1_UTS/100) * 30) + ((nilaiAwal1_UAS/100) * 40) + ((nilaiAwal1_Tugas/100) * 30);
        nilaiAkhir2 = ((nilaiAwal2_UTS/100) * 30) + ((nilaiAwal2_UAS/100) * 40) + ((nilaiAwal2_Tugas/100) * 30);

        if (nilaiAkhir1 >= 60) {
            kelulusanMatkul1 = true;
            statusKelulusan1 = "Lulus";
        }
        if (nilaiAkhir2 >= 60) {
            kelulusanMatkul2 = true;
            statusKelulusan2 = "Lulus";
        }
        
        if (nilaiAkhir2 >= 80) {
            nilaiHuruf2 = "A";
        }
        else if (nilaiAkhir2 >= 73) {
            nilaiHuruf2 = "B+";
        }
        else if (nilaiAkhir2 >= 65) {
            nilaiHuruf2 = "B";
        }
        else if (nilaiAkhir2 >= 60) {
            nilaiHuruf2 = "C+";
        }
        else if (nilaiAkhir2 >= 50) {
            nilaiHuruf2 = "C";
        }
        else if (nilaiAkhir2 >= 39) {
            nilaiHuruf2 = "D";
        }
        else {
            nilaiHuruf2 = "E";
        }
        if (nilaiAkhir1 >= 80) {
            nilaiHuruf1 = "A";
        }
        else if (nilaiAkhir1 >= 73) {
            nilaiHuruf1 = "B+";
        }
        else if (nilaiAkhir1 >= 65) {
            nilaiHuruf1 = "B";
        }
        else if (nilaiAkhir1 >= 60) {
            nilaiHuruf1 = "C+";
        }
        else if (nilaiAkhir1 >= 50) {
            nilaiHuruf1 = "C";
        }
        else if (nilaiAkhir1 >= 39) {
            nilaiHuruf1 = "D";
        }
        else {
            nilaiHuruf1 = "E";
        }

        System.out.println("Mata Kuliah                     UTS     UAS     Tugas   Nilai Akhir     Nilai Huruf     Status");
        System.out.println("");
        String nilaiAkhir1format = String.format("%.2f", nilaiAkhir1);
        String nilaiAkhir2format = String.format("%.2f", nilaiAkhir2);
        System.out.println(matkul1 + "       " + nilaiAwal1_UTS + "      " + nilaiAwal1_UAS + "      " + nilaiAwal1_Tugas + "    " + nilaiAkhir1format + "     " + nilaiHuruf1 +"     "  + statusKelulusan1);
        System.out.println(matkul2 + "                   " + nilaiAwal2_UTS + "      " + nilaiAwal2_UAS + "      " + nilaiAwal2_Tugas + "    " + nilaiAkhir2format + "     " + nilaiHuruf2 +"     " + statusKelulusan2);

        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        System.out.println("Nilai Rata-Rata     : " + rataRata);

        if (kelulusanMatkul1 && kelulusanMatkul2) {
            if (rataRata >=70){
                System.out.println("Status Semester     : LULUS");
            }
            else{
                System.out.println("Status Semester     : TIDAK LULUS");
            }
        }
        else {
            System.out.println("Status Semester     : TIDAK LULUS");
        }
    }
}