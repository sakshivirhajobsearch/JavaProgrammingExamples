package java_15B_collections_programs_list_interface_42;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Java_05G_Stack_Class {
	
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		Deque<Integer> deque = new ArrayDeque<>();

		stack.push(1);
		deque.push(1);
		stack.push(2);
		deque.push(2);

		List<Integer> list1 = stack.stream().collect(Collectors.toList());
		System.out.println("Using Stack: ");
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();

		List<Integer> list2 = deque.stream().collect(Collectors.toList());
		System.out.println("Using Deque: ");
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
		System.out.println();
	}
}
