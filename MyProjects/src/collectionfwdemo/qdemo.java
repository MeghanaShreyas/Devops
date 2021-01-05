package collectionfwdemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class qdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue();
		
		//add
		pq.add(100);
		pq.add(200);
		pq.add(2);
		pq.add(300);
		pq.add(123);
		pq.offer(123);		 //duplicates allowed for more than once
		System.out.println(pq);  //Insertion order is preserved.
		
		//get header element
		System.out.println(pq.element());		//throws exception
		System.out.println(pq.peek());			//returns null
		
		//return and remove element from queue
		System.out.println(pq.remove());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		//to read the elements
		Iterator it = pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//for each
		for(Object o :pq)
		{
			System.out.println(pq);
		}
		
		
		
		
		
	}

}
