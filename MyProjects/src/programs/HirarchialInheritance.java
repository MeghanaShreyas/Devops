package programs;


class Ab
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class Ba extends Ab 			
{
	int b;
	void status()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

class ca extends Ab  			
{
	int c;
	void show()
	{
		System.out.println(a);
		System.out.println(c);
		
	}
}
public class HirarchialInheritance {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Ab meg = new Ab();
	meg.a = 10;
	meg.display();
	
	Ba shre = new Ba();
	shre.b = 20;
	shre.a = 20;
	shre.status();
	
	ca megs = new ca();
	megs.a=30;
	megs.c = 30;
	megs.show();
	
	}
	


}
