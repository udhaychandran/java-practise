package collections;

import java.util.HashMap;
import java.util.Map;

public class MapsCountStringOccurance {

	public static void main(String[] args) {
		
		String str = "This my second program for Maps to find String occurances. "+"Its been a while I thought to learn Maps. " + "This is how it works a !";
		System.out.println(str);
		
		Map<String,Integer> stringOccurances = new HashMap<>();
		String[] splitString = str.split(" ");
		for (String checkStr: splitString)
		{
			Integer interger = stringOccurances.get(checkStr);
			if (interger==null)
			{
				stringOccurances.put(checkStr, 1);
			}
			else
			{
				stringOccurances.put(checkStr, interger+1);
			}
		}
		System.out.println(stringOccurances);
		
	}
}
