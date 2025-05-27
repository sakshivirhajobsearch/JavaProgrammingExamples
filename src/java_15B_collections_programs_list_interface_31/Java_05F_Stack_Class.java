package java_15B_collections_programs_list_interface_31;

//A Java Program to show implementation
//of Stack using ArrayDeque
import java.util.ArrayDeque;
import java.util.Deque;

class Java_05F_Stack_Class {
	
	public static void main(String[] args) {
		
		Deque<Character> stack = new ArrayDeque<Character>();
		stack.push('A');
		stack.push('B');
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}
}
