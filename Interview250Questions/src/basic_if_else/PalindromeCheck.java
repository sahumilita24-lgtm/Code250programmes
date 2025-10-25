package basic_if_else;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if a Number is a Palindrome. Ex Madam
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Palindrome Check!! Enter your text: ");
		String userInput= sc.nextLine();
		isPalindrome(userInput);


	}
	public static void isPalindrome(String userInput)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = userInput.length()-1 ; i >= 0; i--)
		{
			sb = sb.append(userInput.charAt(i));
		}
		
		
		if (userInput.equalsIgnoreCase(sb.toString()))
		{
			System.out.println( userInput+ " is a Palindrome");
		}
		else System.out.println(userInput + " is Not a palindrome!!!");
	}

}
