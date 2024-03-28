package collections;

import java.util.*;
public class RemoveDuplicateInList {

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList();
		list.add("kim");
		list.add("jin");
		list.add("jet");
		list.add("jet");
		list.add(1, "kudi");
		System.out.println(list);
		
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
	}
}

