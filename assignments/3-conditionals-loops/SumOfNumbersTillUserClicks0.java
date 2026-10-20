// Q. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;
public class SumOfNumbersTillUserClicks0
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,sum=0;
        while(true)
        {
            System.out.print("Enter a number : ");
            n= in.nextInt();
            if(n==0)
                break;
            sum= sum + n;
            System.out.println("Current sum : "+sum);


        }

    }
}
