package java_15E_collections_programs_set_interface_39;

//Java Program to demonstrate the Working
//of EnumSet and its functions
import java.util.EnumSet;

//Enum
enum e {
	CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
};

public class Java_03B_EnumSet_Class {

	public static void main(String[] args) {

		// Creating a set
		EnumSet<e> s1, s2, s3, s4;

		// Adding elements
		s1 = EnumSet.of(e.QUIZ, e.CONTRIBUTE, e.LEARN, e.CODE);
		s2 = EnumSet.complementOf(s1);
		s3 = EnumSet.allOf(e.class);
		s4 = EnumSet.range(e.CODE, e.CONTRIBUTE);

		// Printing corresponding elements in Sets
		System.out.println("Set 1: " + s1);
		System.out.println("Set 2: " + s2);
		System.out.println("Set 3: " + s3);
		System.out.println("Set 4: " + s4);
	}
}