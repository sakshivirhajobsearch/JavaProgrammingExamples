package java_01_basic_programs_53;

//Java program to read input using DataInputStream class
import java.io.DataInputStream;
import java.io.IOException;

public class Java_02E_Get_Input_From_The_User_DataInputStream_Class {

	public static void main(String[] args) throws IOException {
		DataInputStream r = new DataInputStream(System.in);

		// Reading integers
		System.out.print("Enter an integer: ");
		int i = Integer.parseInt(r.readLine());

		// Reading strings
		System.out.print("Enter a string: ");
		String s = r.readLine();
		System.out.println("You entered integer: " + i);
		System.out.println("You entered string: " + s);
	}
}