package programs;

import java.util.Scanner;

public class Evenorodd
{
	public static void main(String args[])
	{
		System.out.println("Please enter the number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if (num%2 ==0)
		{
			System.out.println("Even");
			
		}
		else
		{
			System.out.println("odd");
		}
	}
	
}
