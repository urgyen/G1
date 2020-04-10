package day6;

import java.util.Scanner;

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. Single inheritance
		
		
//		2. Multi Level; mmore than 2 levels
		
		
//		3. Hierarchial inheritance
	//	???
		//	Country--> north america --> USA ra CANADA
		
//		
//		4. Multiple inheritance**
		
//		Father f1= new Father();
//		f1.eats();
//		
//		System.out.println("-----");
//		
//		
//		Son s1= new Son();
//		
//		//s1.name="Ram";
//		//s1.setName("Ram");
//		
//		s1.age=40;
//		s1.eats();
		
	//	s1.howDoesHeSpendTime();
		
		
	GrandSon g1= new GrandSon();
//		
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the age of Grandson: ");
		g1.age=sc.nextInt();
		
//		g1.eats();
		g1.doesCry();
//		
		
//		Daughter d1 = new Daughter();
//		d1.age =25;
//		d1.howDoesSheSpendTime();
		
	}

}
