/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Single_Link_List;

/**
 *
 * @author Admin
 */
public class link_list {
     // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked list class
    static class Single_LinkList {
        private Node head;

        // Tambah node di awal (addFirst)
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        // Tambah node di akhir (addLast)
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Hapus node berdasarkan nilai
        public void remove(int data) {
            if (head == null) {
                System.out.println("Daftar kosong. Node tidak ditemukan.");
                return;
            }

            if (head.data == data) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }

            System.out.println("Node " + data + " tidak ditemukan.");
        }

        // Tampilkan isi linked list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Single_LinkList list = new Single_LinkList();

        // Tambah node di depan
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        list.display(); // Output: 10 -> 20 -> 30 -> null

        // Tambah node di akhir
        list.addLast(40);
        list.addLast(50);

        list.display(); // Output: 10 -> 20 -> 30 -> 40 -> 50 -> null

        // Hapus node
        list.remove(30);
        list.display(); // Output: 10 -> 20 -> 40 -> 50 -> null
    }
}
    

