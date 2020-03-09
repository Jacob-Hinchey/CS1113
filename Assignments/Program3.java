//============================================
// Program three : Credit Cards
// Semester : Fall 2017
// Author : Jacob Hinchey
// CRN : 60968
//============================================
import java.util.*;
public class Program3
{
  public static Scanner input = new Scanner (System.in);
  public static void main(String [] args)
    {
      System.out.println("Credit card program by Jacob Hinchey");
      double horriblePenalty = 10;
      double niceGuyPenalty = 20;
      double minimumPayment, rate, total, percentToPrinciple, percentToFees, balance;
      String time;
      System.out.print("Customer name: ");
      String name = input.nextLine();
      System.out.print("Customer member level: ");
      String level = input.nextLine();
      if (level.equalsIgnoreCase("DESPICABLE"))
        {
          System.out.print("Curerent Balance: ");
          balance = input.nextDouble();
          System.out.print("Was the payment made late: ");
          input.nextLine();
          time = input.nextLine();
          {
            if (time.equalsIgnoreCase("YES"))
            {
              minimumPayment = balance * .04;
              rate = balance * .018;
              total = rate + minimumPayment;
              percentToPrinciple = 100 * (minimumPayment / total);
              percentToFees = 100 - percentToPrinciple;
              System.out.println("Bill for " +level+ " customer " +name);
              System.out.printf("Card balance: $ %.2f%n",balance);
              System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
              System.out.printf("Interest for late payment (1.8 percent of principle): $ %.2f%n",rate);
              System.out.printf("Minimum total payment (payment, interest, and fees): $ %.2f%n",total);
              System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
              System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
            }
            else if (time.equalsIgnoreCase("NO"))
            {
              minimumPayment = balance * .04;
              rate = balance * .008;
              total = minimumPayment + rate;
              percentToPrinciple = 100 * (minimumPayment / total);
              percentToFees = 100 - percentToPrinciple;
              System.out.println("Bill for " +level+ " customer " +name);
              System.out.printf("Card balance: $ %.2f%n",balance);
              System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
              System.out.printf("Interest for on time payment (1.8 percent of principle): $ %.2f%n",rate);
              System.out.printf("Minimum total payment (payment, interest, and fees): $ %.2f%n",total);
              System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
              System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
            }
          }
        }
      else if (level.equalsIgnoreCase("HORRIBLE"))
      {
        System.out.print("Curerent Balance: ");
        balance = input.nextDouble();
        System.out.print("Was the payment made late: ");
        input.nextLine();
        time = input.nextLine();
        if (time.equalsIgnoreCase("YES"))
        {
          minimumPayment = balance * .04;
          rate = balance * .031;
          total = rate + minimumPayment + horriblePenalty;
          percentToPrinciple = 100 * (minimumPayment / total);
          percentToFees = 100 - percentToPrinciple;
          System.out.println("Bill for " +level+ " customer " +name);
          System.out.printf("Card balance: $ %.2f%n",balance);
          System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
          System.out.printf("Interest for late payment (1.8 percent of principle): $ %.2f%n",rate);
          System.out.printf("Late fee: $ %.2f%n",horriblePenalty);
          System.out.printf("Minimum total payment (payment, interest, and fees): $%.2f%n ",total);
          System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
          System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
        }
        else if (time.equalsIgnoreCase("NO"))
        {
          minimumPayment = balance * .04;
          rate = balance * .02;
          total = minimumPayment + rate;
          percentToPrinciple = 100 * (minimumPayment / total);
          percentToFees = 100 - percentToPrinciple;
          System.out.println("Bill for " +level+ " customer " +name);
          System.out.printf("Card balance: $ %.2f%n",balance);
          System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
          System.out.printf("Interest for on time payment (1.8 percent of principle): $ %.2f%n",rate);
          System.out.printf("Minimum total payment (payment, interest, and fees): $ %.2f%n",total);
          System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
          System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
        }
      }
      else if (level.equalsIgnoreCase("NICEGUY"))
      {
        System.out.print("Curerent Balance: ");
        balance = input.nextDouble();
        System.out.print("Was the payment made late: ");
        input.nextLine();
        time = input.nextLine();
        if (time.equalsIgnoreCase("YES"))
        {
          minimumPayment = balance * .04;
          rate = balance * .043;
          total = rate + minimumPayment + niceGuyPenalty;
          percentToPrinciple = 100 * (minimumPayment / total);
          percentToFees = 100 - percentToPrinciple;
          System.out.println("Bill for " +level+ " customer " +name);
          System.out.printf("Card balance: $ %.2f%n",balance);
          System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
          System.out.printf("Interest for late payment (1.8 percent of principle): $ %.2f%n",rate);
          System.out.printf("Late fee: $ %.2f%n",niceGuyPenalty);
          System.out.printf("Minimum total payment (payment, interest, and fees): $ %.2f%n",total);
          System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
          System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
        }
        else if (time.equalsIgnoreCase("NO"))
        {
          minimumPayment = balance * .04;
          rate = balance * .031;
          total = minimumPayment + rate;
          percentToPrinciple = 100 * (minimumPayment / total);
          percentToFees = 100 - percentToPrinciple;
          System.out.println("Bill for " +level+ " customer " +name);
          System.out.printf("Card balance: $ %.2f%n",balance);
          System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
          System.out.printf("Interest for on time payment (1.8 percent of principle): $ %.2f%n",rate);
          System.out.printf("Minimum total payment (payment, interest, and fees): $ %.2f%n",total);
          System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
          System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
        }
      }
      else
      {
        System.out.println("Invalid Level. Must be one of Despicable, Horrible, Niceguy.");
        System.out.print("Customer member level: ");
        level = input.nextLine();
        if (level.equalsIgnoreCase("DESPICABLE"))
          {
            System.out.print("Curerent Balance: ");
            balance = input.nextDouble();
            System.out.print("Was the payment made late: ");
            input.nextLine();
            time = input.nextLine();
            {
              if (time.equalsIgnoreCase("YES"))
              {
                minimumPayment = balance * .04;
                rate = balance * .018;
                total = rate + minimumPayment;
                percentToPrinciple = 100 * (minimumPayment / total);
                percentToFees = 100 - percentToPrinciple;
                System.out.println("Bill for " +level+ " customer " +name);
                System.out.printf("Card balance: $ %.2f%n",balance);
                System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
                System.out.printf("Interest for late payment (1.8 percent of principle): $ %.2f%n",rate);
                System.out.printf("Minimum total payment (payment, interest, and fees): $ %.2f%n",total);
                System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
                System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
              }
              else if (time.equalsIgnoreCase("NO"))
              {
                minimumPayment = balance * .04;
                rate = balance * .008;
                total = minimumPayment + rate;
                percentToPrinciple = 100 * (minimumPayment / total);
                percentToFees = 100 - percentToPrinciple;
                System.out.println("Bill for " +level+ " customer " +name);
                System.out.printf("Card balance: $ %.2f%n",balance);
                System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
                System.out.printf("Interest for on time payment (1.8 percent of principle): $ %.2f%n",rate);
                System.out.printf("Minimum total payment (payment, interest, and fees): $ %.2f%n",total);
                System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
                System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
              }
            }
          }
        else if (level.equalsIgnoreCase("HORRIBLE"))
        {
          System.out.print("Curerent Balance: ");
          balance = input.nextDouble();
          System.out.print("Was the payment made late: ");
          input.nextLine();
          time = input.nextLine();
          if (time.equalsIgnoreCase("YES"))
          {
            minimumPayment = balance * .04;
            rate = balance * .031;
            total = rate + minimumPayment + horriblePenalty;
            percentToPrinciple = 100 * (minimumPayment / total);
            percentToFees = 100 - percentToPrinciple;
            System.out.println("Bill for " +level+ " customer " +name);
            System.out.printf("Card balance: $ %.2f%n",balance);
            System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
            System.out.printf("Interest for late payment (1.8 percent of principle): $ %.2f%n",rate);
            System.out.printf("Late fee: $ %.2f%n",horriblePenalty);
            System.out.printf("Minimum total payment (payment, interest, and fees): $%.2f%n ",total);
            System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
            System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
          }
          else if (time.equalsIgnoreCase("NO"))
          {
            minimumPayment = balance * .04;
            rate = balance * .02;
            total = minimumPayment + rate;
            percentToPrinciple = 100 * (minimumPayment / total);
            percentToFees = 100 - percentToPrinciple;
            System.out.println("Bill for " +level+ " customer " +name);
            System.out.printf("Card balance: $ %.2f%n",balance);
            System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
            System.out.printf("Interest for on time payment (1.8 percent of principle): $ %.2f%n",rate);
            System.out.printf("Minimum total payment (payment, interest, and fees): $ %.2f%n",total);
            System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
            System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
          }
        }
        else if (level.equalsIgnoreCase("NICEGUY"))
        {
          System.out.print("Curerent Balance: ");
          balance = input.nextDouble();
          System.out.print("Was the payment made late: ");
          input.nextLine();
          time = input.nextLine();
          if (time.equalsIgnoreCase("YES"))
          {
            minimumPayment = balance * .04;
            rate = balance * .043;
            total = rate + minimumPayment + niceGuyPenalty;
            percentToPrinciple = 100 * (minimumPayment / total);
            percentToFees = 100 - percentToPrinciple;
            System.out.println("Bill for " +level+ " customer " +name);
            System.out.printf("Card balance: $ %.2f%n",balance);
            System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
            System.out.printf("Interest for late payment (1.8 percent of principle): $ %.2f%n",rate);
            System.out.printf("Late fee: $ %.2f%n",niceGuyPenalty);
            System.out.printf("Minimum total payment (payment, interest, and fees): $ %.2f%n",total);
            System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
            System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
          }
          else if (time.equalsIgnoreCase("NO"))
          {
            minimumPayment = balance * .04;
            rate = balance * .031;
            total = minimumPayment + rate;
            percentToPrinciple = 100 * (minimumPayment / total);
            percentToFees = 100 - percentToPrinciple;
            System.out.println("Bill for " +level+ " customer " +name);
            System.out.printf("Card balance: $ %.2f%n",balance);
            System.out.printf("Minimum payment to principle (4.0 percent of principle): $ %.2f%n",minimumPayment);
            System.out.printf("Interest for on time payment (1.8 percent of principle): $ %.2f%n",rate);
            System.out.printf("Minimum total payment (payment, interest, and fees): $ %.2f%n",total);
            System.out.printf("Percent to principle: %2.1f%%%n",percentToPrinciple);
            System.out.printf("Percent to interest and fees: %2.1f%%%n",percentToFees);
          }
        }
      }
      }

}
