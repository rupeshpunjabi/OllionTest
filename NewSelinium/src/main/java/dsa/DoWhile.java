package dsa;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int input;
		
		do
		{
			int marks=sc.nextInt();
			
			if(marks>=90 && marks<=100)
			{
				System.out.println("this is good");
			}
			else if(marks>=60 && marks<=89)
			{
				System.out.println("This is also good");
				
			}
			else if(marks>=0 && marks<=59)
			{
				System.out.println("This is good as well");
			}
			else
			{
				System.out.println("invalid marks");
			}
			
			System.out.println("do you want to continue if yes then type(1) and if no then type(0)");
			input=sc.nextInt();
		}
		while (input==1);
		
	}

	
}
