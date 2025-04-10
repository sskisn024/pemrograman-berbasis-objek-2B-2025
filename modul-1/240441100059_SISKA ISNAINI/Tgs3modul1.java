/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs3modul1;
import java.util.Scanner;

// Kelas Kucing
class Kucing {
    String nama;
    String model;
    int umur;

    void setKucing(String nama, String model, int umur) {
        this.nama = nama;
        this.model = model;
        this.umur = umur;
    }

    void suaraKucing() {
        System.out.println(nama + " mengeong");
    }

    void tampilkanInfo() {
        System.out.println("kucing: " + nama);
        System.out.println("model: " + model);
        System.out.println("umur: " + umur + " tahun");
    }
}

// Bebek
class Bebek {
    String nama;
    String ukuran;
    int umur;

    void setBebek(String nama, String ukuran, int umur) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.umur = umur;
    }

    void berenang() {
        System.out.println(nama + " lagi berenang");
    }

    void tampilkanInfo() {
        System.out.println("bebek: " + nama);
        System.out.println("ukuran: " + ukuran);
        System.out.println("umur: " + umur + " tahun");
    }
}

// Dino
class Dino {
    String nama;
    String ukuran;
    int umur;

    void setDino(String nama, String ukuran, int umur) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.umur = umur;
    }

    void mengaum() {
        System.out.println(nama + " mengaum RAAWWRR!!");
    }

    void tampilkanInfo() {
        System.out.println("dinosaurus: " + nama);
        System.out.println("ukuran: " + ukuran);
        System.out.println("umur: " + umur + " tahun");
    }
}

// Kelas Main
public class Tgs3modul1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Buat 3 objek kucing
        Kucing[] kucingArray = new Kucing[3];
        for (int i = 0; i < 3; i++) {
            kucingArray[i] = new Kucing();
            System.out.print("masukkan nama kucing " + (i + 1) + ": ");
            String nama = input.nextLine();
            System.out.print("masukkan model kucing: ");
            String model = input.nextLine();
            System.out.print("masukkan umur kucing: ");
            int umur = input.nextInt();
            input.nextLine();

            kucingArray[i].setKucing(nama, model, umur);
        }

        //bebek
        Bebek[] bebekArray = new Bebek[3];
        for (int i = 0; i < 3; i++) {
            bebekArray[i] = new Bebek();
            System.out.print("masukkan nama bebek " + (i + 1) + ": ");
            String nama = input.nextLine();
            System.out.print("masukkan ukuran bebek: ");
            String ukuran = input.nextLine();
            System.out.print("masukkan umur bebek: ");
            int umur = input.nextInt();
            input.nextLine();

            bebekArray[i].setBebek(nama, ukuran, umur);
        }

        //dino
        Dino[] dinoArray = new Dino[3];
        for (int i = 0; i < 3; i++) {
            dinoArray[i] = new Dino();
            System.out.print("masukkan nama dino ke-" + (i + 1) + ": ");
            String nama = input.nextLine();
            System.out.print("masukkan ukuran dino: ");
            String ukuran = input.nextLine();
            System.out.print("masukkan umur dino: ");
            int umur = input.nextInt();
            input.nextLine();

            dinoArray[i].setDino(nama, ukuran, umur);
        }

        System.out.println();
        for (Kucing kucing : kucingArray) {
            kucing.tampilkanInfo();
            kucing.suaraKucing();
        }

        System.out.println();
        for (Bebek bebek : bebekArray) {
            bebek.tampilkanInfo();
            bebek.berenang();
        }

        System.out.println();
        for (Dino dino : dinoArray) {
            dino.tampilkanInfo();
            dino.mengaum();
        }

        input.close();
    }
}
