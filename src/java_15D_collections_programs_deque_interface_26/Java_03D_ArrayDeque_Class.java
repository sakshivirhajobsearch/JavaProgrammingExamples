package java_15D_collections_programs_deque_interface_26;

//Java Program to demonstrates the working of
//ArrayDeque(int numofElements)
import java.util.ArrayDeque;

public class Java_03D_ArrayDeque_Class {

	public static void main(String[] args) {

		ArrayDeque<Integer> d = new ArrayDeque<>(10);
		d.add(5);
		d.add(15);
		System.out.println("ArrayDeque: " + d);
	}
}