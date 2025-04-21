/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author Admin
 */
public class MasterPBOBangunDatar {
    
    // Superclass abstrak
    abstract static class BangunDatar {
        abstract double hitungLuas();
        abstract double hitungKeliling();
    }

    // Persegi
    static class Persegi extends BangunDatar {
        double sisi;        Persegi(double sisi){ this.sisi = sisi; }

        double hitungLuas()     { return sisi * sisi; }
        double hitungKeliling() { return 4 * sisi; }
    }

    // Lingkaran
    static class Lingkaran extends BangunDatar {
        double r;
        Lingkaran(double r){ this.r = r; }
        double hitungLuas()     { return 3.14 * r * r; }
        double hitungKeliling() { return 2 * 3.14 * r; }
    }

    // Entry point
    public static void main(String[] args) {
        BangunDatar[] list = {
            new Persegi(5),
            new Lingkaran(3)
        };

        for (BangunDatar b : list) {
            System.out.printf(
                "%-9s → Luas=%.2f | Keliling=%.2f%n",
                b.getClass().getSimpleName(),
                b.hitungLuas(),
                b.hitungKeliling()
            );
        }
    }
}