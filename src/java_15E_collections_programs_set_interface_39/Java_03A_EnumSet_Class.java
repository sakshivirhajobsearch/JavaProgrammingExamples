package java_15E_collections_programs_set_interface_39;

//Creating an EnumSet
import java.util.EnumSet;

enum Student {
	Geek1, Geek2, Geek3, Geek4, Geek5
}

public class Java_03A_EnumSet_Class {

	public static void main(String[] args) {

		// Create an EnumSet containing specific elements
		EnumSet<Student> e = EnumSet.of(Student.Geek1, Student.Geek2, Student.Geek3);

		System.out.println("EnumSet: " + e);
	}
}
