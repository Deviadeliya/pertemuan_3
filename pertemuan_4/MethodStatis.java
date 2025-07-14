/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author Admin
 */ import java.util.Scanner;
public class MethodStatis {
   

    // Method statis untuk menghitung luas
    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    // Method statis untuk menghitung keliling
    public static int hitungKeliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    // Method main (program utama)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();

        // Pemanggilan method statis
        int luas = hitungLuas(panjang, lebar);
        int keliling = hitungKeliling(panjang, lebar);

        // Output hasil
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Luas     : " + luas);
        System.out.println("Keliling : " + keliling);
    }
}


