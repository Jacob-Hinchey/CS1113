// Lab1
// Jacob Hinchey
// 1113
import java.util.Scanner;
public class Lab1{
	public static void main(String [] args){
		Scanner keyboard = new Scanner (System.in);

		int iX;
		int iY;

		System.out.println("Please enter an integer.");
		iX = keyboard.nextInt();

		iY = iX + 35;

		System.out.println("Hello, Student.");
		System.out.println("Hope you are having fun in the lab");
		System.out.println(iX + " + 35 = " + iY);
	} // End of main
}	// End of class
