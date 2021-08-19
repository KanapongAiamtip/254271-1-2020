import static java.lang.System.out;
import java.lang.Math;
import java.util.Scanner;
public class Mid2
{

    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        double sum = (a+b+c)/3;
        double x = Math.abs(a-sum);
        double y = Math.abs(b-sum);
        double z = Math.abs(c-sum);

        if(x<y && x<z)
        {
        	out.println(a);
        }
        else if(y<x && y<z)
        {
        	out.println(b);
        }
        else if(z<x && z<y)
        {
        	System.out.println(c);
        }
        else if((x==y) && x<z)
        {
        	out.println(a);
        	out.println(b);
        }
        else if((x==z) && x<y)
        {
        	out.println(a);
        	out.println(c);
        }
        else if((y==z) && y<x)
        {
        	out.println(b);
        	out.println(c);
        }
        else
        {
        	out.println(a);
        	out.println(b);
        	out.println(c);
        }
      }
}
