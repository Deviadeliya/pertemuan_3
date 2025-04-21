/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author Admin
 */
public class PBOMobil {
  
    static class Mobil {
        String merk;

        Mobil(String merk) {
            this.merk = merk;
        }

        void jalankan() {
            System.out.println(merk + " sedang berjalan.");
        }
    }

    public static void main(String[] args) {
        Mobil sedan = new Mobil("Toyota");
        Mobil truk = new Mobil("Hino");

        sedan.jalankan();
        truk.jalankan();
    }
}
    

