// Q. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class Operations
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your operator(+,-,*,/) : ");
        char op = in.next().trim().charAt(0);
        System.out.print("Enter first number : ");
        float n1 = in.nextFloat();
        System.out.print("Enter second number : ");
        float n2 = in.nextFloat();
        if (op == '+')
        {
            System.out.println("Sum:" + (n1 + n2));
        }
        if (op == '-')
        {
            System.out.println("Difference:" + (n1 - n2));
        }
        if (op == '*')
        {
            System.out.println("Product:" + (n1 * n2));
        }
        if(op == '/')
        {
            if(n2!=0)
                System.out.println("sum:" + (n1 / n2));
            else
                System.out.println("Zero Division Error!");

        }

    }
}
