
/**
 * Write a description of class Rectangle here.
 * 
 * @author Huy Nguyen
 * @version 3/3/2020
 */
public class Rectangle extends Shape
{
    // instance variables - replace the example below with your own
    private double myWidth, myHeight;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(double x, double y)
    {
        myWidth = x;
        myHeight = y;
    }

    public double getWidth()
    {
        return myWidth;
    }
    
    public double getHeight()
    {
        return myHeight;
    }
    
    public void setWidth(double x)
    {
        myWidth = x;
    }
    
    public void setHeight(double y)
    {
        myHeight = y;
    }
    
    public double findArea()
    {
        return myWidth * myHeight;
    }
    
    public double findDiagonal()
    {
        return Math.sqrt((myWidth * myWidth) + (myHeight * myHeight));
    }
    
    public double findPerimeter()
    {
        return (myWidth * 2) + (myHeight * 2 );
    }
}
