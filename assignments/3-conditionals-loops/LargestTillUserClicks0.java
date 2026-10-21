// Q. Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class LargestTillUserClicks0
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,max,num;
        System.out.print("Enter number : ");
        n=in.nextInt();
        max=n;
        while(true)
        {
            System.out.print("Enter next number : ");
            n=in.nextInt();
            if(n==0)
                break;
            if(n>max)
                max=n;

        }
        System.out.println("The maximum(largest) number among all these : "+max);

    }
}
