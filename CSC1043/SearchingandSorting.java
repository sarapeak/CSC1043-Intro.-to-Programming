/*Code created by Sara Peak to search and sort a file of DNA nucleotides*/

import java.util.*;
import java.io.*;
import java.text.*;

public class SearchingandSorting
{
   public static void main(String[] args) throws IOException
   {
      //Create a Scanner
      Scanner scan = new Scanner(System.in);
      
      //Calls upon the DNASeq.txt file
      Scanner seqDNA = new Scanner(new File("seqDNA.txt"));
      int num = seqDNA.nextInt();
      String [] DNA = new String [num];
      for (int i = 0; i<num; i++)
      {
         DNA [i] = seqDNA.next();   //Reads the file and finds the sequences
      }
      
      //Create a menu in which the user is able to interact with by entering a number corresponding to the menu options
      System.out.println("Enter the number (1-4) of the desired task. Enter any other character to quit");
      System.out.println("1. Print Sequences in alphabetical order");
      System.out.println("2. Look for a sequence in the list");
      System.out.println("3. Print all sequences that are at least a certain length");
      System.out.println("4. Change the sequence at a particular index");
      
      //Identify the user's input
      String input = scan.next();
         
      //Keeps asking which task to perform
      while (input.equals("1")||input.equals("2")||input.equals("3")||input.equals("4"))
      {
         switch(input)
         {
            //If 1
            case "1":
               Sorter.selectionSort(DNA);
               for (int i = 0; i<num; i++)
               {
                  System.out.println(DNA[i]); //Prints out the sequences in alphabetical order
               }
               break;
            //If 2
            case "2":
               System.out.println("What sequence are you looking for?");
               String sequence = scan.next();
               int total = 0;
               int total2 = 0;
               for (int i = 0; i<num; i++)  //Loops until finished
               {
                  if (DNA[i].equals(sequence))   //If the index is equal to the user input it will add 1 to total
                     total++;
                  else                           //If the index does not equal to the user input it will add one to total2
                     total2++;
               }
               System.out.println(sequence+" was found "+total+" times in the file");
               break;
            //If 3
            case "3":
               System.out.print("Enter the length you would like to check for: ");
               String useless;
               while (!scan.hasNextInt())     //A while loop to ask the user for a whole number until it gets a while number
               {
                  useless = scan.next();
                  System.out.println("Please enter a whole number");
               }
               int section = scan.nextInt();  //Remembers what the whole number entered
               System.out.println("Here are the sequences at least "+section+" nucleotides in length");
               for (int i = 0; i<num; i++)
               {
                  if (DNA[i].length()>=section)         //If the index of the DNA is greater than or equal to the user input then it prints the nucleotide out
                  {
                     System.out.println(DNA[i]);
                  }
               }
               break;
            //If 4
            case "4":
               System.out.print("What is the index of the entry you would like to change? ");
               String nothing;
               while (!scan.hasNextInt()) //While loop to ask for a whole number
               {
                  nothing = scan.next();
                  System.out.println("Please enter a whole number");
               }
               int index = scan.nextInt();
               if (index>=num)     //If the index is greater than num it puts the index at 0
               {
                  System.out.println("The index indicated is not valid, putting new sequence at location 0");
               }
               else               //If the index is within the range of num it continues on with the new index
               {
                  System.out.println("Change will be made at index "+index);
               }
               System.out.println("What would you like to change it to?");
               String nucleotide = scan.next();     //Remembers what the user wants the new nucleotide to be
               if (index>=num)
               {
                  DNA[0] = nucleotide;              //Makes index 0 the indicated nucleotide inputed by user
               }
               else
               {
                  DNA[index] = nucleotide;          //Makes index the index indicated by user and the nucleotide inputed by the user
               }
         }
         System.out.print("Next task: ");     //Asks user for new task to complete
         input = scan.next();
      }
      //If user inputs anything else
      System.out.println("Thank you for using the DNA information system");      
   }
}