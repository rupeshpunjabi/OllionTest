package programms;

public class ReverseString {
	public static void main(String[] args) {
		
		String name="madam";
		
		String orignal=name;
		
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("reverse of given string is: "+rev);
		
		if(rev.equals(orignal))
		{
			System.out.println(orignal+" -is a pallindrome string");
		}
		else
		{
			System.out.println(orignal+" -is not a pallindrome string");
		}
	}

}
