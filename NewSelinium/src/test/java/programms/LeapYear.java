package programms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		System.out.println("enter any year: ");
		int year;
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		
		if(year%400==0 || (year%4==0 && year%100!=0))
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" year is not a leap year");
		}
	}

}
