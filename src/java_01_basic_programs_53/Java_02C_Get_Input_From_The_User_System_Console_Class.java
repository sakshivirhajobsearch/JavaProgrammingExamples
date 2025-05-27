package java_01_basic_programs_53;

// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as
// System.console() may require console
import java.util.Scanner;

public class Java_02C_Get_Input_From_The_User_System_Console_Class {

	public static void main(String[] args) {

		// Using Scanner for Getting Input from User
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = scanner.nextLine();

		System.out.println("You entered string " + s);
		scanner.close();
	}
}