package collectionfwdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		//Declaration of HashSet
		//HashSet <Integer> hs = new HashSet<Integer> ();	//homogenous
		//HashSet hs = new HashSet(100,(float)0.9);  //declaring the load factor
		HashSet hs = new HashSet();	//heterogenous, 16 memory , 0.75 load factor
		
		//adding elements
		hs.add(100);
		hs.add("meghana");
		hs.add(2.3);
		hs.add('l');
		hs.add(null);
		hs.add('l');			 //duplicates not allowed for more than once
		System.out.println(hs);  //insertion order not preserved
	
		//remove
		hs.remove(2.3);
		System.out.println(hs);
	
		//contains = boolean
		System.out.println(hs.contains(null));
		System.out.println(hs.contains("mfsjkd"));
		
		//size
		System.out.println(hs.size());
	
		//to read the elements from hashset
		//foreach loop
				for(Object o:hs)
				{
					System.out.println(o);
				}
				//iterator
				
				Iterator it = hs.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
					
				}
	
				//Add all/remove al elements from one arraylist to another
				HashSet aldup = new HashSet();
				aldup.addAll(hs);
				aldup.add("uma");
				System.out.println(aldup);
				aldup.removeAll(hs);
				System.out.println(aldup);
				
				
				//union intersection and difference
				HashSet set1= new HashSet ();
				set1.add(1);
				set1.add(3);
				set1.add(9);
				set1.add(0);
				set1.add(5);
				
				HashSet set2= new HashSet ();
				set2.add(0);
				set2.add(3);
				set2.add(9);
				set2.add(10);
				
				//union
				set1.addAll(set2);
				System.out.println(set1);
				
				//intersection
				set1.retainAll(set2);
				System.out.println(set1);
	
				//difference
				set1.removeAll(set2);
				System.out.println(set1);
				
				//subset
				set1.containsAll(set2);
				System.out.println(set1);
				
				
	
	
	
	
	
	
	
	}
	
	

}
