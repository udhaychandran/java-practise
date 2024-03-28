package collections;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {

	public static void main(String[] args) {
		
		String text = new String("Automation Testing").toLowerCase();
		String sentence = text.replaceAll(" ","");
		System.out.println(sentence);
		char[] charArray = sentence.toCharArray();
		System.out.println(charArray);
		//Create map to count duplicates
		Map<Character,Integer> countDuplicates = new HashMap<>();
		
		for (char c: charArray)
		{
			if (countDuplicates.containsKey(c))
			{
				
				countDuplicates.put(c, countDuplicates.get(c)+1);
			}
			else
			{
				countDuplicates.put(c, 1);
			}
		}
		
		System.out.println(countDuplicates);
		for (Map.Entry<Character,Integer> entry: countDuplicates.entrySet())
		{
			if (entry.getValue()>1)
			{
				System.out.println("The character "+entry.getKey()+" and the occurence is: "+entry.getValue());
			}
		}
	}
}
