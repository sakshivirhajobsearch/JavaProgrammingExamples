package java_15E_collections_programs_set_interface_39;

//Java program to demonstrate the 
//working of both add and addAll() method
import java.util.EnumSet;

public class Java_03D_EnumSet_Class {

	// Enum
	enum Game {
		CRICKET, HOCKEY, TENNIS
	}

	public static void main(String[] args) {

		// Creating an EnumSet
		// using allOf()
		EnumSet<Game> g1 = EnumSet.allOf(Game.class);

		// Creating an EnumSet
		// using noneOf()
		EnumSet<Game> g2 = EnumSet.noneOf(Game.class);

		// Using add() method
		g2.add(Game.HOCKEY);

		// Printing the elements to the console
		System.out.println("EnumSet Using add(): " + g2);

		// Using addAll() method
		g2.addAll(g1);

		// Printing the elements to the console
		System.out.println("EnumSet Using addAll(): " + g2);
	}
}
