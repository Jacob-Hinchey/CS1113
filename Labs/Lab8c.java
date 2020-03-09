
// Lab 8c
// Jacob Hinchey
// 1113
// Largest value = 748

public class Lab8c
{
	public static void main(String[] args)
	{
		int SIZE = Integer.parseInt(args[0]);

		// Create a 3-dimensional array of double where
		// the size of each dimension is SIZE:
		double table[][][] = new double [SIZE][SIZE][SIZE];

		// Fill in the table using a 3-deep nested loop so that
		// table[a][b][c] = 1.5 for all a,b,c.
		for (int a = 0; a < SIZE; a++)
	  {
			for(int b = 0; b < SIZE; b++)
			{
				for(int c = 0; c < SIZE; c++)
				{
					table[a][b][c] = 1.5;
				}
			}
		}
	}
}
