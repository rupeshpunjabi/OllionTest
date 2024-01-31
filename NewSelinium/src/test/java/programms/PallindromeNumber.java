package programms;

public class PallindromeNumber {
	public static void main(String[] args) {
		
		int num=1111;
		
		int orgnum=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse of given number is: "+rev);
		
		if(orgnum==rev)
		{
			System.out.println("given number: "+orgnum+" is pallindrome number");
		}
		else
		{
			System.out.println(orgnum+" given number is not pallindrome");
		}
	}

}
