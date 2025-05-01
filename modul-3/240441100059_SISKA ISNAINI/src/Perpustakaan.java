import java.util.ArrayList;
class Perpustakaan {
    ArrayList<BukuFiksi> koleksiFiksi = new ArrayList<>();
    ArrayList<BukuNonFiksi> koleksiNonFiksi = new ArrayList<>();

    // Method
    void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
    }
    // Method
    void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }
    // Method
    void tampilkanKoleksi() {
        System.out.println("Koleksi Buku Fiksi:");
        for (BukuFiksi buku : koleksiFiksi) {
            buku.infoFiksi();
            System.out.println();
        }
        System.out.println("Koleksi Buku Non-Fiksi:");
        for (BukuNonFiksi buku : koleksiNonFiksi) {
            buku.infoNonFiksi();
            System.out.println();
        }
    }
}
