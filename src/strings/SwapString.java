package strings;

public class SwapString {

	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		
		String str1 = "Udhaya";
		String str2 = "Chandran";
		
		System.out.println("The String1 value before swap: "+str1);
		System.out.println("The String2 value before swap: "+str2);
		
		str1 = str1+str2;
		System.out.println("Adding both strings: "+str1);
		str2 = str1.substring(0,str1.length()-str2.length());
		System.out.println("Adding both strings: "+str2);
		str1 = str1.substring(str2.length());
		//System.out.println(str1);
	}
}
