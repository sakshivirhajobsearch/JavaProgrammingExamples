package java_01_basic_programs;

//Java program to compute
//simple interest for given principal
//amount, time and rate of interest.
import java.io.*;

public class Java_18B_Calculate_Simple_Interest_Approach_2 {

	public static void main(String args[]) {

		// We can change values here for
		// different inputs
		float P = 10000, R = 5, T = 5;

		// Calculate simple interest
		float SI = (P * T * R) / 100;
		System.out.println("Simple interest = " + SI);
	}
}