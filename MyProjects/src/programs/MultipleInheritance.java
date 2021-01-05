package programs;

interface abc
{
	int a = 10;
	void m1();
}

interface xyz
{
	int b = 20;
	void m2();
}
public class MultipleInheritance implements abc,xyz
{
public void m1()										//the methods should be public while defining
{
	System.out.println(a);
	
}
	
public void m2()
{
	System.out.println(b);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	MultipleInheritance meg = new MultipleInheritance();
	meg.m1();
	meg.m2();
}
	}

