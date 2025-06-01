package java_15A_collections_programs_40;

//Java program to demonstrate the
//working of a stack
import java.util.Iterator;
import java.util.Stack;

public class Java_01E_Use_Different_Types_Of_Collection_Stack {

	// Main Method
	public static void main(String args[]) {

		Stack<String> stack = new Stack<String>();
		stack.push("Geeks");
		stack.push("For");
		stack.push("Geeks");
		stack.push("Geeks");

		// Iterator for the stack
		Iterator<String> itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		stack.pop();

		// Iterator for the stack
		itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
