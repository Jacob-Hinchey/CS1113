// Program4
// Jacob Hinchey
// 1113S

import java.util.*;
public class Program4
{
	public static void main(String args[])
	{
		System.out.print("Program 4\nby: Jacob Hinchey\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a phrase: ");
		String d = scan.nextLine();
		printBraille(d);
	}
	public static void printBraille(String s)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz0123456789 ";
		String c1 = ". |. |..|..|. |..|..|. | .| .|. |. |..|..|. |..|..|. | .| .|. |. | .|..|..|. | .|. |. |..|..|. |..|..|. | .|  |";
		String c2 = "  |. |  | .| .|. |..|..|. |..|  |. |  | .| .|. |..|..|. |..|  |. |..|  | .| .|..|  |. |  | .| .|. |..|..|. |  |";
		String c3 = "  |  |  |  |  |  |  |  |  |  |. |. |. |. |. |. |. |. |. |. |..|..| .|..|..|..|  |  |  |  |  |  |  |  |  |  |  |";
		char c;
		for (int i=0; i<s.length(); i++)
		{
			c = s.charAt(i);
			System.out.print(" " + c + " ");
		}
		System.out.println();
		for (int i=0; i<s.length(); i++)
		{
			c = s.charAt(i);
			int n = letters.indexOf(c);
			n *= 3;
			int count = n + 3;
			while(n < count)
			{
				System.out.print(c1.charAt(n));
				n++;
			}
		}
		System.out.println();
		for (int i=0; i<s.length(); i++)
		{
			c = s.charAt(i);
			int n = letters.indexOf(c);
			n *= 3;
			int count = n + 3;
			while(n < count)
			{
				System.out.print(c2.charAt(n));
				n++;
			}
		}
		System.out.println();
		for (int i=0; i<s.length(); i++)
		{
			c = s.charAt(i);
			int n = letters.indexOf(c);
			n *= 3;
			int count = n + 3;
			while(n < count)
			{
				System.out.print(c3.charAt(n));
				n++;
			}
		}
		System.out.println();
	}
}
