package programs;

public class Javamethods {
	int x = 10;
	int y = 20;
	int id;
	void display() //not taking parameters and not returned any values
	{
		System.out.println(x+y);
	}
	int show()  //not taking parameters but returning value
	{
		return (x+y);
	}
	void stu (int a, int b) //taking parameters but not returning any value
	{
		System.out.println(a+b);
	}
	int sum (int m, int n) // passing parameters and returning the value.
	{
		return m+n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Javamethods java = new Javamethods();
		java.display();
		Javamethods j = new Javamethods();
		int res = j.show();
		System.out.println(res);
		java.stu(10, 20);
		System.out.println(java.sum(10, 20));
	}

}
