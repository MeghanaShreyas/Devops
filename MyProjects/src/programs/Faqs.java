package programs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Faqs {

	public static void main(String[] args) throws IOException {
	
		/*//Reverse a string
		System.out.println("Please enter the string");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int length = s.length();
		String reverse = "";
		System.out.println(length);
		for (int i=length-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i);
			
		}
	System.out.println(reverse);
	
	//swap the number
	int a= 10;
	int b = 20;
	int temp=0;
	temp=a;
	a=b;
    b=temp;
	System.out.println(a);
	System.out.println(b);
	
	
	//2.reverse the number
	int num=12345;
	int count =0;
	while (num!=0)
	{
	int digit = num%10;
	count = count * 10+ digit;
	num = num/10;
	}
	System.out.println(count);*/
	
	/*
	//palindrom number

	int number = 123221;
	int reversed = 0;
	int original = number;
	while(number!=0)
	{
		int t = number%10;
		reversed= reversed *10 + t;
	
	 number= number/10;
	}
	System.out.println(reversed);
	if (original == reversed)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrom");
	}
	
	}*/
	//palindrome of String
	/*System.out.println("Please enter the string");
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	String meg = s;
	int length = s.length();
	String reverse = "";
	System.out.println(length);
	for (int i=length-1;i>=0;i--)
	{
		reverse = reverse + s.charAt(i);
	}
	System.out.println(reverse);
	System.out.println(s);
	
	if (meg.equals(reverse))
	{
		System.out.println("pal");
	}
		else
		{
			System.out.println("not palin");
		}
	

	int digit =8;
	int yum = 0;
	{
	while(digit>0)
	{
		yum = yum +1;
		digit = digit/10;
	}
System.out.println(yum);

System.out.println(1234%10);
}
	//count number of even and odd digit in a number
	int numbs = 24681;
	int evencount = 0;
	int oddcount = 0;
	
	while(numbs>0)
	{
	if(numbs %2 == 0)
	
	{
		evencount=evencount+1;;
	}
	else
	{
		oddcount+=1;
	}
	numbs=numbs/10;
	}
	
	System.out.println(evencount);
	System.out.println(oddcount);
	

		//to count the sum of digits in a given number
		int uma = 1231;
		int c = 0;
		//int p = uma% 10;
		while (uma>0)
		{
			int p = uma%10;
			if(p%10 >0)
			{
				c = c + p; 
			}
	uma = uma/10;
		}
	System.out.println(c);

		int qw=1000;
		int we=23;
		int er=3;
		if ((qw > we) & (qw > er))
		{
			System.out.println("qw");
		}
		else if((we>qw) & (we > er))
		{
			System.out.println("we");
		}
		else
		{
			System.out.println("er");
		}
	

		//fibonacci sequence
		int n1=0;
		int n2=1;
		int summ=0;
		System.out.println(n1);
		System.out.println(n2);
		for (int i=2;i<=10;i++)
		{
			summ = n1+n2;
			System.out.println(summ);
			n1=n2;
			n2=summ;
		}

		//prime or not
		int n3 = 0;
		int count =0;
		if (n3>1)
		{
			for (int i =1;i<=n3;i++)
			{
				if(n3%i==0)
					count++;
			}
			
			System.out.println(count);
			if (count ==2)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("not prime");
			}}
		else
			{
				System.out.println("not a prime number");
			}
			
			
		//factorial of a number
		int numbers = 4;
		int fact = 1;
		for (int i=1;i<=numbers;i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
		
		
		//sum of elements in an array
		int a[]= {1,2,3,4,5};
		int sum = 0;
		for (int i = 0;i<5;i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);
		
		//print even and odd numbers in an array list
		int b[]= {1,2,3,4,5};
		int evencount = 0;
		int oddcount = 0;
		for (int i=0;i<5;i++)
		{
			if (b[i]%2 ==0)
			{
				evencount = evencount +1;
				System.out.println("Even number"+ b[i]);
			}
			else
			{
				oddcount = oddcount +1;
				System.out.println("Odd number"+ b[i]);
			}
		
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}
	
		//check if arrays are equal or not
		int a[]= {1,2,9,4,5,10};
		int b[]= {1,2,3,4,5};
		int count =0;
		if(a.length == b.length)
		{
			for (int i = 0;i<5;i++)
			{
				if (a[i]==b[i])
				{
				
				count = count+1;
				}
	
			}}
		else
		{
			System.out.println("not in proper length()");
		}
		
		
		if (count ==5)
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
		
		
		//find the missing number in the range of numbers
		
		int a[]= { 1,2,3,4,5};
		int sum = 0;
		int sum1=0;
		int range = 5;
		for (int i=0;i<5;i++)
		{
			sum= sum+a[i];
		}
		System.out.println(sum);
		for (int j=1;j<=range;j++)
		{
			sum1=sum1+j;
		}
		System.out.println(sum1);
		int missing = sum1-sum;
		System.out.println(missing);
	
		
		
		//max and min value in an array
		int a[]= {1,2,3,4,5};
		int min = a[0];
		int max = a[1];
		for (int i=0;i<=4;i++)
		{
			if (a[i]<min)
			{
				min = a[i];
			
			}
	
			if (a[i]>max)
			{
				max = a[i];
			}
	}	
		System.out.println(min);
		System.out.println(max);
		}

		//find duplicates in an array
		int a[]= {1,2,3,4,4};
		for (int i = 0;i<5;i++)
		{
			for (int j=i+1;j<5;j++)
			{

			if (a[i]== a[j])
			{
				System.out.println(a[i]);
			}
			
			}
		}
		
		
		//binary search
		
		int a[]= {1,2,3,4,5,6};
		boolean flag = true;
		int low=0;
		int high=a.length-1;
		int mid = (low+high)/2;
		int key = 5;
		while (low<=high)
		{
			if (key == a[mid])
		{
			System.out.println("key found");
			flag = true;
			break;
		}
			if (key>a[mid])
			{
				low = mid+1;
			}
		if (key<a[mid])
		{
			high = mid-1;
		}
		}
		if (flag == false)
		{
			System.out.println("element not found");
		}
		
		
		
		//bubble sort
		int a[] = {5,1,2,3,4,6};
		int n = a.length;
		//Arrays.parallelSort(a);
		//Arrays.sort(a);			//built in function alternative
		//System.out.println(Arrays.toString(a));
		for (int i = 0;i<n-1;i++)
		{
			for (int j = 0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		//removing a junk/special character in a string
		String s = "@#$%&0123 meghana ^#()@&$(";
		String sasy = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(sasy);
	
		//remove whitespaces in a string
		String s = "meghana      shreyas";
		String sasy = s.replaceAll("\\s", "");   //\s means spaces
		System.out.println(sasy);
	
		//count occurance of a character in a string
	String s = "Meghanashreyas";
	int sasy = s.replaceAll("a", "").length();				//replace the character to search with ""
	int m = s.length();
	int aoccurance = m-sasy;
	System.out.println(aoccurance);
	
	//count number of words in a string
	String s = "Welcome to java m";
	int count=1;
	for(int i = 0;i<s.length()-1;i++)
	{
		if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))			//logic is there should be space and a letter after that will be considered
		{
			count++;
		}
	}
	System.out.println(count);
	
	
	//read the data from text file
		FileReader fr = new FileReader("E:\\AWS\\meg.txt");
		BufferedReader bf = new BufferedReader(fr);
		String s;
		while((s= bf.readLine())!=null)
{
	System.out.println(s);
}
	bf.close();	
*/
	//write the data into a text file
	FileWriter fw = new FileWriter("E:\\AWS\\meg.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("hiiiii");
	System.out.println("finished");
	bw.close();
	
	}}