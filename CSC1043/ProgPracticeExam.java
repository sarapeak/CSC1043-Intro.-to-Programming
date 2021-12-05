import java.util.*;
import java.text.*;
import java.io.*;

public class ProgPracticeExam
{
   public static void main(String[] args) throws IOException
   {
      Scanner scan = new Scanner(System.in);
      
      //Task 1
      System.out.println("Please enter your file name and number of entries to process separated by a comma");
      String input = scan.next();
      
      int comma = input.indexOf(",");
      String textFile = input.substring(0, comma);
      String number = input.substring(comma+1);
      int entries = Integer.parseInt(number);
      
      System.out.println("You want to process "+entries+" items from "+textFile);
      
      if (entries>=8)
      {
         System.out.println("Since your number is out of range, we will be processing all 7 values");
         entries = 7;
      }
      
      //Task 2
      Scanner read = new Scanner(new File(textFile));
      String [] animals = new String [7];
      for (int i = 0; i<animals.length; i++)
      {
         animals[i] = read.next();
      }
      
      System.out.println("The first element is "+animals[0]+" and the last is "+animals[entries-1]);
      
      for (int i = entries-1; i>=0; i--)
      {
         System.out.print(animals[i]+" ");
      }
      
      //Task 3
      System.out.println();
      System.out.println("We will compare 2 elements for you. What are the indexes of the 2 elements?");
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      if (animals[num1].equals(animals[num2]))
      {
         System.out.println("These 2 elements are the same");
      }
      else
      {
         System.out.println("These 2 elements are not the same");
      }
      
      //Task 4
      int [] characters = new int [7];
      for (int i = 0; i<characters.length; i++)
      {
         characters [i] = animals[i].length();
      }
      
      //Task 4 & 5
      double total = 0;
      for (int i = 0; i<entries; i++)
      {
         System.out.println(animals[i]+" "+characters[i]);
         total += characters[i];
      }
      
      DecimalFormat formatAverage = new DecimalFormat("0.00");
      double average = total/entries;
      System.out.println("The average is "+formatAverage.format(average));
      
      //Task 6
      System.out.println("The following animal names are greater than average in length");
      for (int i = 0; i<entries; i++)
      {
         if (animals[i].length()>average)
            System.out.println(animals[i]);
      }
      
      //Task 7
      int index = 0;
      while (index<7 && index>=0)
      {
         System.out.println("Enter the index of the array location you would like to change");
         index = scan.nextInt();
         if (index<7 && index>=0)
         {
            System.out.print("What animal would you like to change it to? ");
            String animalNew = scan.next();
            animals[index] = animalNew;
         }
      }
      
      System.out.println("Here are your new arrays");
      for (int i = 0; i<entries; i++)
      {
         characters [i] = animals[i].length();
         System.out.println(animals[i]+" "+characters[i]);
      }
   }
}