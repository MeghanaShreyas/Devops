package programs;

public class Thiskeyword {

	int x,y;   							//class variables
	void getvalues(int x,int y)			//method variables
	{
		this.x = x;
		this.y = y;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword meg = new Thiskeyword();
		meg.getvalues(10, 20);
		
		meg.sum();
		
	}

}
