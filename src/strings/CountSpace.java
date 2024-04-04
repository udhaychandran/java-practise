package strings;

public class CountSpace {

	public static void main(String[] args) throws StringIndexOutOfBoundsException{
		
			String str = "My name ";
			int count =0;
			for ( int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==' ')
				{
				count++;
				}
			}
			System.out.println("The number of space in the string is: "+count);
		
	}
}
