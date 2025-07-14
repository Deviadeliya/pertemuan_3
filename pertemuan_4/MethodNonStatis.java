/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author Admin
 */import java.util.Scanner;
public class MethodNonStatis {

    // Variabel instance
    int panjang;
    int lebar;

    // Constructor
    public MethodNonStatis(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method non-statis untuk menghitung luas
    public int hitungLuas() {
        return panjang * lebar;
    }

    // Method non-statis untuk menghitung keliling
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method non-statis untuk menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Panjang  : " + panjang);
        System.out.println("Lebar    : " + lebar);
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }

    // Main method (harus static)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();

        // Membuat objek dari class MethodNonStatis
        MethodNonStatis persegi = new MethodNonStatis(p, l);

        // Memanggil method non-statis melalui objek
        persegi.tampilkanHasil();
    }
}


