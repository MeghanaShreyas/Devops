package programs;

public class Constructortypes {

	int x,y;
	/*Constructortypes() // default constructor
	{
		x=10;
		y=20;
	}*/
	
	Constructortypes(int a, int b) //parameterized constructor
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructortypes con = new Constructortypes(100,200);
	con.display();

	}

}
