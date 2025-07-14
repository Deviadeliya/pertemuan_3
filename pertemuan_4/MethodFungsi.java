/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author Admin
 */
class MethodFungsi {
  

    // Method (fungsi) untuk menghitung luas persegi panjang
    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        int panjang = 10;
        int lebar = 5;
        int luas = hitungLuas(panjang, lebar);
        System.out.println("Luas persegi panjang: " + luas);
    }
}


