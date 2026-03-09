package practiseBasicPrograms;

public class FibonacciSeries {

	public void series(int n){
		
		int firstnumber= 0;
		int secondnumber = 1;
		int nextnumber;
		
		for (int i= 0; i <= n; i++) {
			
			nextnumber = firstnumber+secondnumber;
			
			//System.out.print("Fibonacci Series: "+nextnumber+ " ");
			System.out.println(nextnumber+ " ");
			
			firstnumber=secondnumber;  //Ex:it is 1 instead of 0
			secondnumber=nextnumber;   //Ex: it takes 1 as well
		}
		
	//System.out.println();
	}
		public static void main(String[] args) {
			
			FibonacciSeries FS = new FibonacciSeries();
			
			FS.series(10);
		}
				
	}
