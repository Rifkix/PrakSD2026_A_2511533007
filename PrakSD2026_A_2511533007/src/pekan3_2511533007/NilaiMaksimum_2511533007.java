package pekan3_2511533007;
import java.util.Stack;

public class NilaiMaksimum_2511533007 {
	public static int max_3007(Stack<Integer> s_3007) {
		Stack<Integer> backup_3007 = new Stack<Integer>();
		int maxValue_3007 = s_3007.pop();
		backup_3007.push(maxValue_3007);
		while (!s_3007.isEmpty()) {
			int next_3007 = s_3007.pop();
			backup_3007.push(next_3007);
			maxValue_3007 = Math.max(maxValue_3007, next_3007);
		}
		while (!backup_3007.isEmpty()) {
			s_3007.push(backup_3007.pop());
		}
		return maxValue_3007;	
		
	}
	public static void main(String[] args) {
		Stack<Integer> s_3007 = new Stack<Integer>();
		s_3007.push(70);
		s_3007.push(12);
		s_3007.push(14);
		System.out.println("isi stack ");
		System.out.println("Stack Teratas "+ s_3007.peek());
		System.out.println("Nilai maksimum " +max_3007(s_3007));
	}

}
