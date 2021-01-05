package programs;

import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();		//Array declaration
		list.add("Meghanna");					//Adding elements to array
		list.add("Shreyas");
		System.out.println(list.size());		//Size of the arraylist
		list.add(1,"Ullasini");					//Adding elements to arraylist
		System.out.println(list);
		list.remove(2);							//Removing elements in the arraylist
		System.out.println(list);
		for (Object s: list)					//Printing each elements in the list
		{
			System.out.println(s);
		}
		}
		
		
	}

