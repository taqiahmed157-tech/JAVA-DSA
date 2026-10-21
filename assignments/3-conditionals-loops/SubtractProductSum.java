// Q. Subtract the Product and Sum of Digits of an Integer.
import java.util.Scanner;
public class SubtractProductSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to find the difference of product and sum of its digit : ");
        int n = in.nextInt();
        int num=n,digit,sum=0,product=1;
        while(n>0)
        {
            digit=n%10;
            sum=sum+digit;
            product=product*digit;
            n=n/10;
        }
        int diff=product-sum;
        System.out.println("The Difference of product and sum of digits of "+num+" : "+diff);
        System.out.println("Where Product="+product+", Sum="+sum);
    }
}
