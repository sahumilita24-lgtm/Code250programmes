package practiceAll;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to know Palindrome or not: ");
		String input= sc.nextLine();
		PalindromeCheck.staticPalindromCheck(input);
		PalindromeCheck.StringBufferPalindromeCheck(input);
		sc.close();
	}
	
	public static void staticPalindromCheck(String input)
	{
		//Madam --> Madam - Palindrome ant --> tna -> not palindrome
		String reverse= "";
		for(int i =input.length()-1; i>=0; i--)
		{
			reverse = input.charAt(i) + reverse; 
		}
		System.out.println(reverse);
		if (reverse.equalsIgnoreCase(input))
		{
			System.out.println("is Palindrome");
		}
		else System.out.println("not palindrome");
	}

	
	public static void StringBufferPalindromeCheck(String input)
	{
		StringBuilder sb = new StringBuilder(input);
		String reversed = sb.reverse().toString();
		if(input.equalsIgnoreCase(reversed))
		{
			System.out.println("is PAlindrome");
		}
		else System.out.println("not Palindrome");
		
	}
}
