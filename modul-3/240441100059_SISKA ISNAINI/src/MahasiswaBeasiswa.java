public class MahasiswaBeasiswa extends Mahasiswa {
    String jenisBeasiswa;
    // Constructor
    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }
    @Override
    public void infoMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
    }
}
