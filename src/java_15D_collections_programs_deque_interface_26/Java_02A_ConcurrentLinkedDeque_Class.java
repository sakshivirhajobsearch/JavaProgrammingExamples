package java_15D_collections_programs_deque_interface_26;

//Java Program to dmeonstrates the 
//working of ConcurrentLinkedDeque
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Java_02A_ConcurrentLinkedDeque_Class {

	public static void main(String[] args) {

		Deque<Integer> d = new ConcurrentLinkedDeque<>();
		d.addFirst(1);
		d.addLast(2);
		int f = d.pollFirst();
		int l = d.pollLast();
		System.out.println("First: " + f + ", Last: " + l);
	}
}