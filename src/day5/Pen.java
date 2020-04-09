package day5;
public class Pen {

	//blueprint
	
	//state
	//instance variable
	String color;
	int volOfInk;
	//0 --> change the refill

	//behaviour
	static void write() {
		System.out.println("Writing");
	}
	
	 void colorOfPen() {
		System.out.println("Color of Pen is:  "+ color );
	}
	
	 void colorInkStatus() {
		 if(volOfInk!=0) {
			 System.out.println("Keep Writing");
		 }
		 else {
			 System.out.println("Change the Refill");
		 }
	 }
	
	
	
}
