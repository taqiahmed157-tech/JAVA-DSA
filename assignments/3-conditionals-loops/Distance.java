// Q. Calculate Distance bewteen two points.
import java.util.Scanner;
public class Distance
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First point : ");
        float x1,y1,x2,y2;
        x1=in.nextFloat();
        y1=in.nextFloat();
        System.out.print("Enter Second point : ");
        x2=in.nextFloat();
        y2=in.nextFloat();
        double dist=Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
        System.out.print("Distance Between ("+x1+","+y1+") and ("+x2+","+y2+") : "+dist);

    }
}
