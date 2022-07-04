package assignment2;
import java.util.Scanner;
public class Quadratic_3 {
			/**
			 * 
			 * Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
			 */

			public static void main(String[] args) {
				/*
				 * taking user input using scanner class
				 */
				System.out.println("Enter first number");
				
				System.out.println("Enter second number");
				
				System.out.println("Enter third number");
				
				Scanner sc1 = new Scanner(System.in);
				int a = sc1.nextInt();
				
				Scanner sc2 = new Scanner(System.in);
				int b = sc2.nextInt();
				
				Scanner sc3 = new Scanner(System.in);
				int c = sc3.nextInt();
				
				sc1.close(); sc2.close(); sc3.close(); // closing all three scanner objects
				
				int delta =  (b*b)-4*(a*c);
				int root1 = (-b + Math.abs(delta))/(2*a);
				int root2 = (-b - Math.abs(delta))/(2*a);
				System.out.println("Root 1 of X " + root1);
				System.out.println("Root 2 of X " + root2);
		
		
		// TODO Auto-generated method stub

	}

}
