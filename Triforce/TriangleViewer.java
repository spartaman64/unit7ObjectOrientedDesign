import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.geom.Line2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

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
    
   class MousePressListener implements MouseListener     
   {
      public void mousePressed(MouseEvent event)
      {
          int x = event.getX();
          int y = event.getY();
      }
      public void mouseReleased(MouseEvent event){}
      public void mouseClicked(MouseEvent event){}
      public void mouseEntered(MouseEvent event){}
      public void mouseExited(MouseEvent event){}
   }
   
   public class TriangleFrame extends JFrame
   {
       
    }
    
   public static void main(String[] args)
   {
       TriangleViewer viewer = new TriangleViewer();
    }

}
