package pekan4_2511533007;

import java.util.*;

public class ReverseData_2511533007 {
	public static void main(String[] args) {
		Queue<Integer> q_3007 = new LinkedList<Integer>();
		q_3007.add(1);
		q_3007.add(2);
		q_3007.add(3); // [1, 2, 3]
		System.out.println("sebelum reverse" + q_3007);
		Stack<Integer> s_3007 = new Stack<Integer>();
		while (!q_3007.isEmpty()) { //Q->S
			s_3007.push(q_3007.remove());
		}
		while (!s_3007.isEmpty()) { // S->Q
			q_3007.add(s_3007.pop());
		}
		System.out.println("sesudah reverse = " + q_3007); // [3, 2, 1]
	}

}
