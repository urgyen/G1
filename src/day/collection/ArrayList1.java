package day.collection;


import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
	
		ArrayList<String> arraylist= new ArrayList<>();

		//Documentation of ArrayList
		arraylist.add("Bikram");
		arraylist.add("Prayash");
		arraylist.add("Prajwal");
		arraylist.add("Rajesh");
		arraylist.add("Prajwal");
		
		//Full collection of data
	//	System.out.println(arraylist);
		
		//System.out.println(arraylist.get(3));
		//for loop?
		
//		System.out.println(arraylist.size());
//		
//		for(int i=0 ; i<arraylist.size(); i++) {
//			
//			System.out.println(arraylist.get(i));
//			
//		}
		
		//for each
		for(String datainAL : arraylist ) {
			System.out.println(datainAL);
		}
		
		System.out.println("--------");
		System.out.println(arraylist.get(3));
	//	System.out.println(array[i]);
		arraylist.remove(2);
		System.out.println(arraylist);
		
		//
		//Reason: index:
		//Arraylist not for manipulation
		//time consuming
		
	}

}
