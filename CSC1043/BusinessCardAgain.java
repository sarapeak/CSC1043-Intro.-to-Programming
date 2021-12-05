import javax.swing.*;
import java.awt.*;
//should work on mac and windows
public class BusinessCardAgain extends JPanel
{
   //declare all shared variables (must be static)
   static String nameOnCard, email, title, fontSize; 
       
   public void paintComponent (Graphics gc)
   {
      super.paintComponent(gc);
      //get the needed information

      int intSize = Integer.parseInt(fontSize);
      
      // Create card itself
      int startX = 50, startY = 50;
      Color backColor = new Color(250,240,230);
      gc.setColor(backColor);
      gc.fillRect(startX,startY,300,220);
      gc.setColor(Color.BLACK);
      gc.drawRect(startX,startY,300,220);
      
      //add the personal information
      Font newFont = new Font("TimesRoman",Font.PLAIN,intSize);
      gc.setFont(newFont);
      gc.drawString(nameOnCard, startX+20, startY+150);
      gc.drawString(title, startX+20, startY+170);
      gc.drawString(email, startX+20, startY+190);
      gc.drawString("ACME Computing", startX+20,startY+210);
      
      //make the computer
      gc.setColor(Color.BLACK);
      gc.fillRect(startX+143,startY+3,134,94);
      gc.setColor(Color.CYAN);
      gc.fillRect(startX+150,startY+10,120,80);

      //add circles
      gc.setColor(Color.RED);
      gc.fillOval(startX+200, startY+40,20,20);
      gc.setColor(Color.ORANGE);
      gc.fillOval(startX+180, startY+45,15,15);
      gc.fillOval(startX+225, startY+45, 15,15);
      gc.setColor(Color.YELLOW);
      gc.fillOval(startX+165, startY+50,10,10);
      gc.fillOval(startX+245, startY+50, 10,10);
      
      //keyoard
      Polygon keyboard = new Polygon();
      keyboard.addPoint(startX+146, startY+94);
      keyboard.addPoint(startX+130,startY+125);
      keyboard.addPoint(startX+286,startY+125);
      keyboard.addPoint(startX+274,startY+94);
      gc.setColor(Color.BLACK);
      gc.fillPolygon(keyboard);
      
      //keys
      gc.setColor(Color.DARK_GRAY);
      gc.fillRect(startX+160,startY+100,100,5);
      gc.fillRect(startX+156,startY+110,104,5);
      gc.fillRect(startX+152,startY+120,108,5);
      
      //3 line "A"
      gc.setColor(Color.RED);
      gc.drawLine(startX+60, startY+20, startX+80, startY+20);
      gc.drawLine(startX+50, startY+40, startX+90, startY+40);
      gc.drawLine(startX+40, startY+60, startX+100, startY+60);
      gc.drawLine(startX+30, startY+80, startX+110, startY+80);
   }
   
    public static void main(String args[]) 
    {
      //get input from main
       nameOnCard = JOptionPane.showInputDialog( null,  "What name would you like on the card?" );
       email = JOptionPane.showInputDialog(null, "What is the title for "+nameOnCard+"?");
       title = JOptionPane.showInputDialog(null, "What is the email address for "+nameOnCard+"?");
       fontSize = JOptionPane.showInputDialog(null, "What font size do you prefer? 12-20 is best");
       JOptionPane.showMessageDialog( null, "Thank you - card being created" );
       
       //create window
       JFrame frame = new JFrame();
       frame.setSize(500, 400);
       //point to program created
       frame.setContentPane(new BusinessCardAgain());   
       frame.setVisible(true);     
    }

}
