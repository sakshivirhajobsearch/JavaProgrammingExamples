package java_01_basic_programs_53;

//Java program to add two complex numbers

public class Java_06B_Add_Two_Complex_Numbers_Approach_2 {

	// variables to hold real and imaginary part of complex
	// number
	int real, image;

	// Constructor which will be used while creating complex
	// number
	public Java_06B_Add_Two_Complex_Numbers_Approach_2(int r, int i) {

		this.real = r;
		this.image = i;
	}

	// function to print real number
	public void showC() {
		System.out.print(this.real + " +i" + this.image);
	}

	// function for addition
	public static Java_06B_Add_Two_Complex_Numbers_Approach_2 add(Java_06B_Add_Two_Complex_Numbers_Approach_2 n1,
			Java_06B_Add_Two_Complex_Numbers_Approach_2 n2) {

		// creating blank complex number
		// to store result
		Java_06B_Add_Two_Complex_Numbers_Approach_2 res = new Java_06B_Add_Two_Complex_Numbers_Approach_2(0, 0);

		// adding real parts of both complex numbers
		res.real = n1.real + n2.real;

		// adding imaginary parts
		res.image = n1.image + n2.image;

		// returning result
		return res;
	}

	public static void main(String arg[]) {

		// creating two complex numbers
		Java_06B_Add_Two_Complex_Numbers_Approach_2 c1 = new Java_06B_Add_Two_Complex_Numbers_Approach_2(4, 5);
		Java_06B_Add_Two_Complex_Numbers_Approach_2 c2 = new Java_06B_Add_Two_Complex_Numbers_Approach_2(10, 5);

		// printing complex numbers
		System.out.print("first Complex number: ");
		c1.showC();

		System.out.print("\nSecond Complex number: ");
		c2.showC();

		// calling add() to perform addition
		Java_06B_Add_Two_Complex_Numbers_Approach_2 res = add(c1, c2);

		// displaying addition
		System.out.println("\nAddition is :");
		res.showC();
	}
}
