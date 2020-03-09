// Lab 5c
// Jacob Hinchey
// 1113

import java.util.*;

public class Lab5c
{
	public static void main(String args[])
	{
		// Make a scanner from System.in
		Scanner scan = new Scanner(System.in);

		// Process each line separately
		// If the next token is a double, assume there is an input line

		while (scan.hasNextDouble())
		{
			// Get a line from the input
			String line = scan.nextLine();

			// Create a scanner for the line of input you have read
			Scanner lineScan = new Scanner(line);

			// Write a while loop that will sum all of the
			// double values on the line (hint: create double
			// variables called "sum", "product", and "count".
			// Set sum and count to 0, and product to 1.
			// Then read as many double values
			// as you can using the while loop  When you read
			// a number, add it to sum, multiply product by it,
			// and add 1 to count.
			processLine(line);
		}
	}
	// Compute the average by dividing sum by count
	public static void processLine(String line)
	{
		Scanner lineScan = new Scanner(line);
		double sum = 0;
		double product = 1;
		double number = 0;
		// Print out the sum, product, and average on one line
		while (lineScan.hasNextDouble())
		{
			double b = lineScan.nextDouble();
			sum += b;
			number++;
			product *= b;
		}

	}
}
