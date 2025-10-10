package basic_if_else;

import java.util.Scanner;

public class Maxof_TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find the Maximum of Two Numbers.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = scanner.nextInt();
		
		if (number1 > number2) System.out.println("number 1 is max i.e " + number1);
		else System.out.println("number 2 is max i.e " + number2);

	}

}
