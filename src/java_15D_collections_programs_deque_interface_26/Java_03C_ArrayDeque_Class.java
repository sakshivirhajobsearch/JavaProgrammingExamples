package java_15D_collections_programs_deque_interface_26;

//Java Program to demonstrates the working of
//ArrayDeque(Collection<? extends E> c)
import java.util.ArrayDeque;
import java.util.Arrays;

public class Java_03C_ArrayDeque_Class {

	public static void main(String[] args) {

		ArrayDeque<Integer> d = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4));
		System.out.println("ArrayDeque: " + d);
	}
}