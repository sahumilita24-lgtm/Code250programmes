package basic_if_else;

import java.util.Scanner;

public class Electricity_unitConsumed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the unit consumed by you: ");
		while(sc.hasNext())
		{ 	
			double unit = sc.nextDouble();
			if (unit > 0)
			{
			double charge = 0;
			if (unit <= 100) 
			{
				charge = unit * 0.50; 
				System.out.println(charge);
			}
			else if (unit > 100 && unit <= 200)
			{
				charge = (100 * 0.50)+ ((unit-100)*0.75);
				System.out.println(charge);
			}
			else if (unit > 200 && unit <= 300)
			{
				charge = (100 * 0.50)+ ((100 *0.75)) + ((unit -200)*1.20);
				System.out.println(charge);
			}
			else {
				charge= (100 * 0.50)+ (100 *0.75) + (100 * 1.20) + ((unit -300)*1.50);
				System.out.println(charge);
			}
			break;
			} else {System.out.println("Please enter correct unit consumed!!");}
			
			
		}

	}

}
