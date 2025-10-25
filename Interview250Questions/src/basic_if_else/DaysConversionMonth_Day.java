package basic_if_else;

import java.util.Scanner;

public class DaysConversionMonth_Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*23) Convert Days into Years, Months, and Days.
	:- Take the Days Input from the User
	Define the conversion logic:
	:- Assume 1 year = 365 days.
	:- Assume 1 month = 30 days
	:- Convert the Days into Years, Month and days and Print it.
	if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Days to convert into Years, Months, and Days");
		if (sc.hasNextInt())
		{
			daysconversion(sc);
		}
		else System.out.println("Please enter days numerically!!");   

		sc.close();
		
	}

	private static void daysconversion(Scanner sc) {
		// TODO Auto-generated method stub
		int input = sc.nextInt();
		int year= input / 365;
		int remainingdays = input % 365;
		int month = remainingdays / 30;
		int days = remainingdays % 30;
		
		System.out.printf("Converted: Year %d, Month %d, Days %d", year,month,days);
		
	}
 
}
