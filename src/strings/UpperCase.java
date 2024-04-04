package strings;

public class UpperCase {

	
	
	public static void main(String[] args) {
		
		String str = "hello world";
        // Capitalize the first characte	
		/*
		 * String cap = capitalizeWords(str); System.out.println(cap);
		 */
		String[] strArray = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		
		for (String s:strArray)
		{
			sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
		}
		System.out.println(sb);
	}
	/*
	 * public static String capitalizeWords(String str) {
	 * 
	 * 
	 * //return sb.toString(); }
	 */
	}
	