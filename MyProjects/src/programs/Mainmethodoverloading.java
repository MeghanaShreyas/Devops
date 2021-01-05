package programs;

public class Mainmethodoverloading {

	
	void main(int a)
	{
		System.out.println(a);
	}
	public void main(int a, int x)
	{
		System.out.println(a+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainmethodoverloading meg = new Mainmethodoverloading();
		meg.main(10);
		meg.main(10, 2);
		
	}

}
