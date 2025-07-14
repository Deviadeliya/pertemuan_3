/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_6;

/**
 *
 * @author Admin
 */
public class Queue {
     public static void main(String[] args) {
        Queue queue = new Queue(5); // Antrian dengan kapasitas 5

        queue.enqueue("Orang 1");
        queue.enqueue("Orang 2");
        queue.enqueue("Orang 3");

        queue.display();

        queue.dequeue();
        queue.display();

        queue.enqueue("Orang 4");
        queue.enqueue("Orang 5");
        queue.enqueue("Orang 6"); // Ini akan gagal karena queue penuh

        queue.display();
    }

    // Class Queue manual tanpa library
    //static class Queue {
       String[] data;
       int front, rear, size, capacity;
    
        // Konstruktor
        public Queue(int kapasitas) {
            capacity = kapasitas;
            data = new String[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        // Menambahkan data ke antrian (enqueue)
        public void enqueue(String item) {
            if (isFull()) {
                System.out.println("Antrian penuh! Tidak bisa menambahkan " + item);
            } else {
                rear = (rear + 1) % capacity;
                data[rear] = item;
                size++;
                System.out.println(item + " masuk antrian.");
            }
        }

        // Menghapus data dari antrian (dequeue)
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Antrian kosong! Tidak bisa menghapus.");
            } else {
                System.out.println(data[front] + " keluar dari antrian.");
                front = (front + 1) % capacity;
                size--;
            }
        }

        // Menampilkan semua isi antrian
        public void display() {
            if (isEmpty()) {
                System.out.println("Antrian kosong!");
            } else {
                System.out.println("Isi antrian:");
                for (int i = 0; i < size; i++) {
                    int index = (front + i) % capacity;
                    System.out.println("- " + data[index]);
                }
            }
        }

        // Cek apakah antrian penuh
        public boolean isFull() {
            return size == capacity;
        }

        // Cek apakah antrian kosong
        public boolean isEmpty() {
            return size == 0;
        }
    }



