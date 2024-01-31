package programms;

public class CountCharacter {
	public static void main(String[] args) {
		
		String name="my name is rupesh ajay punjabi";
		int orglength= name.length();
		
		String nameaftera= name.replaceAll("a","");
		int afteraccount= nameaftera.length();
		
		int numberofa=orglength-afteraccount;
		
		System.out.println("number of times a letter present is: "+numberofa);
		
	}

}
