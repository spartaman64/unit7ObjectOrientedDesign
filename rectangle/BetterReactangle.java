import java.awt.Rectangle;
public class BetterReactangle extends Rectangle
{   
    Rectangle rect = new Rectangle();
    int programmingLevel = 0;
    
    public BetterReactangle()
    {       
       rect.setLocation(0,0);
       rect.setSize(1,2);
    }
    
    public double getPerimeter()
    {
        double height = rect.getHeight();
        double length = rect.getWidth();
        double perimeter = height + length;          
        return perimeter;
    }
    
    public double getArea()
    {
        double height = rect.getHeight();
        double length = rect.getWidth();
        double area = height * length;
        return area;
    }
    
    public void getGud()
    {        
        programmingLevel += 9001;
    }
    
    public String checkLevel()
    {
        String level = "";
        if(programmingLevel > 9000)
        {
            level = "Its over 9000!";
        }
        else
        {
            level = "Its a level 0";
        }
        return level;
    }
}
