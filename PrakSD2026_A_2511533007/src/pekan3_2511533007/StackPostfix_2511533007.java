package pekan3_2511533007;
import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511533007 {
	public static int postfixEvaluate_3007(String expression) {
		Stack<Integer> s_3007 = new Stack<Integer>();
		Scanner input_3007 = new Scanner(expression);
		while (input_3007.hasNext()) {
			if (input_3007.hasNextInt()) {		//an operand (integer)
				s_3007.push(input_3007.nextInt());
			} else {							// an operator
				String operator_3007 = input_3007.next();
				int operand2_3007 = s_3007.pop();
				int operand1_3007 = s_3007.pop();
				if (operator_3007.equals("+")) {
					s_3007.push(operand1_3007 + operand2_3007);
				} else if (operator_3007.equals("-")) {
					s_3007.push(operand1_3007 - operand2_3007);
				} else if (operator_3007.equals("*")) {
					s_3007.push(operand1_3007 * operand2_3007);
				} else {
					s_3007.push(operand1_3007 / operand2_3007);
				}
			}
		}
		input_3007.close();
		return s_3007.pop();
	}
	public static void main(String[] args) {
		System.out.println("hasil postfix= " + postfixEvaluate_3007("5 2 4 * 7 -"));
	}

}
