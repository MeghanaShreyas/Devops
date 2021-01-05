package programs;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single array declaration
		int a[] = new int[5];
		a[0] = 1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for (int i =0;i<5;i++)
		{
			System.out.println(a[i]);
			
		}
		//using foreach loop
		for(int i : a )
		{
		System.out.println(i);
	}
		//using string array
		String s[] = new String[3];
	 s[0] = "welcome";
	 s[1] = "to";
	 s[2] = "Marriott";
for (String i:s)
{
	System.out.println(i);
	//to find the length of an array
	System.out.println(a.length);
}
//when there is no fixed value of elements
int m[] = {1,2,3,4,5};
for (int n : m)
{
	System.out.println(n);
	

}

//different data types - Object data type
Object z[] = new Object[5];
z[0]='t';
z[1]="welcome";
z[2]= true;
for(Object u :z)
{
	System.out.println(u);
}
	}
}