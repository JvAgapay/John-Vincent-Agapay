import java.util.*;
public class LabExer1B
{
	public static void main(String[] args)
	{
		System.out.println("Enter an integer: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.print(a);
		
		showNumberPlus10(a);
		System.out.print(a);
		showNumberPlus100(a);
		System.out.print(a);
		showNumberPlus1000(a);
		
		
		
	}
	public static int showNumberPlus10(int b)
	{
		
		b = b + 10;
		System.out.println(" plus 10 is " + b);
		return b;
		

	}
	public static int showNumberPlus100(int c)
	{
		c = c + 100;
		System.out.println(" plus 10 is " + c);	
		return c;
		
	}
	public static int showNumberPlus1000(int d)
	{
		d = d + 1000;
		System.out.println(" plus 10 is " + d);
		return d;
		
	}
}