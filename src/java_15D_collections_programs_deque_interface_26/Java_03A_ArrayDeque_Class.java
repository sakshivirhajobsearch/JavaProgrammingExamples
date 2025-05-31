package java_15D_collections_programs_deque_interface_26;

//Java Program to demonstrates 
//the working of ArrayDeque
import java.util.ArrayDeque;
import java.util.Deque;

public class Java_03A_ArrayDeque_Class {

	public static void main(String[] args) {

		Deque<Integer> d = new ArrayDeque<>();
		d.addFirst(1);
		d.addLast(2);
		int f = d.removeFirst();
		int l = d.removeLast();
		System.out.println("First: " + f + ", Last: " + l);
	}
}