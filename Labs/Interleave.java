// Interleave
// Jacob Hinchey
// 1113

import java.util.*;
import java.io.*;

public class Interleave
{
	public static void main(String[] args)
	{
		// Usage statement (2 inputs needed)
		if(args.length != 2)
		{
			System.out.println("Please provide two filenames for the program");
			return;
		}

		try {

			// Open scanner for file named args[0]
			Scanner scan1 = new Scanner(new File(args[0]));

			// Open scanner for file named args[1]
			Scanner scan2 = new Scanner(new File(args[1]));

			boolean moreLines = true;
			while (moreLines)
			{
				moreLines = false;

				// If scan1 has another line then read that line, copy it
				// to the console, and set moreLines to true
				if(scan1.hasNext())
				{
					System.out.print(scan1);
					moreLines = true;
				}
				else moreLines = false;
				// If the second scanner, scan2, has another line,
				// then get that line, copy it to the console, and set
				// moreLines to true.
				if(scan1.hasNext())
				{
					System.out.print(scan2);
					moreLines = true;
				}
				else moreLines = false;
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
