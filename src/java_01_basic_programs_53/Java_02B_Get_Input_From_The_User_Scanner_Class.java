package java_01_basic_programs_53;

//Java program to demonstrate working of Scanner Class
import java.util.Scanner;

public class Java_02B_Get_Input_From_The_User_Scanner_Class {

	public static void main(String args[]) {

		// Using Scanner for Getting Input from User
		Scanner s = new Scanner(System.in);

		String s1 = s.nextLine();
		System.out.println("You entered string " + s1);

		int a = s.nextInt();
		System.out.println("You entered integer " + a);

		float b = s.nextFloat();
		System.out.println("You entered float " + b);
	}
}