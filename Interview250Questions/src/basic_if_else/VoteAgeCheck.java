package basic_if_else;

import java.util.Scanner;

public class VoteAgeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if a Person is Eligible to Vote (Age Check).
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = scanner.nextInt();
		
		if (age > 99) System.out.println("dont try for fruad voting");
		else if (age >= 18) System.out.println("Eligible for vote"); 
		else System.out.println("not eligible for vote");

	}

}
