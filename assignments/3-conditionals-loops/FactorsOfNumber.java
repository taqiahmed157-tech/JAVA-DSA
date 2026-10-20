import java.util.Scanner;
public class FactorsOfNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        int i=1;
        while(i<=n)
        {
            if((n%i)==0)
            {
                System.out.println(i);
            }

            i++;
        }

    }
}

