import java.util.*;

class Jadwal {
    static boolean cekJadwal(String hari, String asrama) {
        switch (hari.toLowerCase()) {
            case "senin":
                return asrama.equalsIgnoreCase("pniel") ||
                       asrama.equalsIgnoreCase("jati");

            case "selasa":
                return asrama.equalsIgnoreCase("kapernaum") ||
                       asrama.equalsIgnoreCase("silo") ||
                       asrama.equalsIgnoreCase("rusun empat");

            case "rabu":
                return asrama.equalsIgnoreCase("rusun dua");

            case "jumat":
                return asrama.equalsIgnoreCase("rusun tiga");

            default:
                return false;
        }
    }
}

public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hari penjemputan: ");
        String hari = input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Asrama: ");
        String asrama = input.nextLine();

        if (!Jadwal.cekJadwal(hari, asrama)) {
            System.out.println("❌ Bukan jadwal laundry asrama ini!");
            return;
        }

        System.out.print("Jumlah pakaian: ");
        int jumlah = input.nextInt();
        input.nextLine();

        ArrayList<String> namaPakaian = new ArrayList<>();
        ArrayList<String> warna = new ArrayList<>();
        ArrayList<String> catatan = new ArrayList<>();

        System.out.println("\n=== INPUT DETAIL PAKAIAN ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Pakaian ke-" + (i + 1));

            System.out.print("Nama pakaian   : ");
            namaPakaian.add(input.nextLine());

            System.out.print("Warna          : ");
            warna.add(input.nextLine());

            System.out.print("Catatan tambahan: ");
            catatan.add(input.nextLine());

            System.out.println();
        }

        System.out.print("Diantar pukul (max 10): ");
        String jam = input.nextLine();

        String waktuJemput = hari + " pukul 06.00";
        String waktuAntar = hari + " pukul " + jam;
        String status = "Diproses";

        // ===== OUTPUT =====
        System.out.println("\n========== STRUK LAUNDRY ==========");
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
        System.out.println("Asrama    : " + asrama);
        System.out.println("Jumlah    : " + jumlah + " pakaian");

        // DETAIL PAKAIAN FIX
        System.out.println("\n------ DETAIL PAKAIAN ------");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Pakaian ke-" + (i + 1));
            System.out.println("  Nama    : " + namaPakaian.get(i));
            System.out.println("  Warna   : " + warna.get(i));
            System.out.println("  Catatan : " + catatan.get(i));
        }

        double berat = jumlah * 0.1;
        System.out.println("\nEstimasi berat: " + berat + " kg");

        System.out.println("\nWaktu jemput : " + waktuJemput);
        System.out.println("Waktu antar  : " + waktuAntar);
        System.out.println("Status       : " + status);
        System.out.println("===================================");
    }
}
