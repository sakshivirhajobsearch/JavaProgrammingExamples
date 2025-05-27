package java_01_basic_programs_53;

//Java Program to check for command line arguments
public class Java_02D_Get_Input_From_The_User_Command_Line_Arguments {

	public static void main(String[] args) {

		// check if length of args array is
		// greater than 0
		if (args.length > 0) {
			System.out.println("The command line arguments are:");

			// iterating the args array and printing
			// the command line arguments
			for (String val : args)
				System.out.println(val);
		} else
			System.out.println("No command line " + "arguments found.");
	}
}
