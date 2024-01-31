package programms;

public class Duplicate_element_in_array {
	
	public static void main(String[] args) {
		
		String array[]= {"java","python","selenium","java","c","c++","c"};
		
		int arraylength=array.length;
		int count=0;
		for(int i=0; i<arraylength; i++)
		{
			for(int j=i+1;j<arraylength;j++ )
			{
				if(array[i]==array[j])
				{
					count++;
					System.out.println(array[i]);
				}
			}
			
		}
		System.out.println(count);
	}

}
