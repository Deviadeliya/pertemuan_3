/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author Admin
 */
public class MasterPBOMobil {
    
    static class Mobil {
        String merk;
        Mobil(String merk) { this.merk = merk; }
        void jalan() { System.out.println(merk + " berjalan."); }
    }

    static class Sedan extends Mobil {
        Sedan(String merk) { super(merk); }
        void jalan() { System.out.println(merk + " (Sedan) melaju."); }
    }

    static class Truk extends Mobil {
        Truk(String merk) { super(merk); }
        void jalan() { System.out.println(merk + " (Truk) mengangkut."); }
    }

    public static void main(String[] args) {
        Mobil m1 = new Sedan("Toyota");
        Mobil m2 = new Truk("Hino");

        m1.jalan();
        m2.jalan();
    }
}

