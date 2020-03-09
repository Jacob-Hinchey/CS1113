// Lab 10
// Jacob Hinchey
// 1113
public class Rectangle extends GeometricObject
{
  private double height;
  private double width;
  public Rectangle(double width,double height)
  {
    this.width=width;
    this.height=height;
  }
  public double getArea()
  {
    return width*height;
  }
  public double getPerimeter()
  {
    return width+width+height+height;
  }
  public String toString()
  {
    return "Rectangle: height=" + height + ", width=" + width + ", Area=" + getArea() + ", Perimeter=" + getPerimeter();
  }
}
