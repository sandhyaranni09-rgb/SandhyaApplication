package practiseBasicPrograms;

public class Swapping {
	
	public void numberSwap(int number1, int number2) {
		
		int a= number1;//5
		int b= number2;//10
		
		System.out.println("Before Swapping "+ "a="+ a +" and "+ "b="+ b);
		
		a=a+b; //15
		b=a-b;//5
		a=a-b;
		
		System.out.println("After Swapping " + "a="+ a +" and "+ "b="+ b);
		
		
	}

	public static void main(String[] args) {
		Swapping swap = new Swapping();
		swap.numberSwap(10, 30);
		
	}
}
