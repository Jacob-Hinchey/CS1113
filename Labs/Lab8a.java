// Lab 8a
// Jacob Hinchey
// 1113
import java.util.*;
public class Lab8a
{
	public static void main(String[] args)
	{
		// Read an integer from the command line
		int tableSize = Integer.parseInt(args[0]);

		// Create a 2D array of ints to hold the addition table
		int table[][] = new int[tableSize][tableSize];

		// Fill out the table using a nested loop so that
		// table[r][c] = r + c
		int arr2D;
		for (int r = 0; r < tableSize; r++)
		{
			for (int c = 0; c < tableSize; c++)
			{

				table[r][c] =(r + c);
			}
		}

		// Iterate over the table, printing each value
		// so that columns align (hint: use a nested loop,
		// and printf)
		for(int i = 0; i < tableSize; i++)
		{
			for(int k = 0; k < tableSize; k++)
			{
				System.out.printf("%3d", table[i][k]);
			}
			System.out.println();
		}
	}
}
