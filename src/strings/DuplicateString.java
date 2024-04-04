package strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	public static void main(String[] args) {
		
			String str1 = "UdhayaKumar Jeyachandran".toLowerCase();
			String str = str1.replace(" ", "");
			char[] character = str.toCharArray();
			
			Map<Character,Integer> countDuplicates = new HashMap<Character, Integer>();
			
			for (char c:character)
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
			
			for (Map.Entry<Character, Integer> entry: countDuplicates.entrySet())
			{
				if(entry.getValue()>1)
				{
					System.out.println("The character "+entry.getKey()+" and its occurence is: "+entry.getValue());
				}
			}
		
	}
}
