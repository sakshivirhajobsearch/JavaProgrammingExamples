package java_01_basic_programs_53;

public class Java_15C_Check_Whether_Input_Character_Is_Vowel_Or_Consonant_Switch_Case {

	public static void main(String args[]) {
		char ch = 'i';

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
			System.out.print(ch + " is a consonant");
		}
	}
}