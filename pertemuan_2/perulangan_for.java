/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;

/**
 *
 * @author Admin
 */
public class perulangan_for {
   
    public static void main(String[] args) {
        String nama = "pakk";
        int tinggi = 5; // tinggi segitiga

        System.out.println("Hai " + nama + ", berikut adalah pola segitiga bintang dengan tinggi " + tinggi + ":\n");

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nSemoga harimu menyenangkan, " + nama + "!");
    }
}


