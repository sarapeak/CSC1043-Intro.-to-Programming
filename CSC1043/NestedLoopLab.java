/*Code created by Sara to understand how nested loops work in a program*/

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.*;
import java.text.*;

public class NestedLoopLab extends Application
{
   @Override
   public void start(Stage stage)
   {
      //Create Scanner
      Scanner scan = new Scanner(System.in);
      
      //Ask user to enter number of lines to draw
      System.out.println("Enter the number of line sets to draw");
      
      //Force user to enter a number between 2 and 9
      int lineSets;
      do
      {
         System.out.println("Please enter a number between 2 and 9");
         lineSets = scan.nextInt();
      } while (lineSets<2||lineSets>9);
      
      //Ask user to enter a number for the length
      System.out.println("How long would you like the lines to be?");
      
      //Force user to enter in a number in the specified range
      int number;
      do
      {
         System.out.println("Please enter a number between 1 and 50");
         number = scan.nextInt();
         //if/else if statement to tell user if the number inputed is too small or too big
         if (number<1)
            System.out.println("The line needs to be at least length 1");
         else if (number>50)
            System.out.println("The line needs to be at most length 50");
         
      } while (number<1||number>50);
      
      System.out.println("Thank you");
      
      //The window size and the start of the Graphics
      final int WIDTH = 1000;
      final int HEIGHT = 400;
      int START_X = 50;
      int START_Y = 70;
      
      GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage, "Draw Figures", WIDTH, HEIGHT);
      
      //The first for loop counts the number of sets to be drawn
      for (int colorLines = 1; colorLines<=lineSets; colorLines++)
      {
         //Switch statement makes the first three sets different colors
         switch (colorLines)
         {
            case 1:
               gc.setStroke(Color.RED);
               break;
            case 2:
               gc.setStroke(Color.BLUE);
               break;
            case 3:
               gc.setStroke(Color.YELLOW);
               break;
            default:
               gc.setStroke(Color.BLACK);
         }
         //The second for loop draws the four lines in each set
         for (int i = 1; i<=4; i++)
         {
            gc.strokeLine(START_X, START_Y, START_X+number, START_Y);
            START_Y = START_Y+15;
         }
         //Resets the START_Y and START_X is moved
         START_X = START_X+100;
         START_Y = 70;
      }
   }  
     public static void main(String[]args)
   {
      launch(args); 
   }
}