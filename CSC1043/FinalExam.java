import java.util.*;
import java.text.*;
import java.io.*;

public class FinalExam
{
   public static void main(String[] args) throws IOException
   {
      Scanner scan = new Scanner(System.in);
      
      //Task 1
      System.out.print("Please enter ID: ");
      String input = scan.next();
      
      int user = input.length();
      int end = user-1;
      int number = input.indexOf(3);
      String year = input.substring(0, 4);
      String name = input.substring(3+1, end);
      int birthYear = Integer.parseInt(year);
      char initial = input.charAt(end);
      
      System.out.println("This is the report for "+initial+". "+name+" Born: "+birthYear);
      
      int age = 2019-birthYear;
      if (age<=17)
      {
         System.out.println("This client is "+age+" years old and considered to be a youth.");
      }
      else if (age>=18 && age<=64)
      {
         System.out.println("This client is "+age+" years old and considered to be an adult.");
      }
      else if (age>=65)
      {
         System.out.println("This client is "+age+" years old and considered to be a senior.");
      }
      System.out.println();
      
      //Task 2
      System.out.print("What file will you read from? ");
      String textFile = scan.next();
      Scanner read = new Scanner(new File(textFile));
      String [] names = new String [6];
      int [] years = new int [6];
      for (int i = 0; i<6; i++)
      {
         names[i] = read.next();
         years[i] = read.nextInt();
      }
      
      System.out.println("Names and Birth Years");
      System.out.println("---------------------");
      for (int i = 0; i<6; i++)
      {
         System.out.println(names[i]+"\t"+years[i]);
      }
      System.out.println();
      
      //Task 3
      int total = 0;
      for (int i = 0; i<6; i++)
      {
         if (years[i]<birthYear)
         {
            System.out.println(names[i]);
            total++;
         }
      }
      System.out.println("There were "+total+" people potentially older than "+initial+" "+name);
      System.out.println();
      
      //Task 4
         if (names[0].equals(name) || names[1].equals(name) || names[2].equals(name) || names[3].equals(name) || names[4].equals(name) || names[5].equals(name))
         {
            System.out.println(name+" was found in the list");
         }
         else
         {
            System.out.println(name+" was not found in the list");
         }
      System.out.println();
      
      //Task 5
      System.out.println("Continue to enter an index of a name/year entry to change. A negative index will signal that you want to quit");
      System.out.print("Enter an index: ");
      int index = 0;
      while (index<6 && index>=0)
      {
         index = scan.nextInt();
         if (index<6 && index>=0)
         {
            System.out.print("New Name: ");
            String nameNew = scan.next();
            names[index] = nameNew;
            System.out.print("New Year: ");
            int yearNew = scan.nextInt();
            years[index] = yearNew;
            System.out.print("Next index to change: ");
         }
      }
      System.out.print("Printing names to show changes. How many would you like to print? ");
      String useless;
      while (!scan.hasNextInt())
      {   
         useless = scan.next();
         System.out.println("Please enter a whole number.");
      }
      int amount = scan.nextInt();
      System.out.println("Here are the results of the changes:");
      
      if (amount<6 && amount>=0)
      {
         for (int i = 0; i<amount; i++)
         {
            System.out.println(names[i]+"\t"+years[i]);
         }
      }
      else
      {
         for (int i = 0; i<6; i++)
         {
            System.out.println(names[i]+"\t"+years[i]);
         }
      }
   }
}