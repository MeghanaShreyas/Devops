package programs;

import java.util.Scanner;
public class Largestofthree {

	public static void main(String[] args) {

		System.out.println("Please enter the value of a");
		Scanner s = new Scanner(System.in);
		
int a= s.nextInt();
System.out.println("Please enter the value of b");
int b= s.nextInt();
System.out.println("Please enter the value of c");
int c= s.nextInt();
if ((a>b) && (a>c))
{
System.out.println('a');
}
else if((b>a) && (b>c))
{
	System.out.println("b");
	
}
else
{
	System.out.println("c");
}
}
}
