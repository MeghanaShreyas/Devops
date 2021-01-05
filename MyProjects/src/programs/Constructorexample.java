package programs;

public class Constructorexample
{
	int x;
	int y;
	int z;



Constructorexample(int a, int b, int c)
{
x=a;
y=b;
z=c;
}

void sum()
{
	System.out.println(x+y-z);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorexample meg = new Constructorexample(1,2,3);
		meg.sum();
		
	}

}
