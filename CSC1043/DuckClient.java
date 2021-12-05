import java.util.*;
import java.text.*;
import java.io.*;

public class DuckClient
{
   public static void main(String[] args) throws IOException
   {
      Duck ducky = new Duck(0,5,5);
      Duck coolDuck = new Duck(10,10,10);
      
      System.out.println(ducky.getWeight());
      System.out.println(coolDuck.getWeight());
      
      ducky = coolDuck;
      
      System.out.println(ducky.getWeight());
      System.out.println(coolDuck.getWeight());
      
      ducky.setWeight(5);
      
      System.out.println(ducky.getWeight());
      System.out.println(coolDuck.getWeight());
   }
}