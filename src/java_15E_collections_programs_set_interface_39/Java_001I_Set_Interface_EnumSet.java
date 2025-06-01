package java_15E_collections_programs_set_interface_39;

//Java program to demonstrate the
//creation of the set object
//using the EnumSet class
import java.util.EnumSet;
import java.util.Set;

enum Gfg {
	CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
};

public class Java_001I_Set_Interface_EnumSet {

	public static void main(String[] args) {
		
		// Creating a set
		Set<Gfg> s1;

		// Adding the elements
		s1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE, Gfg.LEARN, Gfg.CODE);

		System.out.println("Set 1: " + s1);
	}
}