package todaylab;

import java.util.*;
class Rectangle
{
  double length, breadth;
  public Rectangle (double length, double breadth)
  {
    this.length = length;
    this.breadth = breadth;

  }
  public void Area ()
  {
    System.out.println ("The Area of Rectangle is:" +
			this.length * this.breadth);
  }
  public void Perimeter ()
  {
    System.out.println ("The Perimeter of Rectangle is" +
			(2 * (this.length + this.breadth)));
  }

}

class Square extends Rectangle
{


  public Square (double side)
  {
    super (side, side);





  }

}

public class Rectangular
{
  public static void main (String[]args)
  {
    Rectangle r = new Rectangle (4, 5);
    Square s = new Square (5);
      r.Area ();
      r.Perimeter ();
      s.Area ();
      s.Perimeter ();



  }
}