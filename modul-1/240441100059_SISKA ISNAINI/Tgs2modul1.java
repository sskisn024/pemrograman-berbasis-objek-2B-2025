/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs2modul1;
import java.util.Scanner;

public class Tgs2modul1 {
    String nama;
    int nim;
    String jurusan;
    String alamat;

    void setDatamhs(String nama, int nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    void tampilkanInfo() {
        System.out.println("nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("jurusan: " + jurusan);
        System.out.println("alamat: " + alamat);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mahasiswa 1
        Tgs2modul1 mahasiswa1 = new Tgs2modul1();
        System.out.println("masukkan data mahasiswa 1:");
        System.out.print("nama: ");
        String nama1 = input.nextLine();
        System.out.print("nim: ");
        int nim1 = input.nextInt();
        input.nextLine(); 
        System.out.print("jurusan : ");
        String jurusan1 = input.nextLine();
        System.out.print("alamat  : ");
        String alamat1 = input.nextLine();
        mahasiswa1.setDatamhs(nama1, nim1, jurusan1, alamat1);

        // Mahasiswa 2
        Tgs2modul1 mahasiswa2 = new Tgs2modul1();
        System.out.println("masukkan data mahasiswa 2:");
        System.out.print("nama: ");
        String nama2 = input.nextLine();
        System.out.print("nim: ");
        int nim2 = input.nextInt();
        input.nextLine();
        System.out.print("jurusan: ");
        String jurusan2 = input.nextLine();
        System.out.print("alamat: ");
        String alamat2 = input.nextLine();
        mahasiswa2.setDatamhs(nama2, nim2, jurusan2, alamat2);

        // Mahasiswa 3
        Tgs2modul1 mahasiswa3 = new Tgs2modul1();
        System.out.println("masukkan data mahasiswa 3:");
        System.out.print("nama: ");
        String nama3 = input.nextLine();
        System.out.print("nim: ");
        int nim3 = input.nextInt();
        input.nextLine();
        System.out.print("jurusan: ");
        String jurusan3 = input.nextLine();
        System.out.print("alamat: ");
        String alamat3 = input.nextLine();
        mahasiswa3.setDatamhs(nama3, nim3, jurusan3, alamat3);

        System.out.println();
        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
        mahasiswa3.tampilkanInfo();

        input.close();
    }
}
