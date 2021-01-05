package programs;

import java.util.HashMap;
import java.util.Map;

public class Hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> hm = new HashMap <Integer,String> (); 	//hashmap declaration
		hm.put(101, "ji");												//Adding values to hashmap
		hm.put(102, "kii");
		hm.put(103, "kuuu");
		
		hm.remove(103);													//removing values from hashmap
		
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+" " +m.getValue());
		}
				

	}

}
