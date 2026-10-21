import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        int i=n,fact=1;
        while(i>0)
        {
            fact=fact*i;
            i--;
        }
        System.out.println("Factorial of "+n+" : "+fact);
    }
}
