import java.util.Scanner;

public class Calculation
{
    public static void main(String args[])
    {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter your first number");
        int num1 = input1.nextInt();
        System.out.println("enter your second number");
        int num2 = input2.nextInt();
        int sum = num1 + num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int sub = num1 - num2;
        System.out.println("the results are " + sum + " mul " + mul +  " div " +  div + " sub "+  sub);


    }
}
