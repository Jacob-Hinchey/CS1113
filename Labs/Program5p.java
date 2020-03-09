//Program 5
//Jacob Hinchey
//1113
import java.util.*;
import java.io.*;

public class Program5p
{
  public static void main(String args[])
  {
    System.out.println("Patient sorting program by Jacob Hinchey");
    try
    {
      ArrayList<Patient> patients = new ArrayList<>();
      Scanner scan = new Scanner(new File(args[0]));

      while (scan.hasNext())
      {
        String line = scan.nextLine();
        String[] place = line.split(",");

        String last = place[0];
        String first = place[1];
        int age = Integer.parseInt(place[2]);
        int room = Integer.parseInt(place[3]);

        Patient c = new Patient(last, first, age, room);
        patients.add(c);
      }

      Collections.sort(patients, new PatientNameComparator());
      int k=0;
      while(k<patients.size())
      {
        System.out.println(patients.get(k));
        k++;
      }
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("Used to sort by last name, first name, age, or room.");
    }
  }
}
