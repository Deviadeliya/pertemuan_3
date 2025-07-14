/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;

/**
 *
 * @author Admin
 */
public class Deklarasi_variable {
              public static void main(String[] args) {
        // Tipe data primitif
        int angka = 10;                // bilangan bulat
        double desimal = 3.14;         // bilangan desimal
        char huruf = 'A';              // karakter
        boolean status = true;         // nilai benar/salah

        // Tipe data non-primitif
        String nama = "Devi Adeliya";          // tipe data string (objek)
        int[] arrayAngka = {1, 2, 3};  // array satu dimensi

        // Menampilkan hasil ke layar
        System.out.println("Nilai integer: " + angka);
        System.out.println("Nilai double: " + desimal);
        System.out.println("Nilai char: " + huruf);
        System.out.println("Nilai boolean: " + status);
        System.out.println("Nama: " + nama);

        System.out.print("Array angka: ");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.print(arrayAngka[i] + " ");
        }
    }
}




