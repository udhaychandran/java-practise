package array;

public class AlternateOccurance {

	public static void main(String[] args)
	{
		String str = "Udhaya";
		
		for(int i = 0;i<str.length();i=i+2)
		{
			System.out.println(str.charAt(i));
		}
	}
}
