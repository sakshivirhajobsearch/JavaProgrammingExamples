package java_15E_collections_programs_set_interface_39;

//Java program to demonstrates the 
//working of iterator() method
import java.util.EnumSet;
import java.util.Iterator;

public class Java_03E_EnumSet_Class {

	// Enum
	enum Game {
		CRICKET, HOCKEY, TENNIS
	}

	public static void main(String[] args) {
		
		// Creating an EnumSet using allOf()
		EnumSet<Game> g = EnumSet.allOf(Game.class);

		// Creating an iterator on games
		Iterator<Game> i = g.iterator();

		System.out.print("EnumSet: ");

		while (i.hasNext()) {

			// Iterating and printing elements to
			// the console using next() method

			System.out.print(i.next());
			System.out.print(", ");
		}
	}
}
