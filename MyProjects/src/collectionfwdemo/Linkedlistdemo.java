package collectionfwdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration of linkedlist
				//LinkedList <Integer> ll = new LinkedList<Integer> ();	//homogenous
				//List l = new LinkedList();
				LinkedList ll = new LinkedList();			//heterogenous
				
				//add new elements to linkedlist
				ll.add(100);
				ll.add("meghana");
				ll.add(2.3);
				ll.add('l');
				ll.add(null);
				
				System.out.println(ll);
				
				//size
				System.out.println(ll.size());
				
				//remove
				System.out.println(ll.remove(4));
				System.out.println(ll);
			
				//add elements at particular index
				ll.add(2, "meg");
				System.out.println(ll);
				
				//retriving specific value from linkedlist.
				System.out.println(	ll.get(3));
	
				//changing/replacing the element in linkedlist
				ll.set(2, "shreyas");
				System.out.println(ll);
	
				//search - contains();
				System.out.println(ll.contains("meghana"));
				System.out.println(ll.contains("meg"));
				
				//isEmpty
				System.out.println(ll.isEmpty());
				
				//to read the data using for, foreach, iterator
				//forloop
				for (int i=0;i<ll.size();i++)
				{
					System.out.println(ll.get(i));
				}
				
				//foreach loop
				for(Object o:ll)
				{
					System.out.println(o);
				}
				//iterator
				
				Iterator it = ll.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
					
				}
				
				//Add all/remove al elements from one linkedlist to another
				LinkedList aldup = new LinkedList();
				aldup.addAll(ll);
				System.out.println(aldup);
				aldup.removeAll(ll);
				System.out.println(aldup);
				
				//Sorting -- Collection.sort()
				LinkedList lll= new LinkedList();
				lll.add(1);
				lll.add(3);
				lll.add(9);
				lll.add(0);
				Collections.sort(lll);
				System.out.println(lll);
				
				//sorting in reverse order
				Collections.sort(lll,Collections.reverseOrder());
				System.out.println(lll);
				
				//shuffle the elemnts
				Collections.shuffle(lll);
				System.out.println(lll);
	
				//stack and queue operations
				ll.addFirst("tiger");
				ll.addLast("tiger");
				System.out.println(ll);
				System.out.println(ll.getFirst());
				System.out.println(ll.getLast());
				ll.removeFirst();
				ll.removeLast();
				System.out.println(ll);
						
	}
	

}
