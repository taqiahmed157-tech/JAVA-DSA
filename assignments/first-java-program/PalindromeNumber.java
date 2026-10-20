// Q. To find out whether the given Number is Palindrome or not.
import java.util.Scanner;
public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        int num=n;// storing the inputted number
        int ans=0;
        while(n>0)
        {
            int digit=n%10;//Storing the Remainder
            ans=ans*10+digit;// Reversing the number
            n=n/10;// Remove the last digit
        }
        System.out.println("Reversed Number : "+ans);
        if(ans==num)
            System.out.print(num + " is palindrome with "+ans);
        else
            System.out.println(num + " is  not palindrome" + ans);

    }
}
