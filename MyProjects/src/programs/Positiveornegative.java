package programs;
import java.util.Scanner;

public class Positiveornegative {

	public static void main(String[] args) {
		
		System.out.println("Please enter the number:");
		Scanner s = new Scanner(System.in);
				int num = s.nextInt();
		if (num >0)
		{
			System.out.println("positive number");
		}
		else if(num<0)
		{
			System.out.println("negative number");
		}
		else
		{
			System.out.println("number is zero");
			
		}
	}

}
