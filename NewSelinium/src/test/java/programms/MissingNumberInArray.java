package programms;

public class MissingNumberInArray {
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,6};
		
		int sum1=0;
		
		for(int i=0;i<array.length;i++)
		{
			sum1=sum1+array[i];
		}
		System.out.println("sum of given arrray is: "+sum1);
		
		int sum2=0;
		
		for(int j=0; j<=6;j++)
		{
			sum2=sum2+j;
		}
		
		int missingnumber=sum2-sum1;
		System.out.println("missing number is: "+missingnumber);
	}
}
