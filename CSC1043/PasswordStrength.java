/*Code created by Sara Peak to determine a password's strength*/

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.*;

public class PasswordStrength extends Application
{
   @Override
   public void start(Stage stage)
   {
      //set up the password checker first
      //Create Scanner
      Scanner scan = new Scanner(System.in);
      
      //Group into weak, strong, and very strong statements
      //Ask user to input their password
      System.out.println("Welcome to the password checker");
      System.out.println("Enter your password");
      String password = scan.next();
      System.out.println("Thank you...calculating strength");
      
      int strongPass;
      strongPass = 0;
      
      //Determine points awarded for Uppercase in the beginning
      char c = password.charAt(0);
      
      if (Character.isUpperCase(c))
         strongPass = strongPass+1;
      else
         strongPass = strongPass+0;
         
      //Determine points awarded for digits
      int passwordNum0 = password.indexOf('0');
      int passwordNum1 = password.indexOf('1');
      int passwordNum2 = password.indexOf('2');
      int passwordNum3 = password.indexOf('3');
      int passwordNum4 = password.indexOf('4');
      int passwordNum5 = password.indexOf('5');
      int passwordNum6 = password.indexOf('6');
      int passwordNum7 = password.indexOf('7');
      int passwordNum8 = password.indexOf('8');
      int passwordNum9 = password.indexOf('9');
      if (passwordNum0 > -1||passwordNum1 > -1||passwordNum2 > -1||passwordNum3 > -1||passwordNum4 > -1||passwordNum5 > -1||passwordNum6 > -1||passwordNum7 > -1||passwordNum8 > -1||passwordNum9 > -1)
         strongPass = strongPass+1;
      else
         strongPass = strongPass+0;
         
      //Determine points awarded for characters used
      int percent = password.indexOf('%');
      if (percent > -1)
         strongPass = strongPass+1;
      else
         strongPass = strongPass+0;
      
      int ampersand = password.indexOf('&');
      if (ampersand > -1)
         strongPass = strongPass+1;
      else
         strongPass = strongPass+0;
         
      int exclamation = password.indexOf('!');
      if (exclamation > -1)
         strongPass = strongPass+1;
      else
         strongPass = strongPass+0;
      
      //Count the length of the password and determine the points awarded
      int passwordL = password.length();
      
      if (passwordL>8 && passwordL<12)
         strongPass = strongPass+1;
      else if (passwordL>12)
         strongPass = strongPass+2;
      else
         strongPass = strongPass+0;
      
      //Determine point awarded for Lowercase at end
      char e = password.charAt(passwordL-1);
      
      if (Character.isLowerCase(e))
         strongPass = strongPass+1;
      else
         strongPass = strongPass+0;
      
      //Window showing password strength
      final int WIDTH = 1000;
      final int HEIGHT = 400;
      
      GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage, "Password Strength", WIDTH, HEIGHT);
      gc.setStroke(Color.BLACK);
      gc.strokeRect(50, 50, 800, 100);
      
      if (strongPass==8)
      {
         gc.setFill(Color.GREEN);
         gc.fillRect(50, 50, 800, 100);
      }
      else if (strongPass==7)
      {
         gc.setFill(Color.GREEN);
         gc.fillRect(50, 50, 700, 100);
      }
      else if (strongPass==6)
      {
         gc.setFill(Color.YELLOW);
         gc.fillRect(50, 50, 600, 100);
      }
      else if (strongPass==5)
      {
         gc.setFill(Color.YELLOW);
         gc.fillRect(50, 50, 500, 100);
      }
      else if (strongPass==4)
      {
         gc.setFill(Color.ORANGE);
         gc.fillRect(50, 50, 400, 100);
      }
      else if (strongPass==3)
      {
         gc.setFill(Color.ORANGE);
         gc.fillRect(50, 50, 300, 100);
      }
      else if (strongPass==2)
      {
         gc.setFill(Color.RED);
         gc.fillRect(50, 50, 200, 100);
      }
      else if (strongPass==1)
      {
         gc.setFill(Color.RED);
         gc.fillRect(50, 50, 100, 100);
      }
      else
      {
         gc.setFill(Color.WHITE);
         gc.fillRect(1, 1, 1, 1);
      }
      
      if (strongPass>6)
      {
         String strong = "Strong Password";
         gc.setFill(Color.BLACK);
         Font largeFont = new Font(20);
         gc.setFont(largeFont);
         gc.fillText(strong, 50, 200);
      }
      else if (strongPass>=4 && strongPass<=6)
      {
         String medium = "Medium Strength";
         gc.setFill(Color.BLACK);
         Font largeFont = new Font(20);
         gc.setFont(largeFont);
         gc.fillText(medium, 50, 200);
      }
      else
      {
         String low = "Low strength";
         gc.setFill(Color.BLACK);
         Font largeFont = new Font(20);
         gc.setFont(largeFont);
         gc.fillText(low, 50, 200);
      }
   }
      
   public static void main(String[]args)
   {
      launch(args);
   }
}