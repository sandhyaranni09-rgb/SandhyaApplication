package practiseBasicPrograms;

public class CountDigits {
	
	
	public int count(int number) {
		
		int count = 0;
		
		System.out.println("Given Number:"+ number);
		
		if (number ==0) {
			
			return 1;
		}
		
		//System.out.println("Given Number:"+ number);
		
		while (number !=0) {
			number = number/10;
			count++;
			
		}
		return count;
	}
	
public static void main (String [] args) {
	
	CountDigits CD = new CountDigits();
	
	int result = CD.count(0);
	
System.out.println("Total no. of Digits: "+ result);
	
}

}
