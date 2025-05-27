package java_01_basic_programs_53;

//Java program to construct the complex number

public class Java_06A_Add_Two_Complex_Numbers_Approach_1 {

	// variables to hold real and imaginary part of complex
	// number
	int real, image;

	// Constructor which will be used while creating complex
	// number
	public Java_06A_Add_Two_Complex_Numbers_Approach_1(int r, int i) {

		this.real = r;
		this.image = i;
	}

	// function to print real number
	public void showC() {
		System.out.println(this.real + " +i " + this.image);
	}

	// we will implement this function for addition
	// public complex add(Java_06A_Add_Two_Complex_Numbers_Approach_1,
	// Java_06A_Add_Two_Complex_Numbers_Approach_1);
}
