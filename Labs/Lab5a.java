// Lab 5a
// Jacob Hinchey
// 1113

import java.util.*;

public class Lab5a
{
	public static void main(String args[])
	{
		double[] a = {1, 0, 0};
		double[] b = {0, 1, 1};
		double[] c = {1, 1, 1};
		double[] d = {0, 0, 1};

		double ab = distance (a,b);
		double ac = distance (a,c);
		double ad = distance (a,d);

		System.out.println("ab=" + ab + ", ac=" + ac + ", ad=" + ad);
	}
	public static double distance(double[] x, double[] y)
	{
		return Math.sqrt(
		(x[0]-y[0])*(x[0]-y[0]) +
		(x[1]-y[1])*(x[1]-y[1]) +
		(x[2]-y[2])*(x[2]-y[2]) );

	}
}
