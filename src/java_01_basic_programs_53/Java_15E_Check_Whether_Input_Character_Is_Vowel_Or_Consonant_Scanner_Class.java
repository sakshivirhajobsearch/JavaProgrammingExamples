package java_01_basic_programs_53;

//Java program to check whether input
//character is a vowel or consonant
//using Scanner and switch statement
import java.util.Scanner;

public class Java_15E_Check_Whether_Input_Character_Is_Vowel_Or_Consonant_Scanner_Class {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a character: ");

		// take only the first character
		char ch = scanner.next().charAt(0);

		// convert character to lowercase
		ch = Character.toLowerCase(ch);

		// check using switch case
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.print(ch + " is a vowel");
			break;
		default:
			// check if it's a valid alphabet
			if (Character.isLetter(ch))
				System.out.print(ch + " is a consonant");
			else
				System.out.print("Invalid input. Please enter an alphabet.");
		}

		scanner.close();
	}
}