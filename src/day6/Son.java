package day6;

public class Son extends Father{
//	
//	age ==	20 ;; plays
//	20 +  40 == ghumne;
//	40+

	//age??
	
//	//Override
//	void eats() {
//		System.out.println("Eats Wai Wai");
//	}
	
	void howDoesHeSpendTime() {
		if(age<20) {
			System.out.println("Plays");
		}
		else if(age <40) {
			System.out.println("Travels");
		}
		else {
			System.out.println("Says at home");
		}
	}
	
	
	

}
