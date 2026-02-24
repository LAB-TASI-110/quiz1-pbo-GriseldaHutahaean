import java.util.Scanner;

public class Driver1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.println("=== PEMESANAN RESTORAN ===");
        System.out.println("Ketik END untuk selesai\n");

        while (true) {

            // INPUT KODE MENU
            System.out.print("Masukkan kode menu : ");
            String kode = input.nextLine().toUpperCase();

            if (kode.equals("END")) {
                break;
            }

            String nama = "";
            int harga = 0;

            switch (kode) {
                case "NGS":
                    nama = "Nasi Goreng Spesial";
                    harga = 15000;
                    break;
                case "AP":
                    nama = "Ayam Penyet";
                    harga = 20000;
                    break;
                case "SA":
                    nama = "Sate Ayam";
                    harga = 25000;
                    break;
                case "BU":
                    nama = "Bakso Urat";
                    harga = 18000;
                    break;
                case "MAP":
                    nama = "Mie Ayam Pangsit";
                    harga = 15000;
                    break;
                case "GG":
                    nama = "Gado-Gado";
                    harga = 15000;
                    break;
                case "SAM":
                    nama = "Soto Ayam";
                    harga = 17000;
                    break;
                case "RD":
                    nama = "Rendang Daging";
                    harga = 25000;
                    break;
                case "IB":
                    nama = "Ikan Bakar";
                    harga = 35000;
                    break;
                case "NUK":
                    nama = "Nasi Uduk Komplit";
                    harga = 20000;
                    break;
                default:
                    System.out.println("Kode tidak ditemukan!\n");
                    continue;
            }

            // INPUT PORSI BUTET
            System.out.print("Porsi Butet : ");
            int butet = Integer.parseInt(input.nextLine());

            int ucok = 2 * butet;

            int subtotal = (butet + ucok) * harga;
            total += subtotal;

            System.out.println("\nMenu         : " + nama);
            System.out.println("Porsi Butet  : " + butet);
            System.out.println("Porsi Ucok   : " + ucok);
            System.out.println("Harga        : Rp" + harga);
            System.out.println("Subtotal     : Rp" + subtotal);
            System.out.println("----------------------------\n");
        }

        // DISKON
        double diskon = 0;

        if (total >= 500000) diskon = 0.25;
        else if (total >= 400000) diskon = 0.20;
        else if (total >= 300000) diskon = 0.15;
        else if (total >= 200000) diskon = 0.10;
        else if (total >= 100000) diskon = 0.05;

        double potongan = total * diskon;
        double bayar = total - potongan;

        System.out.println("===== TOTAL BELANJA =====");
        System.out.println("Total       : Rp" + total);
        System.out.println("Diskon      : " + (diskon * 100) + "%");
        System.out.println("Potongan    : Rp" + potongan);
        System.out.println("Total Bayar : Rp" + bayar);

        input.close();
    }
}
