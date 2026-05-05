package pekan4_2511533007;
 
import java.util.*;
 
public class Queue_2511533007 {
 
    int front_3007, rear_3007, size_3007;
    int max_3007;
    String[] queue_3007;
 
    public Queue_2511533007(int capacity_3007) {
        this.max_3007 = capacity_3007;
        front_3007 = this.size_3007 = 0;
        rear_3007 = capacity_3007 - 1;
        queue_3007 = new String[this.max_3007];
    }
 
    public boolean isFull_3007() {
        return (this.size_3007 == this.max_3007);
    }
 
    public boolean isEmpty_3007() {
        return (this.size_3007 == 0);
    }
 
    public void enqueue_3007(String namaPelanggan_3007) {
        if (isFull_3007()) {
            System.out.println("Antrian penuh");
            return;
        }
        this.rear_3007 = (this.rear_3007 + 1) % this.max_3007;
        this.queue_3007[this.rear_3007] = namaPelanggan_3007;
        this.size_3007 = this.size_3007 + 1;
        System.out.println(namaPelanggan_3007 + " berhasil masuk antrian");
    }
 
    public String dequeue_3007() {
        if (isEmpty_3007()) 
            return null;
        String pelanggan_3007 = this.queue_3007[this.front_3007];
        this.queue_3007[this.front_3007] = null;
        this.size_3007 = this.size_3007 - 1;;
        return pelanggan_3007;
    }

    public void display_3007() {
        if (isEmpty_3007()) {
            System.out.println("\nAntrian kosong\n");
            return;
        }
        System.out.println("Antrian loket:");
        for (int i = 0; i < size_3007; i++) {
            int index_3007 = (front_3007 + i) % max_3007;
            System.out.print(queue_3007[index_3007]);
            if (i < size_3007 - 1) {
                System.out.print("\n");
            }
        }System.out.println();
    }
 
    public void reverse_3007() {
        if (isEmpty_3007()) {
            System.out.println("Antrian kosong");
            return;
        }
 
        Stack<String> stack_3007 = new Stack<String>();
 
        int jumlah_3007 = this.size_3007;
        for (int i = 0; i < jumlah_3007; i++) {
            stack_3007.push(this.queue_3007[(this.front_3007 + i) % this.max_3007]);
        }
        
        this.front_3007 = 0;
        this.rear_3007 = max_3007 - 1;
        this.size_3007 = 0;

        while (!stack_3007.isEmpty()) {
            this.rear_3007 = (this.rear_3007 + 1) % this.max_3007;
            this.queue_3007[this.rear_3007] = stack_3007.pop();
            this.size_3007++;
        }
    }
 
    public String front_3007() {
        if (isEmpty_3007()) 
        	return null;
        return this.queue_3007[this.front_3007];
    }
 
    public String rear_3007() {
        if (isEmpty_3007()) return null;
        return this.queue_3007[this.rear_3007];
    }
}