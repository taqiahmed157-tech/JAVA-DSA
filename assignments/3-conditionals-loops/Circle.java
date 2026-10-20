// Q. Write a program to calculate area of circle.
import java.util.Scanner;



public class Circle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        float rad=in.nextFloat();
        System.out.println("Area of circle : "+((Math.PI)*rad*rad));
        System.out.println("Perimeter of Circle : "+(2*(Math.PI)*rad));


    }
}
