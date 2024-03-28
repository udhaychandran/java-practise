package collections;

import java.util.HashMap;
import java.util.Map;

public class WordsAndOccurence {

	public static void main(String[] args) {
		String str = "My Name is Udhayakumar Jeyachandran. Im passionate about automation. Is my thought is correct".toLowerCase();
		String[] sentence = str.split(" ");
		for (String a:sentence)
		{
			System.out.println(a);
		}
		Map<String,Integer> countOccurence = new HashMap<>();
		for (String s:sentence)
		{
			if(countOccurence.containsKey(s))
			{
			countOccurence.put(s, countOccurence.get(s)+1);
			}
			else
			{
				countOccurence.put(s, 1);
			}
		}
		System.out.println(countOccurence);
		
		for (Map.Entry<String, Integer> entry: countOccurence.entrySet())
		{
			if (entry.getValue()>1)
			{
				System.out.println("The duplicate key "+ "'"+entry.getKey()+"'"+" and the occurence is: "+entry.getValue());
			}
		}
	}
}
