package tasks_Programmes;

import java.util.Scanner;

public class NumberOfWordsIn_AString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count the Number of Words in a String.
		//Ex: "I love java" count = 3 i.e i, love, java
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to get the word count:");
		String usergivenString = sc.nextLine();
		countNumOfWord(usergivenString);
		sc.close();

	}
	
	public static void countNumOfWord(String usergivenString)
	{
		if (!usergivenString.isEmpty())
		{
			int count =0;
			String[] splittedStrings=	usergivenString.split(" ");
			for(String w: splittedStrings)
			{
				if (!w.isBlank())
				{
					count++;
				}
			}
			System.out.println("Number of words in given String is: " + count);
		}
		else System.out.println("Please enter valid text");
	}
	

}
