package programs;
import java.util.Scanner;
public class Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int count = 0;
		while (num > 0)
		{
			count++;
			num = num/10;
		}
	System.out.println(count);
	}
	

}
