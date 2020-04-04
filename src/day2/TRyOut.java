package day2;

import java.util.Scanner;

public class TRyOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		double sum = 0;
		double average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer");

		// using while loop
		int i = 10;
		while (i >= 1) {
			i--;

			num = sc.nextInt();
			sum =sum + num;
			System.out.println("Input another integer");

		}
		
		System.out.println("The total sum is: " + sum);
		
		average = sum/10;
		System.out.println("The average is: " + average);

	}
}
