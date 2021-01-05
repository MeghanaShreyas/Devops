package programs;

interface i
{
	int a=10;                   //final and static variable
	void m1();                  //abstract method and public access modifier by default
}

interface ii extends i  		//interface extending another interface
{
	String s = "shreyas";
	void m2();
}

public class Interfaces implements ii  //class implemeting interface
{
	public void m1()
	{
		System.out.println("dkhed");
	}
	public void m2()					//method defined in class
	{
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ii meg = new Interfaces();  			//Class instantiation and interface assigning variables
		meg.m1();
		
	}


	

}
