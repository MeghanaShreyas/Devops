package collectionfwdemo;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs = new LinkedHashSet();
		
		//adding elements
				lhs.add(100);
				lhs.add("meghana");
				lhs.add(2.3);
				lhs.add('l');
				lhs.add(null);
				lhs.add('l');			 //duplicates not allowed for more than once
				System.out.println(lhs);  //insertion order preserved
			
		
	}

}
