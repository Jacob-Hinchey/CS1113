// Lab 10
// Jacob Hinchey
// 1113
public class Circle extends GeometricObject
{
  private double radius;
  public Circle(double radius)
  {
    this.radius=radius;
  }
  public double getArea()
  {
    return Math.PI*radius*radius;
  }
  public double getPerimeter()
  {
    return Math.PI*radius*2;
  }
  public String toString()
  {
    return "Circle: radius=" + radius + ", area="+getArea()+", Perimeter="+ getPerimeter();
  }

}
