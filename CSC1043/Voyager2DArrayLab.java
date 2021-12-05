/*Code created by Sara Peak to work with and understand how 2D Arrays work.*/

import java.util.*;
import java.text.*;
import java.io.*;

public class Voyager2DArrayLab
{
   public static void main(String[] args) throws IOException
   {
      //Create Scanner
      Scanner scan = new Scanner(System.in);
      
      //Create a decimal format up to 2 decimal places
      DecimalFormat formatAnswers = new DecimalFormat("0.00");
            
      //Ask user to enter in the name of the file
      System.out.print("Please enter the name of the file that you wish to process: ");
      String user = scan.next();
      
      //Ask user how many weeks are to be processed
      System.out.print("How many weeks of data will be processed? ");
      
      //Force user to input an integer
      String useless;
      while (!scan.hasNextInt())
      {   
         useless = scan.next();
         System.out.print("Please enter an integer: ");
      }
      
      //If the weeks inputed is invalid assume the max amount of weeks available
      int weeks = scan.nextInt();
      if (weeks>14)
      {
         System.out.print("Number of weeks is out of bounds. Assuming the entire 13 weeks:");
         weeks = 13;
      }
      
      //Calls upon the voyager1.txt file
      Scanner voyager1 = new Scanner(new File(user));
      double [][] voyager = new double [13][4];
      for (int row = 0; row<13; row++)
      {
         for (int col = 0; col<4; col++)
         {
            voyager[row][col] = voyager1.nextDouble();   //Scans the text file and creates a 2D array
         }
      }
      
      //Ask user to select an option in the menu, if done ask to enter "quit"
      System.out.println();
      System.out.println("Enter number 1-4 to make your choice. Enter quit to end program");
      System.out.println();
      System.out.println("1. Calculate average fuel consumption for the entire series of weeks represented");
      System.out.println("2. Calculate average output for the entire series of weeks represented");
      System.out.println("3. Retrieve the propellent remaining for any 1 week (numbering starts at 0)");
      System.out.println("4. Print the data for any one week");
      
      //Start of the loop
      while (weeks>0)
      {
         System.out.println();
         System.out.print("Which operation would you like to perform? ");     //Asks user for operation to complete
         String input = scan.next();
         switch (input)
         {  
            //If 1
            case "1":
               double total1 = 0;
               for (int row = 0; row<weeks; row++)
               {
                  total1+=voyager[row][0];     //Adds to the total1 from each row and col specified in the loop
               }
               double average1 = total1/weeks; //Averages total1 by weeks
               System.out.println("Average fuel consumption was "+formatAnswers.format(average1));
               break;
               
            //If 2
            case "2":
               double total2 = 0;
               for (int row = 0; row<weeks; row++)
               {
                  total2+=voyager[row][2];   //Adds to total2 from each row and col specified
               }
               double average2 = total2/weeks;  //Averages total2 by weeks
               System.out.println("Average output(watts) consumption was "+formatAnswers.format(average2));
               break;
               
            //If 3
            case "3":
               int week = weeks-1;
               System.out.print("For which week would you like the propellant value? Available weeks are 0 to "+week+": ");
               while (!scan.hasNextInt())  //Loops through until it gets an integer
               {   
                  useless = scan.next();
                  System.out.print("Please enter an integer: ");
               }
               int proValue = scan.nextInt();
               if (proValue>week)         //An if/else statement to decided whether the inputed vaule is valid or not
               {
                  System.out.println("Invalid week entered. Operation aborted");  //Moves on to ask for another operation to perform
               }
               else                       //Continues on with the case by calling to the specified week and column
               {
                  double proRemain = voyager[proValue][1];
                  System.out.println("Propellant remaining "+proRemain);
               }
               break;
               
            //If 4
            case "4":
               System.out.print("For which week would you like the data? ");
               while (!scan.hasNextInt())      //Loops through until it gets an integer
               {   
                  useless = scan.next();
                  System.out.print("Please enter an integer: ");
               }
               int data = scan.nextInt();
               if (data>weeks)                //If the data inputed is invalid it ends the case
               {
                  week = weeks-1;
                  System.out.println("Invalid week entered. Highest week possible is "+week);
               }
               else                           //If the data inputed is valid it continues on to format the fuel, propel, output, and margin
               {
                  System.out.println("Fuel\tPropel\tOutput\tMargin");
                  System.out.println("----\t------\t------\t------");
                  double fuel = voyager[data][0];
                  double propel = voyager[data][1];
                  double output = voyager[data][2];
                  double margin = voyager[data][3];
                  System.out.println(formatAnswers.format(fuel)+"\t "+formatAnswers.format(propel)+"\t"+formatAnswers.format(output)+"\t "+formatAnswers.format(margin));
               }
               break;
               
            //If quit
            case "quit":
               weeks = -1;
               System.out.println("To space and beyond!");
               break;
               
            //If anything else
            default:
               System.out.print("Invalid choice. Please enter 1-4 or quit");
               System.out.println();
         }
      }
   }
}