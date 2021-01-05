package programs;

public class Student {
	
	String name;
	int rno;
	Student(String sname, int srno)
	{
		name = sname;
		rno = srno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("john",10);
		System.out.println(s.name);
	}

}
