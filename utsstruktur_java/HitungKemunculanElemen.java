/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstruktur_java;

/**
 *
 * @author Admin
 */
public class HitungKemunculanElemen {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 2, 1};

        // Kita asumsikan nilai elemen array antara 0 sampai 100
        // Jika tidak diketahui, kita bisa cari nilai maksimum dulu
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Buat array untuk menyimpan jumlah kemunculan
        int[] jumlah = new int[max + 1];

        // Hitung frekuensi kemunculan
        for (int i = 0; i < array.length; i++) {
            jumlah[array[i]]++;
        }

        // Tampilkan hasil
        System.out.println("Jumlah kemunculan setiap elemen:");
        for (int i = 0; i <= max; i++) {
            if (jumlah[i] > 0) {
                System.out.println(i + " -> " + jumlah[i] + " kali");
            }
        }
    }
}

