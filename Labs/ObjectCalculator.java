
// Lab 10
// Jacob Hinchey
// 1113

import java.util.*;

public class ObjectCalculator
{
	public static void main(String args[])
	{
		ArrayList<GeometricObject> objects = new ArrayList<GeometricObject>();

		// Create a scananner to read input from the keyboard
		Scanner scan = new Scanner(System.in);

		// Prompt the user for a radius, get the radius from
		// the keyboard, and add the circle to the list of objects.
		System.out.println("Enter circle's radius:");
		double radius = scan.nextDouble();
		GeometricObject circle=new Circle(radius);
		objects.add(circle);

		// Prompt the user for a side length for an equilateral triangle.
		// Create an equilateral triangle with that side length and
		// add it to the list of objects.
		System.out.println("Enter triangle's side:");
		double side = scan.nextDouble();
		GeometricObject equiTriangle = new EquilateralTriangle(side);
		objects.add(equiTriangle);

		// Prompt the user for the width and height of a rectangle.
		// Create a rectangle with that width and height and add it
		// to the list of objects.
		System.out.println("Enter rectangle's width");
		double width = scan.nextDouble();
		System.out.println("Enter rectangle's height");
		double height = scan.nextDouble();

		GeometricObject rectangle=new Rectangle(width,height);
		objects.add(rectangle);

		// Write a for loop that will print out all of the objects
		// in the list, along with their attributes (radius for circle,
		// width and height for rectangle, and side length for
		// equilateral triangle).
		for(int i = 0; i<objects.size(); i++)
		{
			System.out.println(objects.get(i));
		}
		// Write code that will calculate and print the total perimeter
		// and total area of all the objects in the list.
		double totalArea = 0;
		double totalPerimeter = 0;
		for (int i = 0; i < objects.size(); i++)
		{
			totalArea += objects.get(i).getArea();
			totalPerimeter += objects.get(i).getPerimeter();
		}
		System.out.println("Total Area =" + totalArea);
		System.out.println("Total Perimeter ="+ totalPerimeter);
	}
}
