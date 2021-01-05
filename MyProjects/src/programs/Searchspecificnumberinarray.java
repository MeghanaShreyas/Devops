package programs;

public class Searchspecificnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {100,201,300,400};
		for (int i = 0;i<5;i++)
		{
			if (num[i] %2 ==0)
			{
				System.out.println(num[i] + "Even number");
			}
			else
			{
				System.out.println(num[i] + "Odd number");
			}
		}
		
	}

}
