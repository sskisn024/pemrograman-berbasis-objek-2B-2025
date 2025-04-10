/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs1modul1;

/**
 *
 * @author Lenovo
 */
public class Tgs1modul1 {

    /**
     * @param args the command line arguments
     */
    String nama;
    String alamat;
    int umur;
    
    void setTgs1modul1(String nama, String alamat, int umur){
       this. nama = nama;
      this.  alamat =  alamat;
        this. umur = umur;
    }
    
    void tampilkanInfo(){
        System.out.println("nama :" +nama);
        System.out.println("alamat :" +alamat);
        System.out.println("umur :" +umur);
    }
    
    void berjalan() {
        System.out.println(nama + " sedang berjalan");
    }
    
    void berlari() {
       System.out.println(nama + " sedang berlari");
    }
    
    public static void main(String[] args) {
        Tgs1modul1 manusia1 = new Tgs1modul1();
        System.out.println("informasi manusia 1");
        manusia1.setTgs1modul1("siska", "bangkalan", 19);
        manusia1.tampilkanInfo();
        manusia1.berjalan();
        manusia1.berlari();
        
        Tgs1modul1 manusia2 = new Tgs1modul1();
        System.out.println("informasi manusia 2");
        manusia2.setTgs1modul1("isnaini", "surabaya", 20);
        manusia2.tampilkanInfo();
        manusia2.berjalan();
        manusia2.berlari();
        
        Tgs1modul1 manusia3 = new Tgs1modul1();
        System.out.println("informasi manusia 3");
        manusia3.setTgs1modul1("siskaisn", "polandia", 17);
        manusia3.tampilkanInfo();
        manusia3.berjalan();
        manusia3.berlari();
        
        Tgs1modul1 manusia4 = new Tgs1modul1();
        System.out.println("informasi manuisa 4");
        manusia4.setTgs1modul1("sska", "korea", 18);
        manusia4.tampilkanInfo();
        manusia4.berjalan();
        manusia4.berlari();
        
        Tgs1modul1 manusia5 = new Tgs1modul1();
        System.out.println("informasi manusia 5");
        manusia5.setTgs1modul1("ciska", "thailand", 20);
        manusia5.tampilkanInfo();
        manusia5.berjalan();
        manusia5.berlari();
    }
    
}
