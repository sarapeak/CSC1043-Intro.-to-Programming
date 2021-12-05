/*code created by Sara Peak to convert inches into feet and inches and centimeters into meters*/

public class MetricReportLab
{
   public static void main(String[] args)
   {
      //Declare variables
      int inches1, feet, count;
      double inches2, fractionFt, centimeters, meters;
      
      //Defining int variables
      inches1 = 72;
      feet = 12;
      count = inches1;
      
      //Define double variables
      centimeters = 2.54;
      meters = 100;
      inches2 = inches1;
      
      //Calculate inches into feet and inches
      fractionFt = inches2/feet;
      feet = inches1/feet;
      inches1 = inches1%feet;
      
      //Increase inches1 to 1
      count++;
      
      //Calculate centimeters into meters
      centimeters = centimeters*inches2;
      meters = centimeters/meters;
      
      //Print the results
      System.out.println("Using "+inches2+" inches.");
      System.out.println("The fractional value for feet = "+fractionFt);
      System.out.println("Feet = "+feet+" Inches = "+inches1);
      System.out.println("In centimeters, that would be: "+centimeters);
      System.out.println("Or "+meters+" in meters.");
      System.out.println("Total inches increased by 1 is: "+count);
   }
}