import java.util.Scanner;

public class PerpustakaanMain {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner sc = new Scanner(System.in);

        BukuFiksi fiksi1 = new BukuFiksi("3276MDPL", " Nurwina Sari ", "sad");
        BukuFiksi fiksi2 = new BukuFiksi("mie ayam sebelum mati", "brian khrisna", "depretion");
        BukuNonFiksi nonFiksi1 = new BukuNonFiksi("Atomic habits", "James Clear", "Self Improvement");

        perpustakaan.tambahBukuFiksi(fiksi1);
        perpustakaan.tambahBukuFiksi(fiksi2);
        perpustakaan.tambahBukuNonFiksi(nonFiksi1);

        System.out.print("Berapa buku fiksi yang ingin di tambahan? ");
        int jumlahFiksi = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < jumlahFiksi; i++) {
            System.out.println("Masukkan buku fiksi ke " + (i + 1));
            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Penulis: ");
            String penulis = sc.nextLine();
            System.out.print("Genre: ");
            String genre = sc.nextLine();

            BukuFiksi bukuFiksi = new BukuFiksi(judul, penulis, genre);
            perpustakaan.tambahBukuFiksi(bukuFiksi);
        }

        System.out.print("Berapa buku non-fiksi tambahan? ");
        int jumlahNonFiksi = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < jumlahNonFiksi; i++) {
            System.out.println("Masukkan buku non fiksi ke " + (i + 1));
            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Penulis: ");
            String penulis = sc.nextLine();
            System.out.print("Topik: ");
            String topik = sc.nextLine();

            BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judul, penulis, topik);
            perpustakaan.tambahBukuNonFiksi(bukuNonFiksi);
        }

        System.out.println("=== Koleksi Buku Perpustakaan ===");
        perpustakaan.tampilkanKoleksi();

        sc.close();
    }
}
