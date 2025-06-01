package java_15C_collections_programs_queue_interface_73;

//Java Program Implementing AbstractQueue
import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Java_02A_AbstractQueue_Class {

	public static void main(String[] args) {

		// Creating object of AbstractQueue<Integer>
		AbstractQueue<Integer> a = new LinkedBlockingQueue<Integer>();

		// Adding element
		a.add(1);
		a.add(2);
		a.add(3);

		System.out.println("AbstractQueue : " + a);
	}
}
