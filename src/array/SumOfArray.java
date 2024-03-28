package array;

public class SumOfArray {

	public static void main(String[] args) {
		
		try 
		{
			int[] number = {1,2,3,4,5};
			int temp=0;
			for (int num :number)
			{
				temp+=num;
			}
			System.out.println(temp);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
