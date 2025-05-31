package java_15D_collections_programs_deque_interface_26;

//Java Program to demonstrates 
//the working of ArrayDeque()
import java.util.ArrayDeque;

public class Java_03B_ArrayDeque_Class {

	public static void main(String[] args) {

		// Empty d with default capacity
		ArrayDeque<Integer> d = new ArrayDeque<>();
		d.add(10);
		d.add(20);
		System.out.println("ArrayDeque: " + d);
	}
}