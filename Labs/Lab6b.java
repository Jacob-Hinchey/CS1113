
// Lab 6b
// Jacob Hinchey
// 1113

import java.util.*;

public class Lab6b
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		// Read in the number of data points
		int numDataPoints = scan.nextInt();

		// Create an array to hold the data points, and another to
		// hold the moving average
		double data[] = new double[numDataPoints];
		double secondDerivative[] = scan.nextDouble();

		// Read in all of the data points using a for loop
		for (int i = 0; i < data.length; i++)
		{
 			data[i] = scan.nextDouble();
		}
		// Print out the data using printArray
		printArray(data);
		System.out.println();

		// Create the second derivative for each data point
		// and save them in the secondDerivative array
		// Since the first and last elements of the array do not have
		// neighbors, set the second derivatives of those indices to 0
		secondDerivative = 0;

		// Print the second derivative array using printArray.
		printArray(secondDerivative);
	}

	public static void printArray(double[] arr)
	{
		// Print the values of arr on a single line with spaces between them.
		System.out.printf(data[]);
	}
}
