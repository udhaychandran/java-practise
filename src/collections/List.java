package collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Udhaya");
		names.add("George");
		names.add("Ken");
		names.add("Mark");
		names.add("Steve");
		names.add("Ethan");
		System.out.println("The names stroed in the arrayList are: "+names);
		System.out.println("The first names is: "+names.get(0));
		System.out.println("The names deleted at index 2 is: "+names.get(2));
		names.remove(2);
		names.add(4, "Bob");
		System.out.println("The updated names in the Array List are: "+names);
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Deer");
		animals.add("Hippo");
		animals.add("Croc");
		animals.add("Monkey");
		System.out.println("The animals in new arrayLists are: "+animals);
		names.addAll(animals);
		System.out.println("The updated arrayList after concat two arrayLists are: ");
		System.out.println(names);
		System.out.println(names.size());
		
	}
}
