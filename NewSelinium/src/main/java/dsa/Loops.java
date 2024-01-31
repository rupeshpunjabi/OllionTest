package dsa;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		
		// print all even numbers till n
			Scanner sc= new Scanner(System.in);
				int n=sc.nextInt();
				
			for(int i=0; i<=n; i++)
				{
					if(i%2==0)
					{
					System.out.println(i);
					}
				}
//		for(; ;) {
//            System.out.println("Apna College");
//        }

	}
}
