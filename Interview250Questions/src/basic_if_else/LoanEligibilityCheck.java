package basic_if_else;

import java.util.Scanner;

public class LoanEligibilityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
		int age = 0; float salary= 0; 	int credit_Score= 0;
		Scanner sc = new Scanner(System.in);
		ageValidation(sc, age);
		salaryValidation( sc,  salary);
		creditscoreValidation(sc, credit_Score);
		overall(age, salary, credit_Score);

	}
	private static void overall(int age, float salary, int credit_Score) {
		// TODO Auto-generated method stub
		if (age != 0 && salary!= 0 && credit_Score!=0 )
		{
		System.out.printf("your eligible for a Loan with age %d, salary %f, credit score %d", age,salary,credit_Score);}
		else{System.out.print("you are not eligible for loan");}
		
	}
	private static void creditscoreValidation(Scanner sc, int credit_Score) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Credit Score: ");
		while(sc.hasNextInt())
		{
			int userscore = sc.nextInt();
			if(userscore< 0 ) System.out.println("Credit Score cant be Negative"); //CCheck if the credit score is a positive integer.
			
			else if (userscore < 650) System.out.println("Credit Score cant be less then 650"); //Define a minimum credit score threshold (e.g., 650).
			
			else if (userscore > 850) System.out.println("Credit Score cant be greater than 850"); //Max credit score threshold (e.g., 850).
			else {userscore =  credit_Score; }
			break;
		}
		
	}
	public static void ageValidation(Scanner sc, int age)
	{
		System.out.println("Enter your Age: ");
		while(sc.hasNextInt())
		{
			int userage = sc.nextInt();
			if(userage< 0 ) System.out.println("Age cant be Negative"); //Check if the age is a positive integer.
			
			else if (userage > 80) System.out.println("Age cant be greater then 80"); //Max age can be 80.
			
			else if (userage < 18) System.out.println("You should be atleat 18 years old"); //Ensure the age is at least 18 years old.
			else {age = userage ; }
			break;
		}
		

}
	
	public static void salaryValidation(Scanner sc, float salary)
	{
		System.out.println("Enter your current Salary: ");
		while(sc.hasNextFloat())
		{
			float usersalary= sc.nextFloat();
			if (usersalary < 0) System.out.println("Salary cant be negative");//Check if the salary is a positive number.
			else if (usersalary < 30000) System.out.println("Minimum salary should be 30,000");//Define a minimum salary threshold (e.g., 30,000).
			else{salary = usersalary;}
			break;
		}
	}
}