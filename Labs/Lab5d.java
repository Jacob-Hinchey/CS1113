// Lab 5c
// Jacob Hinchey
// 60968

import java.util.*;

public class Lab5d
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

			double sum = 0;
			double product = 1;
			double count = 0;
			// Print out the sum, product, and average on one line
			while (lineScan.hasNextDouble())
			{
				double b = lineScan.nextDouble();
				sum += b;
				count++;
				product *= b;
			}
			double ave = (sum / count);
			System.out.println("sum= " +sum+ " product= " +product+ " count= " +count);
		}
	}
}
