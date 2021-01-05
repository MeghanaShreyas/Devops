package programs;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A 			//single inheritance
{
	int b;
	void status()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

class c extends B  				//multilevel inheritance
{
	int c;
	void show()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	A meg = new A();
	meg.a = 10;
	meg.display();
	
	B shre = new B();
	shre.b = 20;
	shre.a = 20;
	shre.status();
	
	c megs = new c();
	megs.a=30;
	megs.b=30;
	megs.c = 30;
	megs.show();
	
	}
	

}
