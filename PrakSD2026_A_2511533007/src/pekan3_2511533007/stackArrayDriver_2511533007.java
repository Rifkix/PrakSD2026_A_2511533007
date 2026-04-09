package pekan3_2511533007;

public class stackArrayDriver_2511533007 {
	public static void main (String[] args) {
		stackArray_2511533007 s = new stackArray_2511533007();
		s.push_3007(10);
		s.push_3007(20);
		s.push_3007(30);
		System.out.println(s.pop_3007() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah :" + s.peek_3007());
		System.out.print("Element pada stack :");
		s.print_3007();
	}

}
