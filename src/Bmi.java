import java.util.*;
public class Bmi {
    public static void main(String args[])
    {
        Scanner weight =new Scanner(System.in);

        System.out.println("enter the weight" );
        int wht = weight.nextInt();
        Scanner height = new Scanner(System.in);

        System.out.println("enter the height " );
        int ht = height.nextInt();

        double BMI = wht * 0.45359237 / (ht * 0.0254 * ht * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");









    }
}
