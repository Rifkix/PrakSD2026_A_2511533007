package pekan4_2511533007;

import java.util.*;

public class QueueLinkedList_2511533007 {
	public static void main(String[] args) {
		Queue<Integer> q_3007 = new LinkedList<>();
		// tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i = 0; i < 6; i++) 
			q_3007.add(i);
		// Menampilkan isis antrian.
		System.out.println("Elemen Antrian " + q_3007);
		// Untuk menghaous kepala antrian.
		int hapus_3007 = q_3007.remove();
		System.out.println("Hapus elemen = " + hapus_3007);
		System.out.println(q_3007);
		// Untuk melihat antrian terdepan
		int depan_3007 = q_3007.peek();
		System.out.println("kepala Antrian = " + depan_3007);
		
		int banyak_3007 = q_3007.size();
		System.out.println("Size Antrian = " + banyak_3007);
	}

}
