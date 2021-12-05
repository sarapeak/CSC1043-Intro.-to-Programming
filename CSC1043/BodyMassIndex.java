/*code created by Sara Peak to calculate BMI from a user's input
and from a random client created by the computer.*/

import java.util.*;
import java.text.*;
public class BodyMassIndex
{
   public static void main(String[] args)
   {
      //Create Scanner
      Scanner scan = new Scanner(System.in);
      
      //Ask user to enter the height of the patient
      System.out.print("Please enter the height of the patient (Ex: 5'6\"): ");
      String height = scan.next();
      
      //Make the string into a int
      int apostrophe = height.indexOf("'");
      int quotation = height.indexOf("\"");
      String feet = height.substring(0, apostrophe);
      String inch = height.substring(apostrophe+1, quotation);
      int feetKH = Integer.parseInt(feet);
      int inchKH = Integer.parseInt(inch);
      
      //Calculate the total feet
      feetKH = feetKH*12;
      double knownH = feetKH+inchKH;
      
      //Ask user to enter the weight
      System.out.println("What is the weight of the individual?");
      int knownW = scan.nextInt();
      
      //Calculate patient's BMI
      double knownBMI = (knownW/(knownH*knownH))*703;
      DecimalFormat formatBMI = new DecimalFormat("0.####");
      System.out.println("The patient's BMI is "+formatBMI.format(knownBMI));
      
      //Create a random patient's height
      Random heightFT = new Random();
      int feetRH = heightFT.nextInt(4)+3;
      
      Random heightIN = new Random();
      int inchRH = heightIN.nextInt(11)+1;
      System.out.println("Your random client is "+feetRH+" feet and "+inchRH+" inches");
      
      //Create a random patient's weight
      Random weight = new Random();
      double weightR = weight.nextInt(299)+100;
      System.out.println("Your random client weighs "+weightR);
      
      //Calculate the random patient's BMI
      feetRH = feetRH*12;
      double heightR = feetRH+inchRH;
      double randomBMI = (weightR/(heightR*heightR))*703;
      System.out.println("The random client's BMI is "+formatBMI.format(randomBMI));
   }
}