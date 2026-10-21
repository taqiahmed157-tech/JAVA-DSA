// Q. Calculate Average Of N Numbers
import java.util.Scanner;
public class AvgOfN
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        float n,num,i,sum=0;
        System.out.print("Enter the value of n : ");
        n= in.nextFloat();
        System.out.print("Enter "+n+" numbers : ");
        for(i=1;i<=n;i++)
        {
            num= in.nextFloat();
            sum=sum+num;
        }
        float avg=sum/n;
        System.out.println(avg);


    }
}
