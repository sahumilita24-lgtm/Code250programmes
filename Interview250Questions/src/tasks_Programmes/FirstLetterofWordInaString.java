package tasks_Programmes;

import java.util.Scanner;

public class FirstLetterofWordInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First Letter of Each Word in a String.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to get First Letter of Each Word in a String: ");
		String uservalue= sc.nextLine();
		letterofWord(uservalue);
		

	}
	
	public static void letterofWord(String uservalue)
	{
		String[] splittedwords = uservalue.split(" ");
		
		for (String s:splittedwords)
		{
			if (!s.trim().isEmpty())
			{
			char firstword= s.charAt(0);
			System.out.println(firstword);
			}
		}
		
	}

}
