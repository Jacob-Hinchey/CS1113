//============================================
// Program one : Mini Madlibs
// Semester : Fall 2017
// Author : Jacob Hinchey
// CRN : 60968
//============================================
import java.util.Scanner;
public class Program1
{
  public static Scanner input = new Scanner (System.in);
  public static void main(String [] args)
    {
      System.out.println("> java Program1");
      System.out.println("Program 1 by Jacob Hinchey");
      System.out.println("Enter a sport:");//prints the statement
      String sport = input.nextLine();//asks for a sport
      System.out.println("Enter a time of day:");
      String time = input.nextLine();//asks for a time of the day
      System.out.println("Enter a type of food:");
      String food = input.nextLine();//asks for a tyoe of food
      story(sport,time,food);
    }

  public static void story(String sport,String time,String food)

  {
    System.out.println("Your story is:");
    System.out.println("The best time to play "+sport+" is during the "+time+", or after eating ");
    System.out.println(""+food+" because it will keep you from getting tired.");//puts strings into the statement
  }
}
