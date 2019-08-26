import java.util.Scanner;
import java.lang.Math;
public class Binary
{
    public static void main(String args[])
    {
        Scanner int1 = new Scanner(System.in);
        Scanner int2 = new Scanner(System.in);
        int a = int1.nextInt();
        System.out.println("enter the number" + Integer.toBinaryString(a) );
        int b = int2.nextInt();
        System.out.println("enter another number" + Integer.toBinaryString(b));
        System.out.println("the addition is " + Integer.toBinaryString(a+b));

    }
}

