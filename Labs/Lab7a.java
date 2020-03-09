// Lab 7a
// Jacob Hinchey
// 1113


import java.util.*;

public class Lab7a
{
    public static void main(String args[])
    {
        ArrayList<Double> list = createSquaresList(10);
        printList(list);
        removeElement(list, 4);
        printList(list);
        swapElements(list, 2, 6);
        printList(list);
        double max = getMaxValue(list);
        double ave = getAverage(list);
        System.out.println("Max Value = " + max);
        System.out.println("Average = " + ave);
        int idx1 = linearSearch(list, 4);
        int idx2 = linearSearch(list, 75);
        System.out.println("idx 1 = " + idx1);
        System.out.println("idx 2 = " + idx2);
    }

    public static ArrayList<Double> createSquaresList(int n)
    {
        ArrayList<Double> roots= new ArrayList<>();
        double s = 0.0;
        for (double i = 0.0; i <= n-1; i++)
        {
            s = i*i;
            roots.add(s);
        }
        return roots;
    }

    public static double getMaxValue(ArrayList<Double> list)
    {
        double maxx = list.get(0);
        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i) > maxx)
            {
                maxx = list.get(i);
            }
        }
        return maxx;
    }

    public static double getAverage(ArrayList<Double> list)
    {
          double average = 0.0;
          double sum = 0.0;
          for (int i =0; i < list.size(); i++)
          {
              sum += list.get(i);
          }
          average = sum / list.size();
          return average;
    }

    public static void removeElement(ArrayList<Double> list, int index)
    {
        double hold = 0.0;
        int end = list.size() - 1;
        double last = list.get(end);
        index = (int)hold;
        hold = last;
        last = index;
        list.remove(end);
    }

    public static void swapElements(ArrayList<Double> list, int a, int b)
    {
        int hold = 0;
        a = hold;
        hold = b;
        b = a;

    }

    public static int linearSearch(ArrayList<Double> list, double val)
    {
        int place = 0;
        boolean got = false;
        while (place < list.size() && !got)
        {
            if (list.get(place) == val)
            {
                got = true;
            }
            else
            {
                place++;
            }
        }
        if (got)
        {
            return place;
        }
        else
        {
            return -1;
        }
    }

    public static void printList(ArrayList<Double> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
            if(i < list.size()-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
