package dsa;

import java.util.Scanner;

public class ElseIF {

		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			
			int a=sc.nextInt();
//			int b= sc.nextInt();
//			
//			int sum=a+b;
//			int sub=a-b;
//			int mul=a*b;
//			int mod=a%b;
//			
//			System.out.println(sum);
//			System.out.println(sub);
//			System.out.println(mul);
//			System.out.println(mod);
			
			switch(a)
			{
			case 1: System.out.println("january");
			break;
			case 2: System.out.println("february");
			break;
			case 3: System.out.println("march");
			break;
			case 4: System.out.println("april");
			break;
			case 5: System.out.println("may");
			break;
			case 6: System.out.println("june");
			break;
			case 7: System.out.println("july");
			break;
			case 8: System.out.println("august");
			break;
			case 9: System.out.println("september");
			break;
			case 10: System.out.println("octomber");
			break;
			case 11: System.out.println("november");
			break;
			case 12: System.out.println("December");
			break;
			
			default: System.out.println("invalid number");
			}
			
		}
}
