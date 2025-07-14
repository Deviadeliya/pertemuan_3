/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_5library;

/**
 *
 * @author Admin
 */import java.util.Stack;
public class Stack_library { 
    private final Stack<String> stack;

    public Stack_library() {
        stack = new Stack<>();
    }

    public void push(String data) {
        stack.push(data);
        System.out.println(data + " ditambahkan ke stack.");
    }

    public void pop() {
        if (!stack.isEmpty()) {
            String removed = stack.pop();
            System.out.println(removed + " dihapus dari stack.");
        } else {
            System.out.println("Stack kosong, tidak bisa pop.");
        }
    }

    public void peek() {
        if (!stack.isEmpty()) {
            System.out.println("Elemen teratas: " + stack.peek());
        } else {
            System.out.println("Stack kosong, tidak ada elemen teratas.");
        }
    }

    public void lihat() {
        if (stack.isEmpty()) {
            System.out.println("Stack kosong!");
        } else {
            System.out.println("Isi Stack:");
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.println("- " + stack.get(i));
            }
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        Stack_library myStack = new Stack_library();

        myStack.push("A");
        myStack.push("B");
        myStack.push("C");

        myStack.lihat();

        myStack.peek();

        myStack.pop();
        myStack.lihat();

        System.out.println("Ukuran stack sekarang: " + myStack.size());
        System.out.println("Apakah stack kosong? " + myStack.isEmpty());
    }
}
