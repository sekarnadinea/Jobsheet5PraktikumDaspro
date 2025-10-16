import java.util.Scanner;

public class ifGenapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Program Menentukan Bilangan Genap atau Ganjil ---");
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        // Struktur IF-ELSE sesuai flowchart
        if (angka % 2 == 0) {
            System.out.println("Bilangan " + angka + " adalah Genap");
        } else {
            System.out.println("Bilangan " + angka + " adalah Ganjil");
        }
        
        input.close();
    }
}