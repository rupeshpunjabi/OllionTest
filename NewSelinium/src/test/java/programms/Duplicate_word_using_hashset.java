package programms;

import java.util.HashSet;

public class Duplicate_word_using_hashset {
	public static void main(String[] args) {
		
		String array[]= {"java","selenium","java","c","c++","c"};
		
		HashSet<String> hs=new HashSet<String>();
		int count=0;
		for(String st:array)
		{
			if(hs.add(st)==false)
			{
				System.out.println(st);
				count++;
			}
		}
		System.out.println(count);
	}

}
