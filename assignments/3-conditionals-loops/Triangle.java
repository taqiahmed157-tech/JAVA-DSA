// Q. Write a progam to print area of triangle.
import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three sides of triangle : ");
        float a,b,c;
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();
        float s =(a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        float perimeter = a+b+c;
        System.out.println("Area of Triangle : "+area);
        System.out.println("Permiter of Triangle : "+ perimeter);
    }
}
