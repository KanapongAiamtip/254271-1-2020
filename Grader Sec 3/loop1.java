import java.util.Scanner;
public class loop1
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    int num = kb.nextInt();
    int sum =0;
    for(int i =1; i<=num; i++)
    {
      if(i%2 !=0)
      {
        sum += i;
        System.out.println(i);
      }
    }
    System.out.println("Sum total is:"+" "+sum);
  }
}
