package basic_if_else;

import java.util.Scanner;

public class Divisabbleby5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//22)  Check if a Number is Divisible by 5 and 11
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number to know  if a Number is Divisible by 5 and 11");
		isdivisable(sc);
		sc.close();

	}

	private static void isdivisable(Scanner sc) {
		// TODO Auto-generated method stub
		if (sc.hasNextDouble())
		{
			double userinput = sc.nextDouble();
			if (userinput % 5 == 0 && userinput % 11 == 0)
			{
				System.out.println(userinput + " Is divisible by 5 and 11 both");
			}
			else System.out.println(userinput + " Is not divisible by 5 and 11 both");
		}
		else System.out.println("Enter number properly!!");
	}

}
