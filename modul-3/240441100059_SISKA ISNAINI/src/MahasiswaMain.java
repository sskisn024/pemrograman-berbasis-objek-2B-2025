class MahasiswaMain {
    public static void main(String[] args) {
        // Buat objek MahasiswaReguler
        MahasiswaReguler mahasiswa1 = new MahasiswaReguler("siska", "24059", "labis");
        MahasiswaReguler mahasiswa2 = new MahasiswaReguler("mahen", "23012", "labtif");

        //info mahasiswa reguler
        System.out.println("Mahasiswa Reguler:");
        mahasiswa1.infoMahasiswa();
        System.out.println();
        mahasiswa2.infoMahasiswa();
        System.out.println();

        //objek MahasiswaBeasiswa
        MahasiswaBeasiswa mahasiswa3 = new MahasiswaBeasiswa("taeyong", "10000", "Bidikmisi");
        MahasiswaBeasiswa mahasiswa4 = new MahasiswaBeasiswa("jeno", "2300", "giveaway");

        //info mahasiswa beasiswa
        System.out.println("Mahasiswa Beasiswa:");
        mahasiswa3.infoMahasiswa();
        System.out.println();
        mahasiswa4.infoMahasiswa();
    }
}
