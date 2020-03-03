
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Rectangle
{
    // instance variables - replace the example below with your own
    private double mySide;

    /**
     * Constructor for objects of class Square
     */
    public Square(double x)
    {
        super(x, x);
        mySide = x;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
