package java_01_basic_programs_53;

public class Java_14B_Check_Whether_The_Input_Number_Is_A_Neon_Number_Approach_2 {

	public static void main(String[] args) {

		int number = 9;
		int square = number * number;
		if (isNeonNumber(square, number)) {
			System.out.println(number + " is a neon number");
		} else {
			System.out.println(number + " is not a neon number");
		}
	}

	private static boolean isNeonNumber(int square, int number) {
		if (square == 0) {
			return number == 0;
		} else {
			int digit = square % 10;
			return isNeonNumber(square / 10, number - digit);
		}
	}
}
