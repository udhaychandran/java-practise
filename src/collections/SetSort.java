package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSort {

	public static void main(String[] args)
	{
		ArrayList<Character> number = new ArrayList<Character>();
		number.add('A');
		number.add('V');
		number.add('B');
		number.add('D');
		number.add('C');
		number.add('C');
		number.add('Z');
		System.out.println("The ArrayList Characters are: "+number);
		//SOrt the list
		Set<Character> character = new TreeSet<Character>(number);
		System.out.println("The value after sorting is: "+character);
		//Publish in insertion order
		Set<Character> insOrder = new LinkedHashSet<Character>(number);
		System.out.println("Display insertion order of list is: "+insOrder);
		//Publish in Hashset
		Set<Character> hash = new HashSet<>(number);
		System.out.println("Display order of list is: "+hash);
	}
}
