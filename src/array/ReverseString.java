package array;

public class ReverseString {

	public static void main(String[] args) throws Exception
	{
		try
		{
		String str = "Hey Dude! How are you ???";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
