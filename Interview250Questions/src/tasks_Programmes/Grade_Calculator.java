package tasks_Programmes;

import java.util.Scanner;

public class Grade_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F)
		  based on the following grading scale:

	      A: 90-100 	B: 80-89 C: 70-79  D: 60-69 F: 0-59 */
		
		Scanner sc = new Scanner(System.in);
		
		double requiredmark =getDataFromUser(sc);
		grade(requiredmark);
		
		

	}
	
	public static double getDataFromUser(Scanner sc)
	{ 
		
	    System.out.println("enter number");
		if (sc.hasNextDouble())
		{			
			double mark =  sc.nextDouble();
			return mark; 
		}
		else 
			{
			System.out.println("enter your mark in number");
			System.exit(0);
			return 0;			
			}
		
	
	} 
	
	
	public static void grade(double requiredmark)
	{
		if (requiredmark >= 90 && requiredmark <=100)
		{
			System.out.println("A");
		}
		else if (requiredmark >= 80 && requiredmark <=89)
		{
			System.out.println("B");
		}
		else if (requiredmark >= 70 && requiredmark <=79)
		{
			System.out.println("C");
		}
		else if (requiredmark >= 60 && requiredmark <=69)
		{
			System.out.println("D");
		}
		else if (requiredmark >= 0 && requiredmark <=59)
		{
			System.out.println("F");
		}
		
		
		
	}
	

}
