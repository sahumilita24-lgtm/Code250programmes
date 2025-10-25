package basic_if_else;

import java.util.Scanner;

public class BonusBasedSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*19)  Calculate Bonus Based on Salary and Years of Experience.

    :- take the salary and Year info from the User.

		Implement Bonus Calculation Logic:

		Define the bonus structure based on salary and years of experience. 

     :- If years of experience is less than 1 year: No bonus.

     :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.

     :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.

     :- If years of experience is greater than 6 years: Bonus is 15% of the salary. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Net Salary: ");
		double salary = sc.nextDouble();
		System.out.println("Enter the years of experience: ");
		double experience = sc.nextDouble();
		
		if (salary <= 0  )
		{
			System.out.println("your salary cant be 0 or Negative!! Enter correct information.");
		}
		else if (experience < 0)
		{
			System.out.println("your experience cant be 0 or Negative!! Enter correct information.");
		}
		else {bonusCalculator(salary, experience);}
		

	}

	private static void bonusCalculator(double salary, double experience) {
		// TODO Auto-generated method stub
		double bonus;
		
			if (experience < 1) {System.out.println("No Bonus. Your salary remains: ₹" + salary);
            return;}
			else if (experience <= 3 && experience>= 1) {bonus= (salary *0.05);}
			else if (experience <= 6 && experience>= 4) {bonus= (salary *0.1);}
			else  {System.out.println(bonus= salary *0.15);}
			System.out.println("Your salary with bonus is :  ₹" + (bonus + salary));
		
	}

}
