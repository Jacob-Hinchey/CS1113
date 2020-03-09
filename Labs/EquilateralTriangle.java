// Lab 10
// Jacob Hinchey
// 1113
public class EquilateralTriangle extends GeometricObject
{
  private double side;
  public EquilateralTriangle(double side)
  {
    this.side=side;
  }
  public double getArea()
  {
    double s=1.5 * side;
    return Math.sqrt(s*(s-side)*(s-side)*(s-side));
  }
  public double getPerimeter()
  {
    return 3*side;
  }
  public String toString()
  {
  return "EquilateralTriangle: side=" + side + ", Area=" + getArea() + ", Perimeter=" + getPerimeter();
  }
}
