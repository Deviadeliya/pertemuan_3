/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstruktur_java;

/**
 *
 * @author Admin
 */
public class array_intimput {
    public static void main(String[] args) {
        
        //array yang sudah ditentukan
        int[]array={1,2,3,4,5};
        
        //menampailkan array secara terbalik
       System.out.print("Array terbalik: [");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");} 
    }
