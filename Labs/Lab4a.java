// Lab 4a
// Jaocb Hinchey
// 1113
// This program will print user's current academic year given by the user.

import java.util.*;

public class Lab4a
{
	public static void main(String[] args)
	{
		// Declare five String constants, one for each year of possible input.
		String YEAR1 = "freshman";
		String YEAR2 = "sophomore";
		String YEAR3 = "junior";
		String YEAR4 = "senior";
		final String YEAR5 = "grad";

		// User input for current year
		int academicYear;

		// Create a Scanner Object to read in data.
		Scanner scan = new Scanner(System.in);

		// Write code to prompt the user for a year number.
		// Then, store the input into acedemicYear. You may assume that 
		// the user will enter a valid number.
		System.out.print("Enter your year: ");
		int academicYear = scan.nextInt();

		// Write a series of if ... else if ... else statements
		// to print out what year you are based on the int read in.  
		// If a 1 is entered print "Freshman"
		// If a 2 is entered print "Sophomore"
		// If a 3 is entered print "Junior"
		// If a 4 is entered print "Senior"
		// If a 5 is entered print "grad"
		// If something beside those five numbers was entered,
		// Print an error message and quit the program.
		if (academicYear = 1)
		{
			System.out.println(YEAR1);
		}
		if else (academicYear = 2)
		{
			System.out.println(YEAR2);
		}
		if else (academicYear = 3)
		{
			System.out.println(YEAR3);
		}
		if else (academicYear = 4)
		{
			System.out.println(YEAR4);
		}
		if else (academicYear = 5)
		{
			System.out.println(YEAR5);
		}
	} // End of main()
} // End of class



