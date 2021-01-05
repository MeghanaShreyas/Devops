package collectionfwdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap hm = new HashMap();
		HashMap <Integer,String> hm = new <Integer,String> HashMap();
		hm.put(100,"a");
		hm.put(101,"b");
		hm.put(102,"c");
		hm.put(103,"d");
		hm.put(104,"e");
		hm.put(108, "a");		//duplicate values
		hm.put(103, "m");		//duplicate keys
		System.out.println(hm);
		
		//retrive
		System.out.println(hm.get(103));
		
		//remove
		System.out.println(hm.remove(104));
		
		//to check if it contains keys
		System.out.println(hm.containsKey(109));
		System.out.println(hm.containsKey(108));
		
		//to check if it contains value
		System.out.println(hm.containsValue("a"));
		System.out.println(hm.containsValue("meghana"));
		
		//is empty or not
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.keySet());	//returns all the keys in set format
		System.out.println(hm.values());	//returns all the values in collection format
		
		System.out.println(hm.entrySet());  //return all entries as a set
		
		//to read indivisual elements as set
		for(Object  i : hm.keySet())
		{
			System.out.println(i);	
		}
		for(Object o : hm.values())
		{
			System.out.println(o);
		}
		//entry method
		for (Map.Entry g: hm.entrySet())
		{
			System.out.println(g.getKey()+"  "+ g.getValue());
		}
		for (Object ii : hm.keySet())
		{
			System.out.println(ii+"   "+hm.get(ii));
		}
		
		
		
		}
	}
