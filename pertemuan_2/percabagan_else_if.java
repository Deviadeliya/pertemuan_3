/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;

/**
 *
 * @author Admin
 */
public class percabagan_else_if {
    
    public static void main(String[] args) {
        int nilai = 85; // nilai langsung ditentukan

        System.out.println("Nilai anda: " + nilai);

        if (nilai >= 90) {
            System.out.println("Grade: A");
        } else if (nilai >= 80) {
            System.out.println("Grade: B");
        } else if (nilai >= 70) {
            System.out.println("Grade: C");
        } else if (nilai >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }
    }
}


