package strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Please enter the string to check if the given string is palindrone: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse ="";
		
		for (int i=str.length()-1;i>=0;i--)
		{
			reverse = reverse+str.charAt(i);
		}	
		if (str.equals(reverse))
		{
			System.out.println("The string "+str+" is palindrome");
		}
		else
		{
			System.out.println("The string "+str+" is not palindrome");
		}
	}
}
