import static java.lang.System.out;
import java.util.Scanner;
public class Mid1 {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%3==1)
        {
          int x = a/3;
          int y = x+1;
          out.println(y+", "+x+", "+x);
        }
        else if(a%3==2)
        {
          int x = a/3;
          int y = x+1;
          out.println(x+","+y+", "+y);
        }
        else
        {
          int x =a /3;
          out.println(x+", "+x+", "+x);
        }
    }
}
