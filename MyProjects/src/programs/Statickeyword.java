package programs;

public class Statickeyword {
	
	static int dep = 1;   			//static method
	String name;
	int sno = 10;						//non static method
	
	static void display()			//static method can only access static variables
	{
		System.out.println(dep);
		Statickeyword se = new Statickeyword();
	}
	void status()					//non static variables can access both static and non static variables
	{
		System.out.println(dep);	//non static can access static directly
		System.out.println(sno);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Statickeyword.dep);
		//Statickeyword.status();				//Cant access non static methods without object creation
		Statickeyword.display();	  			//Can access static methods without object creation
		Statickeyword meg = new Statickeyword();
		meg.status();  		  					//Can access non static methods with object creation
		//meg.display();
	}
	

}
