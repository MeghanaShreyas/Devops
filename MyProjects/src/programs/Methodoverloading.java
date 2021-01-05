package programs;

public class Methodoverloading {
	

	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a, double b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading meg = new Methodoverloading();
		meg.sum(1, 2);
		meg.sum(1, 2.3);
	}

}
