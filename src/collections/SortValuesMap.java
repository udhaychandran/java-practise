package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortValuesMap {

	public static void main(String[] args)
	{
		Map<Integer, String> values = new HashMap();
		values.put(21,"George");
		values.put(23,"Ken");
		values.put(1,"Mark");
		values.put(65,"Steve");
		values.put(2,"Ethan");
		System.out.println(values);
		
		Map<Integer, String> value = new TreeMap<Integer, String>(values);
		System.out.println(value);
	}
	
	//Iterator<Integer,String> itr = new Iterator<E>();
	
}
