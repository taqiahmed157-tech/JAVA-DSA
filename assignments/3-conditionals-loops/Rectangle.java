import java.util.Scanner;
public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two sides of rectangle : ");
        float a,b;
        a=in.nextFloat();
        b=in.nextFloat();
        float area = a*b;
        float perimeter=2*(a+b);
        System.out.println("Area of Rectangle : "+area);
        System.out.println("Perimeter of Rectangle : "+perimeter);
    }
}
