/*code created by Sara Peak to explore the usefulness of while loops and switch statements*/

import java.util.*;
import java.text.*;
import java.io.*;

public class WhileLoopLab
{
   public static void main(String[] args) throws IOException
   {
      //Ask user to enter a number
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the largest number to put into the sum");
      
      //If user does not enter a whole number, loop back and ask user to "enter a whole number"
      String useless;
      double garbage;
      while (!scan.hasNextInt())
      {
         useless = scan.next();
         System.out.println("Please enter a whole number");
      }
      
      //If user enters an integer, loop to find the summation of the number entered
      int numLargest = scan.nextInt();
      int count = 1;
      int sum = 0;
      while (count<=numLargest)
      {
         sum = sum+count;
         count++;
      }   
      
      //Print results
      System.out.println("The summation of 1 to "+numLargest+" is "+sum);
      
      //Call to TextFile1 and read the contents in the file
      System.out.println("Reading the file...");
      Scanner file1 = new Scanner(new File("numbers.txt"));
      String number;
      double numSum = 0;
      double result = 0;
      int total = 0;
      while (file1.hasNext())
      {
         number = file1.next();
         System.out.println("Adding "+number);
         total++;                    //Keeping a count of the values in the text file
         numSum = Double.parseDouble(number);
         result = result+numSum;     //Print each number and keep a running sum of all the numbers in the text file
      }
      
      //Calculate the average of the numbers and print results to 2 decimal places
      DecimalFormat resultFormat = new DecimalFormat("#.###");
      System.out.println("The total from the file is "+resultFormat.format(result));
      double average = result/total;
      DecimalFormat numberFormat = new DecimalFormat("#.00");
      System.out.println("The average of the "+total+" values is "+numberFormat.format(average));
      
      //Call to TextFile2 and read the contents in the file
      Scanner file2 = new Scanner(new File("items.txt"));
      double cost = 0;
      double result2 = 0;
      while(file2.hasNextLine())
      {
         String item = file2.next();
         int amount = file2.nextInt();
         switch (item)
         {
            case "pens":
               System.out.println("Processing "+amount+" pens at $1.25 each");     //Print out the price and item
               result2 = amount*1.25;
               break;
            case "pencils":
               System.out.println("Processing "+amount+" pencils at $0.75 each");  //Print out the price and item
               result2 = amount*0.75;
               break;
            case "staplers":
               System.out.println("Processing "+amount+" staplers at $3.75 each"); //Print out the price and item
               result2 = amount*3.75;
               break;
            case "notebooks":
               System.out.println("Processing "+amount+" notebooks at $4.50 each");//Print out the price and item
               result2 = amount*4.50;
               break;
            default:
               System.out.println("Processing everything else at $10.00");         //Print out the price and item
               result2 = amount*10;
         }
         cost = cost+result2;
      }
      //Calculate the total price of the items and print the results
      NumberFormat orderFormat = NumberFormat.getCurrencyInstance();
      System.out.println("The price of the total order is "+orderFormat.format(cost));
   }
}