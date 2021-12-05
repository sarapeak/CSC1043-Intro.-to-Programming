/*code created by Sara Peak to calculate 2 different loans and tell the
user which loan has the lowest monthly payment and calculate and tell the
user the total amount that would be paid during the life of the loans*/

import java.util.*;
import java.text.*;
public class MortgagePayment
{
   public static void main(String[] args)
   {
      //Create a Scanner
      Scanner scan = new Scanner(System.in);
      
      //Ask the user to enter the values of the 2 loans wished to be compared
      System.out.println("Please enter the values requested for the 2 loans you wish to compare.");
      System.out.print("What is the amount of the loan? ");
      double amount = scan.nextDouble();
      System.out.println();
      
      //Ask the user to input the annual interest rate for loan 1 (w/ example)
      System.out.println("First set of terms");
      System.out.print("Annual interest rate (Ex. 3.5%): ");
      String rate1 = scan.next();
      
      //Changing the string of rate1 into a double
      int percent1 = rate1.indexOf("%");
      String rateLo1 = rate1.substring(0, percent1);
      double rateL1 = Double.parseDouble(rateLo1);
      rateL1 = rateL1/100;
      
      //Ask the user to input the number of months
      System.out.print("Number of months: ");
      double month1 = scan.nextDouble();
      System.out.println();
      
      //Ask the user to input the annual interest rate for loan 2 (w/ example)
      System.out.println("Second set of terms");
      System.out.print("Annual interest rate (Ex. 3.5%): ");
      String rate2 = scan.next();
      
      //Changeing the string of rate2 into a double
      int percent2 = rate2.indexOf("%");
      String rateLo2 = rate2.substring(0, percent2);
      double rateL2 = Double.parseDouble(rateLo2);
      rateL2 = rateL2/100;
      
      //Ask the user to input the number of months
      System.out.print("Number of months: ");
      double month2 = scan.nextDouble();
      System.out.println();
      
      //Calculate the monthly payment for loan 1
      double payment1, a1, b1, c1, d1;
      a1 = (amount*rateL1)/12;
      b1 = 1+rateL1/12;
      c1 = Math.pow(b1,-month1);
      d1 = 1-c1;
      payment1 = a1/d1;
      
      NumberFormat payment1Format = NumberFormat.getCurrencyInstance();
      System.out.println("The monthly payment for loan 1 is "+payment1Format.format(payment1));
      
      //Calculate the monthly payment for loan 2
      double payment2, a2, b2, c2, d2;
      a2 = (amount*rateL2)/12;
      b2 = 1+rateL2/12;
      c2 = Math.pow(b2,-month2);
      d2 = 1-c2;
      payment2 = a2/d2;
      
      NumberFormat payment2Format = NumberFormat.getCurrencyInstance();
      System.out.println("The monthly payment for loan 2 is "+payment2Format.format(payment2));
      
      //Find and tell the user the lowest payment of the 2 loans
      double minPay = Math.min(payment1,payment2);
      NumberFormat minPayFormat = NumberFormat.getCurrencyInstance();
      System.out.println("Therefore your minimum payment would be "+minPayFormat.format(minPay));
      
      //Calculate and tell user the total amount to be paid over the life of loan 1
      double payLife1 = payment1*month1;
      NumberFormat payLife1Format = NumberFormat.getCurrencyInstance();
      System.out.println("With the first loan, you would be paying a total of "+payLife1Format.format(payLife1));
      
      //Calculate and tell user the total amount to be paid over the life of loan 2
      double payLife2 = payment2*month2;
      NumberFormat payLife2Format = NumberFormat.getCurrencyInstance();
      System.out.println("With the second loan, you would be paying a total of "+payLife2Format.format(payLife2));
      
   }
}