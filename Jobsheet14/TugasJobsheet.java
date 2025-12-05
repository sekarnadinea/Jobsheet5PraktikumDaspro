import java.util.Scanner;

public class TugasJobsheet {

    // Rekursif
    static int jumlahRekursif(int n) {
        if (n == 1) {
            return 1;
        }
        return n + jumlahRekursif(n - 1);
    }

    // Iteratif
    static int jumlahIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        System.out.println("Jumlah Rekursif = " + jumlahRekursif(N));
        System.out.println("Jumlah Iteratif = " + jumlahIteratif(N));
    }
}