// Q. Calculate Discount Of Product.
import java.util.Scanner;
public class Discount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        float mp,dis,sp;
        System.out.print("Enter Original price : ");
        mp=in.nextFloat();
        System.out.print("Enter Discount(%) : ");
        dis=in.nextFloat();
        float disp=(mp*dis)/100;//discount price.
        sp=mp-disp;
        System.out.println("Market price : "+mp);
        System.out.println("Discount price : "+disp);
        System.out.println("The Final selling price : "+sp);



    }
}
