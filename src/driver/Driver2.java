import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1. Input jumlah data
        System.out.print("Masukkan jumlah total data (N): ");
        int N = input.nextInt();

        // 2. Input deretan nilai
        int[] nilai = new int[N];
        System.out.println("Masukkan deretan nilai:");

        for (int i = 0; i < N; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // 3. Input kode kelompok
        input.nextLine();
        System.out.print("Masukkan kode kelompok siswa: ");
        String kode = input.nextLine();

        // menentukan nilai kelompok
        int nilaiKelompok = 0;

        switch (kode.toLowerCase()) {
            case "yohana":
                nilaiKelompok = 75;
                break;
            case "julius":
                nilaiKelompok = 65;
                break;
            case "indah":
                nilaiKelompok = 80;
                break;
            case "wilson":
                nilaiKelompok = 70;
                break;
            default:
                System.out.println("Kode kelompok tidak ditemukan!");
                return;
        }

        // 4. Hitung total hanya untuk kelompok
        int total = 0;
        for (int i = 0; i < N; i++) {
            if (nilai[i] == nilaiKelompok) {
                total += nilai[i];
            }
        }

        // 5. Output
        System.out.println("Total nilai kelompok " + kode + " = " + total);
    }
}
