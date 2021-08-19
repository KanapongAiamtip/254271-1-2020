import java.util.Scanner;
public class C1 
{

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int x = 1;
      int summary = 0;
      while(x<=3)
      {
        int y = sc.nextInt();
        summary = summary+y;
        x++;
      }
      System.out.println(summary);
    }
}
