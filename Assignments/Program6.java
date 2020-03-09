// Jacob Hinchey
// Program6
// 1113

import java.util.*;
public class Program6
{
    public static boolean activeCalc = true;
    public static HashMap<String,Double> inputVar = new HashMap<String, Double>();
    public static String[] input;
    public static boolean useCalc = false;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Integer postfix calculator with memory by Jacob Hinchey");
        do
        {
            System.out.print("\n> ");
            input = scan.nextLine().split("\\s");
            commandOperator(input);

        }
        while(activeCalc);
    }
    public static void commandOperator(String[] command)
    {
        useCalc = false;
        if(command.length > 1)
        {
            if(command[1].equals("="))
            {
                useCalc = true;
                double temp = calcUsed(Arrays.copyOfRange(command,2,command.length));
                if(temp != -123)
                {
                    inputVar.put(command[0], temp);
                }
                return;
            }
        }
        for (int i = 0; i < command.length; i++)
        {
            switch (command[i])
            //Quit, about, clear, var, handle invalid
            {
                case "quit":
                    activeCalc = false;
                    break;

                case "about":
                    System.out.println("Jacob Hinchey. Enter: quit, about, clear, var.");
                    break;

                case "clear":
                    System.out.println("All variables removed");
                    inputVar.clear();
                    break;

                case "var":
                    System.out.println(inputVar);
                    break;

                case "":
                    System.out.println("Invalid input!");
                    break;

                default:
                    calcUsed(command);
                    return;
            }
        }
    }
    public static double calcUsed(String[] holdArray)
    {
        double result = -123;
        Stack<Double> stackPlace = new Stack <Double>();
        for (int i =0; i < holdArray.length; i++)
        {
            try
            {
                switch (holdArray[i])
                {
                  //+, -. *, /, cos, sin, tan, sqrt, inproper input
                    case "+":
                        double sum = stackPlace.pop() + stackPlace.pop();
                        stackPlace.push(sum);
                        break;

                    case "-":
                        double b = stackPlace.pop();
                        double a = stackPlace.pop();
                        stackPlace.push(a - b);
                        break;

                    case "*":
                        stackPlace.push(stackPlace.pop() * stackPlace.pop());
                        break;

                    case "/":
                        double c = stackPlace.pop();
                        double d = stackPlace.pop();
                        if (c == 0)
                        {
                            System.out.println("Cannot divide by zero.");
                            result = -123;
                            break;
                        }
                        stackPlace.push( (d / c));
                        break;

                    case "cos":
                      double s = stackPlace.pop();
                      stackPlace.push( Math.cos(s));
                      break;

                    case "sin":
                      double v = stackPlace.pop();
                      stackPlace.push( Math.sin(v));
                      break;

                    case "tan":
                      double z = stackPlace.pop();
                      stackPlace.push( Math.cos(z));
                      break;

                    case "sqrt":
                      double o = stackPlace.pop();
                      stackPlace.push( Math.sqrt(o));
                      break;

                    case "":
                        System.out.println("Insert Equation.");
                        break;

                    default:
                        if (inputVar.containsKey(holdArray[i]))
                        {
                            stackPlace.push(inputVar.get(holdArray[i]));
                        }
                        else
                        {
                            try
                            {
                                stackPlace.push(Double.parseDouble(holdArray[i]));
                            }
                            catch (Exception e)
                            {
                                inputVar.put(holdArray[i], 0.0);
                                try
                                {
                                    stackPlace.push(inputVar.get(holdArray[i]));
                                }
                                catch (Exception e1)
                                {
                                    System.out.println("Error: " + e);
                                }

                            }
                        }
                        break;
                }
            }
            catch (Exception e)
            {
                if(!useCalc)
                {
                    System.out.println("Error! Too many operators.");
                }
                else
                {
                    System.out.println("Error! Too many operators. ");
                    return -123;
                }
            }
        }
        if(stackPlace.size() == 0)
        {
            if(useCalc)
            {
                return -123;
            }
            return result;
        }
        else if(stackPlace.size() == 1 )
        {
            result = stackPlace.pop();
            System.out.println(result);
            return result;
        }
        else
        {
            if(useCalc)
            {
                System.out.println("Error! Not enough operators.");
                return -123;
            }
            System.out.println("Error! Not enough operators.");
            return result;
        }
    }
}
