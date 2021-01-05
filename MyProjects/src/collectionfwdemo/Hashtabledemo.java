package collectionfwdemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashtable t = new Hashtable(initial capacity, load factor);
		Hashtable <Integer, String> ht = new <Integer,String> Hashtable();
		//Hashtable ht = new Hashtable();
		
		
		ht.put(100,"a");
		ht.put(101,"b");
		ht.put(102,"c");
		ht.put(103,"d");
		ht.put(104,"e");
		ht.put(108, "a");		//duplicate values
		ht.put(103, "m");	//duplicate keys
		//ht.put(null, null); //null pointer excetion Null not allowed.
		System.out.println(ht);	//Insertion order not preserved.
		
				//retrieve
				System.out.println(ht.get(103));
				
				//remove
				System.out.println(ht.remove(104));
				System.out.println(ht);
				
				//to check if it contains keys
				System.out.println(ht.containsKey(109));
				System.out.println(ht.containsKey(108));
				
				//to check if it contains value
				System.out.println(ht.containsValue("a"));
				System.out.println(ht.containsValue("meghana"));
				
				//is empty or not
				System.out.println(ht.isEmpty());
				
				System.out.println(ht.keySet());	//returns all the keys in set format
				System.out.println(ht.values());	//returns all the values in collection format
				
				System.out.println(ht.entrySet());  //return all entries as a set
				
				for(Object i : ht.keySet())
				{
					System.out.println(i+"   "+ht.get(i));
				}
				
				for (Object ii : ht.entrySet())
				{
					System.out.println(ii);
				}
				//Entry specific method
				for (Map.Entry meg : ht.entrySet())
				{
					System.out.println((meg.getKey()+"  "+meg.getValue()));
				}
				//Iterator()
				Set s = ht.entrySet();
				Iterator it = s.iterator();
				while(it.hasNext())
				{
					Map.Entry meg = (Entry) (it.next());
					System.out.println("Iteration method"+ meg.getKey()+"   "+meg.getValue());
				}
				
				}
		
		
		
		
		
		
		
		
		
	}

