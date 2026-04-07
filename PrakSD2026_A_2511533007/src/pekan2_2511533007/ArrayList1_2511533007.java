package pekan2_2511533007;
import java.util.ArrayList;

public class ArrayList1_2511533007 {

	public static void main(String[] args) {
		// Size of the ArrayList
		int n = 5;
		// Declaring the ArrayList with initial size n
		ArrayList<Integer> arrli = new ArrayList<Integer> (n);
		// appending new element at the end of the list
		for (int i = 1; i <= n; i++)
			arrli.add(i);
		// Printing elements
		System.out.println(arrli);
		// remove element at index3
		arrli.remove(3);
		// displaying the ArrayList
		// after deletion
		System.out.println(arrli);
		// printing element one by one
		for (int i = 0; i < arrli.size(); i++)
			System.out.println(arrli.get(i) + " ");
		

	}

}
