package programs;

public class Whileloop {

	public static void main(String[] args) {

		//print even numbers
int i=0;
while (i<10)
{

	System.out.println(i);

	i=i+2;
}



//print odd number

int j=1;
while (j<10)
{

	System.out.println(j);

	j=j+2;
}

//print ascending order
int k=0;
while (k<10)
{

	System.out.println(k);

	k=k+1;
}

//print descending order
int l=10;
while (l>0)
{

	System.out.println(l);

	l=l-1;
}

//while with continue loop
int n;
for(n=10;n<=20;n++)
{
	if (n == 15)
	{
		continue;
		
	}
	System.out.println(n);
	
	}
}
	}
	
