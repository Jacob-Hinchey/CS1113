//Program 5
//Jacob Hinchey
//1113
import java.util.*;
import java.io.*;

class PersonNameComparator implements Comparator<Patient>
{
   public int compare(Patient p1, Patient p2)
   {
	     String name1 = p1.last;
	     String name2 = p2.last;
	     return name1.compareTo(name2);
   }
}
public class Patient
{
  public String last;
  public String first;
  public int age;
  public int room;

  public Patient(String l, String f, int a, int r)
  {
    last = l;
    first = f;
    age = a;
    room = r;
  }
  public String toString()
  {
    String s = String.format("%-15s%-15s%-7d%-7d", last, first, age, room);
    return s;
  }
}
