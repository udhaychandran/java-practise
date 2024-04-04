package strings;

public class DuplicateOccurance {

	public static String addDuplicate(String str) throws StringIndexOutOfBoundsException
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			for (int j=0;j<=i;j++)
			{
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
        String str = "Udhaya";
        String display = addDuplicate(str);
        System.out.println(display);
        
	}
}
