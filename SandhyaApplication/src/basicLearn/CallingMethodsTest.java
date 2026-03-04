package basicLearn;

public class CallingMethodsTest {

	
	public static void main(String[] args) {

		//System.out.println("This is my Print Statement:");

		// For calling Non-static variable into Static method
		Test print = new Test();

		int Variablename = print.age;

		System.out.println(print.age);

		// Calling Static variable to Static
		System.out.println(Test.name);

		//Calling Non-static method into static method
		Test print2 = new Test();
		print2.print();
		
		//Calling static method into static
		Test.print();
	}
	
}
