//============================================
// Program two : The Drake Equation
// Semester : Fall 2017
// Author : Jacob Hinchey
// CRN : 60968
//============================================
import java.util.Scanner;
public class Program2
{
  public static Scanner input = new Scanner (System.in);
  public static void main(String [] args)
    {
      System.out.println("Program 2 (Drake Equation) by Jacob Hinchey");
      System.out.println("R: Average rate of Milky Way star Formation in stars/year:");
      double r = input.nextDouble();
      System.out.println("E: Average number of planets of star:");
      double e = input.nextDouble();
      System.out.println("L: Fraction of planets that develop life:");
      double l = input.nextDouble();
      System.out.println("I: Fraction of like bearing planets where civilizations develop:");
      double i = input.nextDouble();
      System.out.println("C: fraction of civilizations that have detectable communications:");
      double c = input.nextDouble();
      System.out.println("S: Length of time (in years) over which civilizations release signals:");
      double s = input.nextDouble();
      double n = (r * e * l * i * c * s);
      equation(r, e, l, i, c, s, n);
    }

  public static void equation(double r, double e, double l, double i, double c, double s, double n)

  {
    System.out.println("N = R * E * L * I * C * S "+r+"*"+e+"*"+l+"*"+i+"*"+c+"*"+s);
    System.out.println("= "+n+" detectable civilizations in the Milky Way Galaxy");
  }
}
