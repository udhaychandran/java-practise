package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Udhaya");
		names.add("George");
		names.add("Ken");
		names.add("Mark");
		names.add("Steve");
		names.add("Ethan");
		
		for (String name: names)
		{
			System.out.println(name);
			
		}
		
		Iterator<String> iterator = names.iterator();
		
		while (iterator.hasNext())
		{
			if(iterator.next().endsWith("ya"))
			{
				iterator.remove();
			}
		}
		System.out.println(names);
		
		
	}
}
