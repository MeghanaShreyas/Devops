package programs;

public class Addtwometrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first[][] = {{1,2},{3,4}};
		int second[][] = {{5,6},{7,8}};
		
		for (int i=0;i<first.length;i++)
		{
			for(int j=0;j<second.length;j++)
			{
				int sum =  (first[i][j]+second[i][j]);
				System.out.println(sum);
			}
		}
	}

}
