package array;

public class Vowels {

	public static void main(String[] args) {
		
		String str = "Udhayakumar";
		int count =0;
		System.out.println("The vowels are:");
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u')
			{
				count++;
				System.out.print(str.charAt(i)+" "+count);
			}
			
		}
		

	}

}
