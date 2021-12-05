/*code created by Sara Peak to make the user input a nucleotide sequence and then have the
computer change the sequence to uppercase, identify the number of nucleotides in the sequence,
identify when each letter first occurs, have the user enter the number of A's, G's, C's, and T's,
and finally have the computer calculate percentages at which each letter shows up.*/

import java.util.*;
public class DNAStats
{
   public static void main(String[] args)
   {
    //Declare object that allows us to get info from user (Scanner)
    Scanner scan = new Scanner(System.in);
    
    //Use String to ask the user to input information
    System.out.println("Please enter the DNA strand you wish to analyze:");
    
    //Read sequence and change to uppercase
    String sequence = scan.next();
    String upperName = sequence.toUpperCase();
    System.out.println("The sequence in all uppercase is: "+upperName);
    
    //Identify the number of nucleotides in the sequence
    int nucleoLength = upperName.length();
    System.out.println("The number of nucleotides is "+nucleoLength);
    
    //Identify the first occurence of each nucleotide
    int indexA = upperName.indexOf("A");
    System.out.println("The first A is at index "+indexA);
    int indexT = upperName.indexOf("T");
    System.out.println("The first T is at index "+indexT);
    int indexC = upperName.indexOf("C");
    System.out.println("The first C is at index "+indexC);
    int indexG = upperName.indexOf("G");
    System.out.println("The first G is at index "+indexG);
    
    //Use String and ask user input the number of A's in the sequence
    System.out.println("Please enter the number of A's:");
    double letterA = scan.nextDouble();
    
    //Ask user to input the number of T's
    System.out.println("Please enter the number of T's:");
    double letterT = scan.nextDouble();
    
    //Ask user to input the number of C's
    System.out.println("Please enter the number of C's:");
    double letterC = scan.nextDouble();
    
    //Ask user to input the number of G's
    System.out.println("Please enter the number of G's:");
    double letterG = scan.nextDouble();
    
    //Calculate the percent of inputed information
    double percentA, percentT, percentC, percentG;
    percentA = (letterA/nucleoLength)*100;
    percentT = (letterT/nucleoLength)*100;
    percentC = (letterC/nucleoLength)*100;
    percentG = (letterG/nucleoLength)*100;
    
    //Print results
    System.out.println("Base   % Representation");
    System.out.println("----   ----------------");
    System.out.println("A:  "+percentA+"%");
    System.out.println("T:  "+percentT+"%");
    System.out.println("C:  "+percentC+"%");
    System.out.println("G:  "+percentG+"%");
    
   }
}