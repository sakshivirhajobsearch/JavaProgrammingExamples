package java_01_basic_programs_53;

// Java Program to Find the Largest of three Numbers
// Using Collections.max() method

import java.lang.*;
import java.util.*;

public class Java_08C_Find_Largest_Among_3_Numbers_Approach_3 {

	public static void main(String[] args) {
		
		int a, b, c;
		// Considering random integers three numbers
		a = 5;
		b = 10;
		c = 3;
		ArrayList<Integer> x = new ArrayList<>();
		x.add(a);
		x.add(b);
		x.add(c);

		// Printing the largest number
		System.out.println(Collections.max(x) + " is the largest number.");
	}
}