/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author Admin
 */
public class contohstac {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Buku");
        s.push("Pensil");
        s.push("Pulpen");
        s.lihat();
        s.pop();
        s.lihat();
    }

    // Stack sebagai static inner class
    static class Stack {

        String[] stack = new String[3];
        int top = -1;

        void push(String data) {
            if (top < 2) {
                stack[++top] = data;
            } else {
                System.out.println("Stack penuh!");
            }
        }

        void pop() {
            if (top >= 0) {
                System.out.println(stack[top--] + " dihapus.");
            } else {
                System.out.println("Stack kosong!");
            }
        }

        void lihat() {
            if (top == -1) {
                System.out.println("Stack kosong!");
            } else {
                System.out.println("Isi Stack:");
                for (int i = top; i >= 0; i--) {
                    System.out.println("- " + stack[i]);
                }
            }
        }
    }
}
