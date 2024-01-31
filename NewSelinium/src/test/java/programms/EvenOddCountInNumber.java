package programms;

public class EvenOddCountInNumber {
	
	public static void main(String[] args) {
		
		int num=123456;
		int evencount=0;
		int oddcount=0;
		
		while(num>0)
		{
			int reminder=num%10;
			
			if(reminder%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("even count is: "+evencount);
		System.out.println("odd count is : "+oddcount);
	}
}
