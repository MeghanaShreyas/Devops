package programs;

public class Singlethread extends Thread
{
public void run()
{
	
	for (int i=0;i<=5;i++)
	{

		
		System.out.println(i);
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Singlethread st = new Singlethread();
System.out.println(st.getId());
System.out.println(st.getName());
st.setName("meghana");
System.out.println(st.getName());
System.out.println(st.getPriority());
st.start();
	}

}
