// Java Program to find Sum of N Natural Numbers
package assignment2;
import java.util.Scanner;


public class For_SumofNaturalNumb {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			
				int number, i, sum = 0;
				System.out.print(" Please Enter any Number : ");
				number = sc.nextInt();	
				
				for(i = 1; i <= number; i++)
				{
					sum = sum + i; 
				}	
				
				System.out.println("\n The Sum of Natural Numbers from 1 to "+ number + " = " + sum);
		
		// TODO Auto-generated method stub

	}

}
