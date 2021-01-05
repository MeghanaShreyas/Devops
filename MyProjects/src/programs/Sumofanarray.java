package programs;

public class Sumofanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		int sum = 0;
		for (int i : a)
		{
			sum = sum + i;
			
		}
		System.out.println(sum);

}
}