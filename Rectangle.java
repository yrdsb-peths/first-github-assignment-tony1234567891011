public class Rectangle 
{
  private int height;
  private int width;
  public Rectangle(int theHeight; int theWidth)
  {
    height = theHeight;
    width = theWidth;
  }
  public int getHeight()
  {
    return height;
  }
  
  public int getWidth()
  {
    return width;
  }
  
  public String toString()
  {
    return "the Rectangle has" + width + " of width and " + height + " of height."
  }
}
