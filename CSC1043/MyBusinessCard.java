import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MyBusinessCard extends Application
{
   @Override
   public void start(Stage stage)
   {
      //Define the window size
      final int WIDTH = 700;
      final int HEIGHT = 400;
      
      //Setting up the stage
      GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage, "My Business Card", WIDTH, HEIGHT);
      
      //Setting up the card size
      gc.setFill(Color.LIGHTGRAY);
      gc.setStroke(Color.BLACK);
      
      gc.strokeRect(100, 50, 450, 250);
      gc.fillRect(100, 50, 450, 250);
      
      //Creating the lines of information
      String infoName = "Sara Peak";
      gc.setFill(Color.BLACK);
      Font largeFont = new Font(14);
      gc.setFont(largeFont);
      gc.fillText(infoName, 125, 240);
      
      String infoPosition = "Computer Science Student - PLNU";
      gc.fillText(infoPosition, 125, 260);
      
      String infoEmail = "speak1318@pointloma.edu";
      gc.fillText(infoEmail, 125, 280);
      
      //Creating a custom logo - circle behind laptop 1
      gc.setFill(Color.CYAN);
      gc.setStroke(Color.BLACK);
      gc.fillOval(240, 50, 140, 140);
      gc.strokeOval(240, 50, 140, 140);
      
      //Custom logo - circle behind laptop 2
      gc.setFill(Color.BLUE);
      gc.fillOval(250, 50, 140, 140);
      gc.strokeOval(250, 50, 140, 140);
      
      //Custom logo - laptop
      int sX = 285;
      int sY = 70;
      
      gc.setFill(Color.BLACK);
      gc.fillRect(sX, sY, 220, 120);
      
      int startX = 395;
      int startY = 80;
      gc.beginPath();
      gc.moveTo(startX, startY);
      gc.lineTo(startX-145, startY+145);
      gc.lineTo(startX+145, startY+145);
      gc.closePath();
      gc.fill();
      
      Color customColor = Color.rgb(16, 82, 232);
      gc.setFill(customColor);
      gc.fillRect(293, 77, 205, 100);
      
      gc.setStroke(Color.LIGHTGRAY);
      gc.strokeLine(295, 190, 495, 190);
      
      //Custom logo - keys
      gc.setStroke(Color.WHITE);
      gc.strokeLine(285, 200, 505, 200);
      
      gc.setStroke(Color.WHITE);
      gc.strokeLine(275, 207, 515, 207);
      
      gc.setStroke(Color.WHITE);
      gc.strokeLine(265, 214, 525, 214);
      
      gc.setStroke(Color.WHITE);
      gc.strokeLine(360, 221, 430, 221);
      
      //Custom logo - message
      String compError = ":(";
      gc.setFill(Color.WHITE);
      Font errorFont = new Font(20);
      gc.setFont(errorFont);
      gc.fillText(compError, 300, 100);
      
      String errorReason1 = "Your PC ran into a problem and needs to restart. We're";
      Font reasonFont = new Font(8);
      gc.setFont(reasonFont);
      gc.fillText(errorReason1, 300, 150);
      
      String errorReason2 = "just collecting some error info, and then we'll restart";
      gc.fillText(errorReason2, 300, 160);
      
      String errorReason3 = "for you. (0% complete)";
      gc.fillText(errorReason3, 300, 170);
   }
      
   public static void main(String[]args)
   {
      launch(args);
   }
}