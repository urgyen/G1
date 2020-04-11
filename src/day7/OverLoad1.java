package day7;

public class OverLoad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5};
		
		int sum= add(a);
		System.out.println("Output from Main Class : "+ sum);
		
//		add(1.2,2);
//		
//		add(1,2.1);
//		
//		add(1,2,3.1);
		
	}

// for two numbers	
	//Method Overloading
		//same method name..
			//argument type,no of arguemnts;
	
	
	static int add(int[] a) {
		int sum=0;
		for(int dataToBeAdded : a) {
			sum= sum+dataToBeAdded;
		}
		return sum;

	}
	
	
	
	static void add(int a, int b) {
		
		int sum=a+b;		
		System.out.println("Output from Method : "+ sum);

	}
	
	static void add(int a, double b) {
		System.out.println(a+b);
	}
	static void add(double a, int b) {
		System.out.println(a+b);
	}
	static void add(double a, double b) {
		System.out.println(a+b);
	}
	
	static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	static void add(int a, int b, double c) {
		System.out.println(a+b+c);
	}
	
	static void add(int a, int b, int c,int d) {
		System.out.println(a+b+c+d);
	}
	
}
