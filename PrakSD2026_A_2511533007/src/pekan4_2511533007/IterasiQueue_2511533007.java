package pekan4_2511533007;

import java.util.*;

public class IterasiQueue_2511533007 {
	public static void main(String args[]) {

		Queue<String> q_3007 = new LinkedList<>();
		
		q_3007.add("Praktikum");
		q_3007.add("Struktur");
		q_3007.add("Data");
		q_3007.add("Dan");
		q_3007.add("Algoritma");
		Iterator<String> iterator_3007 = q_3007.iterator();
		while (iterator_3007.hasNext()) {
			System.out.print(iterator_3007.next() + " ");
		}
	}
}