
import java.util.*;
import java.text.*;
public class ProgrammingQuiz
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Please enter a word: ");
      String word = scan.next();
      String upperName = word.toUpperCase();
      
      System.out.print("Now a number: ");
      double num1 = scan.nextDouble();
      
      System.out.print("And another number: ");
      double num2 = scan.nextDouble();
      
      System.out.println("The word is "+upperName+" and the numbers are "+num1+" and "+num2);
      
      double min = Math.min(num1,num2);
      System.out.println("The minimum value between the 2 numbers is "+min);
      
      Random numRan = new Random();
      int numRan1 = numRan.nextInt(7);
      int numRan2 = numRan.nextInt(7);
      System.out.println("The 2 random numbers are "+numRan1+" and "+numRan2);
      
      double num7 = 7;
      double result = numRan2/num7;
      System.out.println("After type-casting and dividing the result is "+result);
      
      System.out.print("Please enter 2 numbers separated by & like this: 3.5&45 ");
      String numbers = scan.next();
      int squiggly = numbers.indexOf("&");
      String num1st = numbers.substring(0, squiggly);
      String num2nd = numbers.substring(squiggly+1);
      double number1 = Double.parseDouble(num1st);
      double number2 = Double.parseDouble(num2nd);
      
      DecimalFormat numberFormat = new DecimalFormat("0.0");
      System.out.println("Formatted, the 2 numbers are "+numberFormat.format(number1)+" and "+numberFormat.format(number2));
   }
}