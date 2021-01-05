package programs;

public class Constrcutoroverloading {

	
	Constrcutoroverloading(int a, int b)
	{
		System.out.println(a+b);
	}
	Constrcutoroverloading( int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrcutoroverloading meg = new Constrcutoroverloading(10,20);
	}

}
