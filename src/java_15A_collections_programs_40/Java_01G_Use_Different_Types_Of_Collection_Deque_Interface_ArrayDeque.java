package java_15A_collections_programs_40;

//Java program to demonstrate the
//ArrayDeque class in Java
import java.util.ArrayDeque;

public class Java_01G_Use_Different_Types_Of_Collection_Deque_Interface_ArrayDeque {

	public static void main(String[] args) {

		// Initializing an deque
		ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);

		// add() method to insert
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);
		de_que.add(40);
		de_que.add(50);

		System.out.println(de_que);

		// clear() method
		de_que.clear();

		// addFirst() method to insert the
		// elements at the head
		de_que.addFirst(564);
		de_que.addFirst(291);

		// addLast() method to insert the
		// elements at the tail
		de_que.addLast(24);
		de_que.addLast(14);

		System.out.println(de_que);
	}
}
