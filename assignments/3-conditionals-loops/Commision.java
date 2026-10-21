// Q. Calculate Commission Percentage.
import java.util.Scanner;
public class Commision
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        float sales,commision,percentage;
        System.out.print("Enter sales value : ");
        sales=in.nextFloat();
        System.out.print("Enter commision earned : ");
        commision=in.nextFloat();
        percentage=(commision*100)/sales;//Commision in percentage
        System.out.println("The salesman earnd a commison of "+percentage+"% on sale of "+sales );
    }
}
