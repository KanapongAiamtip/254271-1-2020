import java.util.Scanner;
public class P4{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    int x = kb.nextInt();
    if(x<=100000)
    {
      System.out.println("Commision is "+(x/100*2));
    }
    else if (x<=400000)
    {
      System.out.println("Commision is "+(x/100*5));
    }
    else
    {
      System.out.println("Commision is "+(x/100*10));
    }

  }
}
