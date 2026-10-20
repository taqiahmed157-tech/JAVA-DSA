// Q. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        float p,t,r;
        System.out.print("Enter principle value : ");
        p=in.nextFloat();
        System.out.print("Enter rate value : ");
        r=in.nextFloat();
        System.out.print("Enter time value : ");
        t=in.nextFloat();
        float si=(p*r*t)/100;
        System.out.print("Simple Interest : "+si);
    }
}
