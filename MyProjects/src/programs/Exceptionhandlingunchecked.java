package programs;

public class Exceptionhandlingunchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unchecked exception");
		
	////Arithmetic exception/////
		int a = 10;
		try
		{
		System.out.println(a/0); 					
		}
		catch(Exception e)
		{
			System.out.println("It was an exception");
		}
		finally
		{
			System.out.println("I wll always be executed");
		}
		
		////Null pointer exception////
		String s = null ;
		try
		{
		System.out.println(s.length());				
		}
		catch(Exception e)
		{
			System.out.println("It was an exception");
		}
		finally
		{
			System.out.println("I wll always be executed");
		}
		
		////Number format exception////				
		String sw = "123" ;  						//Here 123 is string
		int i = Integer.parseInt(sw);
		String ss = "abc" ;  						//Here abc is string
		try
		{
		int ii = Integer.parseInt(ss);				//it will throw number format exception as abc cant be integer.
		}
		catch(Exception e)
		{
			System.out.println("It was an exception");
		}
		finally
		{
			System.out.println("I wll always be executed");
		}
		
		
		//ArrayIndexOutOfBound Exception..////
		int aa[]= new int[5];
		try
		{
		aa[8]=50;									//Arrayindexoutofboundexception
		}
		catch(Exception e)
		{
			System.out.println("It was an exception");
		}
		//finally usage
		//exception doesnot occur
		finally
		{
			System.out.println("I wll always be executed");
		}
		
		/*exception occured but didnot handled
		catch(NullPointerException n)
		{
			System.out.println("Its a nullpointerexception");
		}
		finally
		{
			System.out.println("I wll always be executed");
		}
		
		//Exception occured and handled
		catch(ArrayIndexOutOfBoundsException q)
		{
			System.out.println("Its array exception");
		
		}
		finally
		{
			System.out.println("I wl always be executedsjdhn");
		}*/
		System.out.println("Arithmetic exception");  // this statement will not be executed if exception occured but didnot handled
		
	}

}
