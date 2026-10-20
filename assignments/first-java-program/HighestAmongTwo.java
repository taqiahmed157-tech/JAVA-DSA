// Q. Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class HighestAmongTwo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float a=in.nextFloat();
        System.out.print("Enter second number : ");
        float b=in.nextFloat();
        if(a>b)
            System.out.println(a+" is largest");
        System.out.println(b+" is largest");
    }

}
