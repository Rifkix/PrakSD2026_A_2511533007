package pekan3_2511533007;

public class stackArray_2511533007 {
	static final int MAX_3007 = 1000;
	int top_3007;
	int a_3007[] =new int [MAX_3007];
	boolean isEmpty_3007() {
		return (top_3007 < 0);
		
	}
	stackArray_2511533007() {
		top_3007 = -1;
	}
	boolean push_3007 (int x) {
		if (top_3007 >= (MAX_3007 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}else {
			a_3007[++top_3007] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_3007() {
		if (top_3007 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_3007[top_3007--];
			return x;
		}
	}
	int peek_3007() {
		if (top_3007 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_3007[top_3007];
			return x;
		}
	}
	void print_3007() {
		for (int i = top_3007; i > -1; i--) {
			System.out.print(" " + a_3007[i]);
		}
	}

}
