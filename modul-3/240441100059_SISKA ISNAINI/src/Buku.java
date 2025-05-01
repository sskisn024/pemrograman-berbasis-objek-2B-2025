//Class induk
public class Buku {
    String Judul;
    String Penulis;
    //Konstructor
    Buku(String Judul, String Penulis) {
        this.Judul = Judul;
        this.Penulis = Penulis;
    }
    //Method
    void infoBuku() {
        System.out.println("Judul: " + Judul);
        System.out.println("Nama Penulis: " + Penulis);
    }
}
