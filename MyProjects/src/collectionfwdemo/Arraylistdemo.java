package collectionfwdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration of Arraylist
		//ArrayList <Integer> ai = new ArrayList<Integer> ();	//homogenous
		//List l = new ArrayList();
		ArrayList al = new ArrayList();			//heterogenous
		
		//add new elements to arraylist
		al.add(100);
		al.add("meghana");
		al.add(2.3);
		al.add('l');
		al.add(null);
		
		System.out.println(al);
		
		//size
		System.out.println(al.size());
	
		//remove
		//System.out.println(al.remove(2));
		
		//add elements at particular index
		al.add(2, "meg");
		System.out.println(al);
		
		//retriving specific value from arraylist.
		System.out.println(	al.get(3));
		
		//changing/replacing the element in arraylist
		al.set(2, "shreyas");
		System.out.println(al);
		
		//search - contains();
		System.out.println(al.contains("meghana"));
		System.out.println(al.contains("meg"));
		
		//isEmpty
		System.out.println(al.isEmpty());
		
		
		//to read the data using for, foreach, iterator
		//forloop
		for (int i=0;i<al.size();i++)
		{
			System.out.println("Reading elements using for loop"+al.get(i));
		}
		
		//foreach loop
		for(Object o:al)
		{
			System.out.println("reading elements using foreach loop"+o);
		}
		//iterator
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println("Reading elements using Iterator"+it.next());
			
		}
		
		//Add all/remove al elements from one arraylist to another
		ArrayList aldup = new ArrayList();
		aldup.addAll(al);
		System.out.println(aldup);
		aldup.removeAll(al);
		System.out.println(aldup);
		
		
		//Sorting -- Collection.sort()
		ArrayList all= new ArrayList();
		all.add(1);
		all.add(3);
		all.add(9);
		all.add(0);
		Collections.sort(all);
		System.out.println(all);
		
		//sorting in reverse order
		Collections.sort(all,Collections.reverseOrder());
		System.out.println(all);
		
		//shuffle the elemnts
		Collections.shuffle(all);
		System.out.println(all);
		
		//converting array elements to array list
		String arr[] = {"meghana","uma","shreyas"};
		for(String s : arr)
		{
			System.out.println(s);
		}
		ArrayList aal = new ArrayList(Arrays.asList(arr));
		System.out.println("Array into Arrylist"+aal);
	
	}
	
	

}
