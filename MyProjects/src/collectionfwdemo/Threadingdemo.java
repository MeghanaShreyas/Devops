package collectionfwdemo;


/*public class Threadingdemo {

	void meghana()
	{
		System.out.println("job3");
	}
	
	//The order of execution will not be sequential and there will be 2 threads now one main thread and another Threadingdemo.
	//The output will vary everytime its executed bcoz its decided by JVM which performs time slicing

public class Threadingdemo extends Thread			//extending thread class
{
	public void run()
	{
		System.out.println("job3");
		
	}*/

public class Threadingdemo implements Runnable		//implementing runnable interface
{
	public void run()
	{
		System.out.println("job3");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//job1
		System.out.println("Starting job1");
		
		//job2
		for(int i = 0;i<10;i++)
		{
			System.out.println("Job2"+i);
		}
		
		//job3
		Thread t = new Thread(new Threadingdemo());
		t.start();
		t.join();   		//this provides synchronization
		//job2
		for(int j = 0;j<10;j++)
		{
			System.out.println("Job4"+j);
		}
		
		//job5
		System.out.println("Starting job5");
		
	}

}
