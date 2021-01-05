package programs;

public class Threadscheduler extends Thread
{
	public void run()
	{
		for(int i = 0;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadscheduler ts = new Threadscheduler();
		Threadscheduler tss = new Threadscheduler();
		Threadscheduler tsss = new Threadscheduler();
		ts.start();
		try
		{
			ts.join(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		tss.start();
		tsss.start();
	}

}
