package day4;

import java.util.Scanner;

public class AArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//array initialization
//		int a[]= new int[5];
//		
//		//	System.out.println(a);
//		
//		//Array starts with 0;
//		//ARRay index ma basis
//		//	//loop
		
//		
////		//input
////		for(int i=0 ; i<a.length; i++) {
////			System.out.println("Enter the number for Array");
////			a[i]=sc.nextInt();
////		}
////		
////		System.out.println("Output");
//////		//output
//////		for(int i=0 ; i<a.length; i++) {
//////			System.out.println(a[i]);
//////			
//////		}
////		
////		//for each loop?
////		for(int data : a ) {
////			System.out.println(data);
////		}
////		
//		
//		System.out.println(a.length);
//		//System.out.println(a.);
//		//array> is static or dynamic?
//		//arrayList,
//		
//		//HashSet
//		//HashMap
//		
//		
//		
		Scanner sc= new Scanner(System.in);
		int a1= sc.nextInt();
		int a2= sc.nextInt();
		int a3= sc.nextInt();
		int a4= sc.nextInt();
		int a5= sc.nextInt();
		
		
		int addedDataFromMehod= sum(a1,a2,a3,a4,a5);
		System.out.println(addedDataFromMehod);
		
		int multipiedDataFromMethod= multiply(a1,a2, a3, a4, a5);
		System.out.println(multipiedDataFromMethod);
		
	}
	
	
	//Function
	static int sum(int a, int b, int c, int d, int e) {
		
		int sum=a+b+c+d+e;
		//System.out.println("Addition Total: " + sum);
		return sum;
		
	}
	
	static int multiply(int a, int b, int c, int d, int e) {
		
		int multiplied=a*b*c*d*e;
		//System.out.println("Addition Total: " + sum);
		return multiplied;
		
	}

}
