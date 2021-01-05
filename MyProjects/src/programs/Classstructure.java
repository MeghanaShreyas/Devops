package programs;

public class Classstructure {
	
	int id;
	double salary;
	String department;
	
	void display()
	{
		System.out.println(id);
		System.out.println(department);
	}
	
	public static void main(String[] args) {
		
		//through reference variables
		Classstructure m = new Classstructure();
		m.id=1;
		m.department="Maths";
		m.display();
	}

}
