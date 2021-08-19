import java.util.Scanner;
public class P1
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    int x = kb.nextInt();
    if(x>45)
    {
      System.out.println("More than 45");
    }
    else if (x==45)
    {
      System.out.println("Equal 45");
    }
    else
    {
      System.out.println("Less than 45");
    }
  }
}
