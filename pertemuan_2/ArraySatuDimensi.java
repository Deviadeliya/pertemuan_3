/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;

/**
 *
 * @author Admin
 */   import java.util.Scanner;
public class ArraySatuDimensi {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array 1 dimensi untuk menyimpan 5 nilai
        int[] nilai = new int[5];

        // Input nilai ke dalam array
        System.out.println("Masukkan 5 nilai:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Menampilkan isi array
        System.out.println("\nIsi array:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("nilai[" + i + "] = " + nilai[i]);
        }
    }
}


