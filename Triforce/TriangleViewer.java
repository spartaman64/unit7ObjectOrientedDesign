import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.geom.Line2D;

public class TriangleViewer
{
   private static final int FRAME_WIDTH = 1920;
   private static final int FRAME_HEIGHT = 1080;
   
   JFrame frame;
   
   public TriangleViewer()
   {
       frame = new JFrame();    
       
       frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
    
   public class ClickListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
          
      }
   }
   
   public class Triangle
   {
    }
    
   public static void main(String[] args)
   {
       TriangleViewer viewer = new TriangleViewer();
    }

}
