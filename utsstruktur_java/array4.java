/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstruktur_java;

/**
 *
 * @author Admin
 */
public class array4 {
    
    // Metode untuk menghapus duplikat dari array tanpa struktur data tambahan
    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        if (n == 0 || n == 1) {
            return array; // Jika array kosong atau hanya satu elemen, langsung return
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicateFound = false;
            // Cek apakah array[i] sudah ada di temp
            for (int k = 0; k < j; k++) {
                if (array[i] == temp[k]) {
                    duplicateFound = true;
                    break;
                }
            }
            // Jika belum ada, simpan di temp
            if (!duplicateFound) {
                temp[j++] = array[i];
            }
        }

        // Membuat array hasil tanpa duplikat dengan ukuran j
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Method utama untuk menjalankan program
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 4, 4,5};

        int[] uniqueArray = removeDuplicates(inputArray);

        // Menampilkan hasil array tanpa duplikat
        System.out.print("Array tanpa duplikat: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}
