package strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		
		String str = "UdhayaKumar Jeeyachandraan";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (char c:str.toCharArray())
		{
			set.add(c);
		}
		
		
		StringBuilder result = new StringBuilder();
		
		for(char c:set)
		{
			result.append(c);
		}
		System.out.println(result);
	}
}
