import java.util.Scanner;
class SimpleCalculator
{
	public static void main(String [] args)
	{
		Scanner kbin = new Scanner(System.in);
        System.out.print("Enter first number :");
        int n1 = kbin.nextInt();
        System.out.print("Enter second number :");
        int n2 = kbin.nextInt();
        int a = n1+n2;
        int s = n1-n2;
        int m = n1*n2;
        float d = n1/n2;
        System.out.println("Addition       :"+a);
        System.out.println("Subtraction    :"+s);
        System.out.println("Multiplication :"+m);
        System.out.println("Division       :"+d);
	}
}