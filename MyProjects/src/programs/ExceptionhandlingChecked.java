package programs;

public class ExceptionhandlingChecked {

	public static void main(String[] args) throws InterruptedException {       //Handling exception using throws keyword
		// TODO Auto-generated method stub
		System.out.println("Meghana");
		
		
		Thread.sleep(5000);							//interrupted exception
		
		//Handling exception using try catch block
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("Shreyas");

	}
}
