package collections;

import java.util.HashMap;
import java.util.Map;

public class MapCountOccurance {

	public static void main(String[] args) {
		
		String str = " This is my first ever practise program for Maps." + " Howz it buddy?";	
		Map<Character,Integer> occurance = new HashMap<>();
		char[] characters = str.toCharArray();
		//System.out.println("AFter String to Charcter conversion: ");
		System.out.println(characters);
		for (char character: characters)
		{
			Integer integer = occurance.get(character);
			if (integer==null)
			{
				occurance.put(character, 1);
			}
			else {
				occurance.put(character, integer+1);
			}
		}
		System.out.println(occurance);
	}
	
}
