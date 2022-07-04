package assignment2;
import java.util.Scanner;
public class Operators_1 {
			/*
			 * Enter three numbers and do the following arithmetic Operations find max and min.
					i) a+b*c		 ii) c+a/b				iii) a%b+c 			iV) a*b+c
			 */

			public static void main(String[] args) {
				int sum1=0, sum2=0, sum3=0, sum4=0;
				/*
				 * Taking three numbers as user input 
				 */
				System.out.println("Enter first number ");
				System.out.println("Enter second number ");
				System.out.println("Enter third number ");
				
				Scanner one = new Scanner(System.in);
				Scanner two = new Scanner(System.in);
				Scanner three = new Scanner(System.in);
				
				int a =  one.nextInt();
				int b =  two.nextInt();
				int c =  three.nextInt();
				one.close(); two.close(); three.close(); // closing all three scanner objects
				
				sum1= a+b*c;
				sum2= c+a/b;
				sum3= a%b+c;
				sum4= a*b+c;
				
				System.out.println("Sum1= " +sum1);
				System.out.println("Sum2= " +sum2);
				System.out.println("Sum3= " +sum3);
				System.out.println("Sum4= " +sum4);
				
				if (sum1 > sum2 && sum1 > sum3 && sum1 > sum4) {
					System.out.println("Maximum = " +sum1);
					
				}
				else if (sum2 > sum1 && sum2 > sum3 && sum2 > sum4 ) {
					System.out.println("Maximum = " +sum4);
				}
				else if (sum3 > sum1 && sum3 > sum2 && sum3 > sum4 ) {
					System.out.println("Maximum = " +sum3);
				}
				else {
					System.out.println("Maximum = " +sum4);
				}
				if (sum1 < sum2 && sum1 < sum3 && sum1 < sum4) {
					System.out.println("Minimum = " +sum1);
				}
				else if (sum2 < sum1 && sum2 < sum3 && sum2 < sum4) {
					System.out.println("Minimum = " +sum2);
				}
				else if (sum3 < sum1 && sum3 < sum2 && sum3 < sum4) {
					System.out.println("Minimum = " +sum3);
				}
				else {
					System.out.println("Minimum = " +sum4);
				}
		
		// TODO Auto-generated method stub

	}

}
