package programms;

import java.util.Scanner;

public class NumberOfWords {
	public static void main(String[] args) {
		
		System.out.println("enter a statement");
		Scanner sc= new Scanner(System.in);
		String sentence= sc.nextLine();
		
		
		int num=1;
		
		for(int i=0; i<=sentence.length()-1;i++)
		{
			if((sentence.charAt(i)==' ')&&(sentence.charAt(i+1)!=' '))
			{
				num++;
			}
		}
		System.out.println(num);
	}

}
