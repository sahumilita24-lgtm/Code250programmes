package basic_if_else;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//- Calculation: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
		//sum of its own digits each raised to the power of the number of digits in the number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Armstrong or not");
		int input= sc.nextInt();
		isArmstrong(input);


	}
	
	public static void isArmstrong(int input)
	{
		int  sum = 0;
		String s = Integer.toString(input);
		for(int i = 0 ; i< s.length() ; i ++)
		{
			
		    int valueat = s.charAt(i)- '0';  // changes char to int
			sum += Math.pow(valueat, s.length());
			//Compound assignment (+=,-= , etc.) includes implicit casting, while simple assignment (=) requires explicit casting if types differ
		}
		
		if (sum == input)
		{
			System.out.println("Is Armstrong");
		}
		else System.out.println("Not Armstrong");
		
	}



}
