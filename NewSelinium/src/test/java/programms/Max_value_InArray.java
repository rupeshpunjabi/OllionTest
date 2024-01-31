package programms;

public class Max_value_InArray {
	public static void main(String[] args) {
		
		int array[]= {10, 5, 40, 35, 80, 90, 75};
		
		int max=array[0];
		
		for(int i=0; i<array.length;i++)
		{
			if(max<=array[i])
			{
				max=array[i];
			}
		}
		System.out.println("maximum number in array is: "+max);

		int min =array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(min>=array[i])
			{
				min=array[i];
			}
		}
		System.out.println("minimum number in the given arrya is : "+min);
	
	
	}
}
