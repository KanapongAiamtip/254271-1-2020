import java.util.Scanner;
public class P5
{
  public static void main(String[] args)
  {
     Scanner in = new Scanner(System.in);
     int x  = in.nextInt();
     int y  = in.nextInt();

    if(x>35)
    {
      double a = (x*y)+800;
      System.out.println("Salary is "+String.format("%.1f", a));
    }
    else 
    {
      double b = x*y;
      System.out.println("Salary is "+String.format("%.1f", b));
    }
  }
}