package java_15E_collections_programs_set_interface_39;

//Java Program to demonstrates the 
//working of EnumSet.allOf() method
import java.util.EnumSet;

public class Java_03C_EnumSet_Class {

	// Enum
	enum Game {
		CRICKET, HOCKEY, TENNIS
	}

	public static void main(String[] args) {

		// Creating an EnumSet using allOf()
		EnumSet<Game> g = EnumSet.allOf(Game.class);

		// Printing EnumSet elements to the console
		System.out.println("EnumSet: " + g);
	}
}