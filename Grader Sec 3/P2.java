import java.util.Scanner;
public class P2{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    int x = kb.nextInt();
    if(x%2==0)
    {
      System.out.println(x+10);
    }
    else if (x%2==1 && x>13)
    {
      System.out.println(x+9);
    }
    else
    {
      System.out.println(x+7);
    }
    
  }
}
