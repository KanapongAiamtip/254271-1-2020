import java.util.*;
public class P3 
{
    public static void main(String[] args)
    {
        System.out.println("*"+"*"+"*"+"*"+"Menu"+"*"+"*"+"*"+"*"+"*");
        System.out.println("1."+"Coffee 50 baht"+"/"+"cup");
        System.out.println("2."+"Tea 30 baht"+"/"+"cup");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to order [1/2]: ");
        int x = sc.nextInt();
        System.out.print("How many cups? :");
        int y = sc.nextInt();
        switch (x)
        {
          case 1:
            y=y*50;
            System.out.println("You have to pay "+y+" baht.");
          break;

          case 2:
            y=y*30;
            System.out.println("You have to pay "+y+" baht.");
          break;
        }


    }
}
