package javaProgramme;

public class AdditionOfArray {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int sum=0;
		
/*		for (int a:arr)
		{
			sum=a+sum;
		}
	System.out.println(sum);*/
	
	for(int i=0; i<arr.length; i++)
	{
		sum=sum+arr[i];
	}
	System.out.println(sum);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
