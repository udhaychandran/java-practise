package array;

public class SecondLargestNumberArray {

public static void main(String[] args) {
	
	int[] arr = {9,4,11,2};
	int temp = 0;
	for (int i =0;i<arr.length; i++)
	{
		for (int j=1+1;j<arr.length; j++)
		{
			if (arr[i]>arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		 
	}
	System.out.print(temp); 
}
}
