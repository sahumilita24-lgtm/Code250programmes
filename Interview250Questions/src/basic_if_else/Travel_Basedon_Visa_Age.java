package basic_if_else;

import java.util.Scanner;

public class Travel_Basedon_Visa_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Find if a Person Can Travel Based on Visa Status and Age.
		 take the input from the user for 
		 Age (integer).
		 Visa Status (String or boolean).
		 Check Eligibility:
		:- If age is 18 or older and visa status is valid, the person can travel.

		Otherwise, the person cannot travel.
		Validation Criteria
		Age: - Must be a non-negative integer.
		:- Should be greater than or equal to 18 to be eligible to travel.
		Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
		:- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Visa Status as Valid Or Invalid");
		String visastatus = sc.nextLine().trim();
		if (visastatus.equalsIgnoreCase("valid"))
		{
			travelcheck(sc);
		}
		else if(visastatus.equalsIgnoreCase("invalid"))
		{
			System.out.println("Not eligible for travel due to Invalid Visa!!");
	
			
		}
		else {System.out.println("Please mention Valid or Invalid only!!");}
		sc.close();
		

	}

	private static void travelcheck(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Age");
		int age= sc.nextInt();
		if (age < 18)
		{
			System.out.println("Not eligible for travel due to Age is less than 18");
		}
	
		else {
			System.out.println("Eligible for travel as Age and Visa are proper!!");			
			
		}

		
		
		
}
		
		
		

}
