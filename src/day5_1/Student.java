package day5_1;

public class Student {

	//state
	String name;
	int age;
	String address;
	
	//behaviour
	
	void printStudentDetails() {
		//System.out.println(name  + "--"+ age + "-" + address);
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Address: "+ address);

		
		//save to database;
	}
	
	void studies() {
		System.out.println("Studying");
	}
	
	//
//	void sleeps() {
//		System.out.println("Works");
//	}
	
	
	
	
}
