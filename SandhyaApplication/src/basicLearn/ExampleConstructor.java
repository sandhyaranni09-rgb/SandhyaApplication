package basicLearn;

public class ExampleConstructor {
	
	int a;
	int b;
	String Name;
	
	public void Test1(int num, int num2) {
		
		a=num+num2;	
		
		System.out.println("Value of a is: " + a);
		
	}
	
	public ExampleConstructor(){
		
		int a= 10;
		int b = 5;
		int c= a+b;
		
		System.out.println("Addition of the two number is"+ c);
	
	}

	public static void main() {
		ExampleConstructor EC= new ExampleConstructor();
		EC.Test1(5, 6);
	
		
	}

}
