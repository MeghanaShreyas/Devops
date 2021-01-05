package programs;

class q
{
	int q=10;
	void q1()
	{
		System.out.println("I am first class");
	}

interface w 
{

	void w2();
	
}

interface e
{
	void e3();
}
public static class Hybridinheritance extends q implements w,e
{
public void w2()
{
	System.out.println("jijwd");
}
public void e3()
{
	System.out.println("awejnd");
}

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		Hybridinheritance me = new Hybridinheritance();
		me.q1();
		me.w2();
		me.e3();
	}
}
}
