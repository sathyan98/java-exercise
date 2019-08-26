import java.util.Scanner;

public class Equal
{
public static void main(String args[])
{
  Scanner s1 = new Scanner(System.in);
  Scanner s2 = new Scanner(System.in);
  Scanner s3 = new Scanner(System.in);
  Scanner s4 = new Scanner(System.in);

  System.out.println("input first number ; " );
  int n1 = s1.nextInt();
  System.out.println("input second number :");
  int n2 = s2.nextInt();
  System.out.println("input third number :");
  int n3 = s3.nextInt();
  System.out.println("input fourth number :");
  int n4 = s4.nextInt();
  if(n1 == n2 )
      if (n3 == n4)
          System.out.println("numbers are equal");
      else
      System.out.println("numbers are not equal");



}














}

/*Sample Output:
        Input first number: 25
        Input second number: 37
        Input third number: 45
        Input fourth number: 23
        Numbers are not equal!*/