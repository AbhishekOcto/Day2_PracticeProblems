package assignment2;
import java.util.Scanner;
public class IfElse_Digit2Word {
	
	public static void main(String[] args) {
		
				int num;
					Scanner sc = new Scanner(System.in);
				System.out.println("Enter a single digit number : ");
				 num = sc.nextInt();
				
				sc.close(); 
				
				if (num == 0) {
					System.out.println("zero");
				}
				else if (num == 1) {
					System.out.println("one");
				}
				else if (num == 2) {
					System.out.println("two");
				}
				else if (num == 3) {
					System.out.println("three");
					}
				else if (num == 4) {
					System.out.println("four");
				}
				else if (num == 5) {
					System.out.println("five");
				}
				else if (num == 6) {
					System.out.println("six");
				}
				else if (num == 7) {
					System.out.println("seven");
				}
				else if (num == 8) {
					System.out.println("eight");
				}
				else if (num == 9) {
					System.out.println("nine");
				}
				else {
					System.out.println("Inalid input");
				}
	
		// TODO Auto-generated method stub

	}

}
