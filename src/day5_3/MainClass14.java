package day5_3;

public class MainClass14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Inheritance;
		//extends
		
		Nepal c1= new Nepal();
		c1.name="Nepal";
		c1.takeTaxes();
		c1.runThegovernment();
		
		//dot operator;
		Country c11= new Country();
		c11.name="India";
		c11.takeTaxes();	
		c11.runThegovernment();
		
		Country c12= new Country();
		c12.name="USA";
		c12.takeTaxes();		
		c12.runThegovernment();
		
		Country c13= new Country();
		c13.name="China";
		c13.takeTaxes();		
		
		Country c14= new Country();
		c14.name="Mali";
		c14.takeTaxes();		
		
		Country c15= new Country();
		c15.name="Canada";
		c15.takeTaxes();
	}

}
