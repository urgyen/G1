package day.eight.one;

public abstract class Bike {

	//non abstract method
	public void run() {
		System.out.println("Runns");
	}
	
	//abstract method
	abstract void fly();
	
	abstract void doesntDrinkFuel();
	
	
}
