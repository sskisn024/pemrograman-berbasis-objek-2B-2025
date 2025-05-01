public class BukuFiksi extends Buku {
    String Genre;
    //konstructor
    BukuFiksi(String Judul, String Penulis, String Genre) {
        super(Judul, Penulis);
        this.Genre = Genre;
    }

    //Method
    void infoFiksi() {
        infoBuku();
        System.out.println("Genre: " + Genre);
    }
}
