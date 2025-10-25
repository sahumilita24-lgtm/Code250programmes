package basic_if_else;

import java.util.Scanner;

public class Employee_NetSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)
		 *  Reserch from your side for this program. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Pay");
		double pay= sc.nextDouble();
		
		double hRA= pay * 0.2;
		double dA = pay * 0.1;
		if (pay > 0 && pay < 50000)
		{
			System.out.println("No tax deducted, Your Net salary is: "+ (pay + hRA + dA));
		}
		else if (pay >50000 && pay < 90000 )
		{
			double tax= (pay + hRA + dA)*0.02 ;
			System.out.println("Your HRA: " + hRA);
			System.out.println("Your DA: "+ dA);
			System.out.println("tax cut: "+ tax);
			System.out.println("20% tax deducted, Your Net salary is: "+ ((pay + hRA + dA ) - tax));
		}
		else {
			double tax= (pay + hRA + dA)*0.05 ;
			System.out.println("Your HRA: " + hRA);
			System.out.println("Your DA: "+ dA);
			System.out.println("tax cut: "+ tax);
			System.out.println("50% tax deducted, Your Net salary is: "+ ((pay + hRA + dA ) - tax));
		}
		
		

	}

}
