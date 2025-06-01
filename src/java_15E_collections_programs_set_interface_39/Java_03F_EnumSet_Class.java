package java_15E_collections_programs_set_interface_39;

//Java program to demonstrates the working 
//of both remove() and removeAll() Method
import java.util.EnumSet;

public class Java_03F_EnumSet_Class {

	// Enum
	enum Game {
		CRICKET, HOCKEY, TENNIS
	}

	public static void main(String[] args) {
		
		// Creating EnumSet using allOf()
		EnumSet<Game> g = EnumSet.allOf(Game.class);

		// Printing the EnumSet
		System.out.println("EnumSet: " + g);

		// Using remove()
		boolean b = g.remove(Game.CRICKET);

		System.out.println("Is CRICKET removed? " + b);

		// Using removeAll() and storing the boolean result
		boolean b2 = g.removeAll(g);

		System.out.println("Are all elements removed? " + b2);
	}
}