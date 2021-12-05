import java.util.*;
import java.text.*;

public class Midterm
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please enter 3 numbers");
      double num1 = scan.nextDouble();
      double num2 = scan.nextDouble();
      double num3 = scan.nextDouble();
      double result;
      result = (num1+num2+num3)/3;
      DecimalFormat formatAverage = new DecimalFormat("#.000");
      System.out.println("This avaerage is "+formatAverage.format(result));
      
      System.out.println("Please enter 2 words");
      String word1 = scan.next();
      String word2 = scan.next();
      char letter1 = word1.charAt(0);
      
      
      System.out.println("The first character of the first word is "+letter1);
      System.out.println("The last character of the second word is ");
      
      int w1 = word1.length();
      int w2 = word2.length();
      
      if (w1==w2)
         System.out.println("Two words have the same number of characters");
      else if (w1>w2)
         System.out.println("First word is longer");
      else
         System.out.println("Second word is longer");
         
      /*if (word.equalsto(word2))
         System.out.println("They are the same word");
      else
         System.out.println("They are not the same word");*/
         
      System.out.println("Please enter a 3 digit number");
      String digitNum = scan.next();
      
      char middleNum = digitNum.charAt(1);
      System.out.println("The middle digit is "+middleNum);
      
      middleNum
      if (middleNum==2)
         System.out.println("The digit is even");
         else if (middleNum==4)
            System.out.println("The digit is even");
         else if (middleNum==6)
            System.out.println("The digit is even");
         else if (middleNum==8)
            System.out.println("The digit is even");
      else
         System.out.println("The digit is odd");
      
   }
}