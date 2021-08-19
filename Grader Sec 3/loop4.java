import java.util.Scanner;
public class loop4
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    int x = kb.nextInt();
    for(int i =0; i<=x; i++)
    {
      if(i%2==0)
      {
        System.out.println(i);
      }
    }
  }
}
