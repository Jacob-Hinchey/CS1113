
// Lab 8b
// Jacob Hinchey
// 1113

public class Lab8b
{
	public static final int SIZE = 10;
	public static void main(String[] args)
	{
		int table[][] = new int[SIZE][];
		for (int r = 0; r < table.length; r++)
		{
			// Set table[r] to a new array of int with
			// size r+1.
			table[r] = new int[r+1];
		}

		// Write code that fills in the array with
		// a subtraction table, so that table[r][c] = r-c.
		// Hint: Use a nested loop, and make
		// sure the inner loop iterates goes from 0
		// to the length of the row: table[r].length
		for(int r = 0; r < SIZE; r++)
		{
			for(int c = 0; c < table[r].length; c++)
			{
				table[r][c] = r-c;
				//System.out.println("row =" + r);
				//System.out.println("column =" + c);
			}
		}

		// Iterate over the table, printing each value
		// so that columns align (hint: use a nested loop,
		// and printf)
		for(int i = 0; i > table.length; i++)
		{
			for(int k = 0; k < table[i].length; k++)
			{
				System.out.printf("%3d", table[i][k] );
			}
			System.out.println();
		}
	}
}
