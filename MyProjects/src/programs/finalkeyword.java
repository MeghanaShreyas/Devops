package programs;

final public class finalkeyword {       
	
	//final int a = 10;
	final void display()
	{
		//a=20;							// this action cannot be done as final key word is made use.
		//System.out.println(a);
		System.out.println("awiehsdnz");
	}
	
	//class meg extends finalkeyword    // As this is child class it cant extend the final parent class
	{
		//void display()				//parent class method is final and hence cannot be used in child class methods.
		{
			System.out.println("lsjdsfk");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      finalkeyword n = new finalkeyword();
      n.display();
	}

}
