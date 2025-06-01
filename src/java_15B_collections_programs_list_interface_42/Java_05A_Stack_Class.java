package java_15B_collections_programs_list_interface_42;

//Java Program Implementing Stack Class
import java.util.Stack;

public class Java_05A_Stack_Class {

	public static void main(String[] args) {

		// Create a new stack
		Stack<Integer> s = new Stack<>();

		// Push elements onto the stack
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		// Pop elements from the stack
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}
