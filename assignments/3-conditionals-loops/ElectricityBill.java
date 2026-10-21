import java.util.Scanner;
public class ElectricityBill
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of units : ");
        float unit = in.nextFloat();
        float rate=0,total=0;
        if(unit>200)
        {
            rate=4.0f;
            total=rate*unit;
        }
        else if(unit>100)
        {
            rate=2.5f;
            total=rate*unit;
        }
        else if(unit>0)
        {
            rate=1.5f;
            total=rate*unit;
        }
        else
            System.out.println("Negative units!! or zero!!");
        System.out.println("Total bill : "+total);
    }
}
