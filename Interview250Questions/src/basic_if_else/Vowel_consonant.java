package basic_if_else;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if a Character is a Vowel or Consonant.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Alphabet to know Character is a Vowel or Consonant: ");
		
		String alpha= scanner.next();
		if (alpha.equalsIgnoreCase("a") || alpha.equalsIgnoreCase("e") || alpha.equalsIgnoreCase("i") 
				|| alpha.equalsIgnoreCase("o") || alpha.equalsIgnoreCase("u"))
			System.out.println("you have entered Vowel");
		
		else System.out.println("Consonant has been entered");
		scanner.close();
		
		

	}

}
