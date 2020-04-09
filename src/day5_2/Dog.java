package day5_2;

public class Dog {

	//state
	String name;
	String breed;
	int age;
	
	
	//behaviour
	
	void dogDetails() {
		System.out.println(name + "---- " + breed);
		//reurn1;
	}
	
	//on the basis of age{}
	void barks() {
		if(age<4) {
			System.out.println("Bhaw bhaw");
		}
		else if(age < 8) {
			System.out.println("Bhaw bhaw bhaw bhaw");
		}
		else {
			System.out.println("I am old.");
		}
	}
	
	
	
	
}
