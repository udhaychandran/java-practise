package array;

public class LargestNumberArray {

	public static void main(String[] args) {
		
		int[] arr = {9,4,11,2};
		int max = arr[0];
		for (int i =0;i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
			 
		}
		System.out.print(max); 
	}
}
