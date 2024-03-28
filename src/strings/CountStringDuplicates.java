package strings;

import java.util.HashMap;
import java.util.Map;

public class CountStringDuplicates {

	public static void main(String[] args) {
		
		String baseStr = "My name name is is Udhayakumar Jeyachandran.".toLowerCase();
		System.out.println("After lowercase conversion: "+baseStr);
		String[] charString = baseStr.split(" ");
		System.out.println("After charArray conversion: ");
		for (String s: charString)
		{
			System.out.println(s);
		}
		Map<String,Integer> countWords = new HashMap<>();
		for (String c:charString)
		{
			if(countWords.containsKey(c))
			{
				countWords.put(c, countWords.get(c)+1);
			}
			else
			{
				countWords.put(c, 1);
			}
		}
		System.out.println(countWords);
		for (Map.Entry<String, Integer> entry: countWords.entrySet()) {
			if (entry.getValue()>1)
			{
				System.out.println("The word "+entry.getKey()+" and the value is: "+entry.getValue());
			}
		}
	}
}
