class BukuNonFiksi extends Mahasiswa {
    String Topik;
    //konstructor
    BukuNonFiksi(String Judul, String Penulis, String Topik) {
        super(Judul, Penulis);
        this.Topik = Topik;
    }
    //Method
    void infoNonFiksi() {
        infoMahasiswa();
        System.out.println("Topik: " + Topik);
    }
}
