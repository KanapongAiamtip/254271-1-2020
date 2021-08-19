import java.util.Scanner;
public class C2
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      int x = 0;
      int summary = 0;
      while(x<5)
      {
        int y = in.nextInt();
        if(y%2==0)
        summary = summary+y;
        x++;
      }
      System.out.println(summary);
    }
}
