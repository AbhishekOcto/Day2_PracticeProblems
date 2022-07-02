package assignment2;
import java.util.*;
public class While_reverseNumber {

	public static void main(String[] args) {
		  
		System.out.print("Enter the number: ");  
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();  
		int reverse_number = reverseNumber(n);   
		System.out.println("The reverse of the given number is: "+reverse_number);   
		}  
		//method to reverse a number  
		public static int reverseNumber(int number)   
		{  
		boolean isNoNegative = number < 0 ? true : false;   
		if(isNoNegative)  
		{  
		number = number * -1; //makes the number positive if the given number is negative  
		}   
		int reverse = 0;   
		int lastDigit = 0;   
		while (number >= 1)   
		{  
		lastDigit = number % 10; // gives the last digit of the number  
		reverse = reverse * 10 + lastDigit;   
		number = number / 10; // removes the last digit of the number  
		}   
		//makes the number negative   
		return isNoNegative == true? reverse*-1 : reverse;   
		// TODO Auto-generated method stub

	}

}
