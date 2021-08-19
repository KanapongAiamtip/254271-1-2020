import java.util.Scanner;
public class Test4
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    int x = kb.nextInt();
    int y = kb.nextInt();
    int sum = x/y;
    for(int i=1; i<=sum; i++)
    {
      System.out.println(i*y);
    }
  }
}
