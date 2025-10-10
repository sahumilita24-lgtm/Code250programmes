package basic_if_else;

import java.util.Scanner;

public class PositiveorNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if a Number is Positive or Negative.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		while(scanner.hasNextInt())
		{
		 int usernum= scanner.nextInt();
		
		if(usernum >=0 )
		{
			System.out.println(usernum + " Positive number");
		}
		else 
			System.out.println("Negative number entered");		

		}
		
		scanner.close();
	}

}
