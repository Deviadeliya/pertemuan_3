/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;

/**
 *
 * @author Admin
 */import java.util.Scanner;
public class percabangan_swict_case {
   
    public static void main(String[] args) {
        // Menampilkan pilihan menu
        try (Scanner input = new Scanner(System.in)) {
            // Menampilkan pilihan menu
            System.out.println("===== MENU HARI =====");
            System.out.println("1. Senin");
            System.out.println("2. Selasa");
            System.out.println("3. Rabu");
            System.out.println("4. Kamis");
            System.out.println("5. Jumat");
            System.out.println("6. Sabtu");
            System.out.println("7. Minggu");
            
            // Meminta input dari pengguna
            System.out.print("Pilih nomor hari (1-7): ");
            int pilihan = input.nextInt();
            
            // Percabangan switch-case
            switch (pilihan) {
                case 1 -> System.out.println("Hari ini adalah Senin");
                case 2 -> System.out.println("Hari ini adalah Selasa");
                case 3 -> System.out.println("Hari ini adalah Rabu");
                case 4 -> System.out.println("Hari ini adalah Kamis");
                case 5 -> System.out.println("Hari ini adalah Jumat");
                case 6 -> System.out.println("Hari ini adalah Sabtu");
                case 7 -> System.out.println("Hari ini adalah Minggu");
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }
}


