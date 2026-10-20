// Q. Input currency in rupees and output in USD.
import java.util.Scanner;
public class InrToUsd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter currency in INR : ");
        double inr=in.nextDouble();
        double usd=(inr)/94.85;
        System.out.print(inr+"(inr) in usd : "+usd);

    }
}
