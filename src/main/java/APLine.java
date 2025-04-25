public class APLine
{
  private int a;
  private int b;
  private int c;

  public APLine(int a, b, c)
  {
  this.a = a;
  this.b = b;
  this.c = c;
  }

  public double getSlope()
  {
    return -(double)a/b;
  }
  
  public boolean isOnLine(int x, y);
  {
    return a*x + b&y + c == 0;
  }
}
