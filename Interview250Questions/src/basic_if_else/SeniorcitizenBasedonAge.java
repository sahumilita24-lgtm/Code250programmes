package basic_if_else;

import java.util.Scanner;

public class SeniorcitizenBasedonAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*25)  Find if a Person is Senior Citizen Based on Age.
       :- take the age input from the user.
        Implement Age Category Logic:
		Define the criteria for different age categories:
		Child: Age 0 to 12
		Teenager: Age 13 to 19
		Adult: Age 20 to 64
		Senior Citizen: Age 65 and older*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age to know age category");
		if (sc.hasNextInt())
		{
			String categoryoutput= agecategory(sc);
			if (categoryoutput.contains("invalid")) {System.out.println("Age cant be 0 or negative");}
			else {
				System.out.println("your age falls into the "+categoryoutput+  " category");}
		}
		else System.out.println("Please enter the age numerically!!");
		
		sc.close();

	}

	private static String agecategory(Scanner sc) {
		// TODO Auto-generated method stub
		int age = sc.nextInt();
		if (age <= 12 && age > 0) {return "Child";}
		else if (age >=13 && age <=19) {return "Teenager";}
		else if(age >=20 && age <=64) {return "Adult";}
		else if (age>= 65) {return "Senior Citizen";}
		else {return "invalid";}
		
		
	}

}
