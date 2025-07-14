/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_7;

/**
 *
 * @author Admin
 */ import java.util.Scanner;

public class Ascendingtanpa_queue {
    

    public static void main(String[] args) {
        // Input jumlah data
        try (Scanner sc = new Scanner(System.in)) {
            // Input jumlah data
            System.out.print("Masukkan jumlah data: ");
            int n = sc.nextInt();
            
            int[] data = new int[n];
            
            // Input elemen data
            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan data ke-" + (i + 1) + ": ");
                data[i] = sc.nextInt();
            }
            
            // Proses sorting ascending (Bubble Sort)
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (data[j] > data[j + 1]) {
                        // Tukar posisi
                        int temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
            
            // Tampilkan hasil sorting
            System.out.print("\nData setelah diurutkan secara ascending: ");
            for (int i = 0; i < n; i++) {
                System.out.print(data[i] + " ");
            }
        }
    }
}


