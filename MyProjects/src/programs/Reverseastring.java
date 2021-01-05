package programs;

public class Reverseastring {
//bubble sorting
	public static void main(String[] args) {
		/*
	int a[]= {1,35,2,5,4};
	for (int i=0;i<a.length;i++)
	{
		for(int j = 0;j<a.length-1;j++)
		{
			if (a[j]>a[j+1])
			{
				int temp;
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
		}
		System.out.println(a[i]);
	}
		*/
	
	String a = "Hello";
	  String b = "Worldmeghana";
	  
	  System.out.println("before swapping: ");
	  System.out.println("the value of a is:"+ a);
	  System.out.println("the value of b is:"+ b);
	  
	  //1. append a and b:
	  a = a+b; //HelloWorld
	  System.out.println(a);
	  //2. Store initial string a in String b:
	  b = a.substring(0, a.length()-b.length()); 
	  
	  //3. Store initial string b in String a:
	  a = a.substring(b.length());
	  
	  System.out.println("the value of a and b after swapping");
	  
	  System.out.println("the value of a is:"+ a);
	  System.out.println("the value of b is:"+ b);  
	}

}
