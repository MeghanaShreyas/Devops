package programs;

class animal
{
	String s = "meghana";
	void display()
	{
		System.out.println("hiii");
	}
	animal()
	{
		System.out.println("Animal");
	}
}

class bird extends animal
{
	String s = "Shreyas";
void display()
{
	System.out.println(super.s);		//refer immediate parent class instance variable
	System.out.println("hiiiiii");
	super.display();					//refer immediate parent class method
	
	
}
	bird()
{
	super();							//refer immediate parent class constructor.
	System.out.println("bird");
	
}
}
//check program Main method