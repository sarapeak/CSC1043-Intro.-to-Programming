/*Code created by Sara Peak to understand how arrays work and how useful they are*/

import java.util.*;
import java.text.*;
import java.io.*;

public class ArrayLab
{
   public static void main(String[] args) throws IOException
   {
      //Create a Scanner
      Scanner scan = new Scanner(System.in);
      
      //Ask user to enter 7 numbers
      System.out.println("Please enter 7 numbers");
      
      //Create a loop and array asking the user to enter in the 7 values
      double [] values = new double [8];
      for (int i=1; i<=7; i++)
      {
         System.out.print("Value "+i+": ");
         values[i] = scan.nextDouble();
      }
      System.out.println();
      
      //Ask user to enter a number that separates the larger numbers from the smaller numbers
      System.out.println("Please enter the number that divides large from small numbers");
      double separater = scan.nextDouble();
      int total1 = 0;
      int total2 = 0;
      for (int i=1; i<=7; i++)
      {
         if (values[i]<separater)
            total1++;
         else
            total2++;
      }
      System.out.println();
      
      //Tell the user how many small numbers were entered and how many big numbers were entered
      System.out.println("You entered "+total1+" small numbers and "+total2+" large numbers");
      System.out.println();
      
      //Create a text file and read the values in the file
      System.out.println("Reading usernames from file...");
      Scanner users = new Scanner(new File("usernames.txt"));
      
      //Ask user to enter passwords for each user
      System.out.println("Please enter the password for the user indicated");
      int num = users.nextInt();
      String [] user = new String [num];
      for (int i = 0; i<num; i++)
      {
         user [i] = users.next();   //Reads the file and finds the usernames
      }
      
      String [] password = new String [num];
      for (int h = 0; h<num; h++)
      {
         //Have the user enter in the passwords to the correct user
         System.out.print(user[h]+": ");
         password [h] = scan.next();
      }
      System.out.println();
      
      //Create a little chart showing the users and passwords
      System.out.println("Users and Passwords");
      System.out.println("-------------------");
      
      for (int j = 0; j<num; j++)
      {
         //Using an if/else if statment to line up the passwords
         if (user[j].length()>=9)
            System.out.println(user[j]+"\t"+password[j]);
         else if (user[j].length()<=5)
            System.out.println(user[j]+"\t\t\t"+password[j]);
         else
            System.out.println(user[j]+"\t\t"+password[j]);
      }
      
      //Find the third user and password and tell the user
      String password3 = password[2];
      String username3 = password3.substring(0,5);
      System.out.println();
      System.out.println("The third user/password pair is now "+user[2]+"    "+username3);
   }
}