package practiceAll;

public class Vowel_Consonants_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input = "Automation" , output: vowels =5, consonants= 5
		String input = "A utomation java";
		countvowel(input.toLowerCase());
		// Vowel count 6, Consannt count 4

	}

	public static void countvowel(String input) {

		int vowelcount = 0;
		int consonentCount = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == ' ') {
				continue;
			}
			else if(c >= 'a' && c<= 'z'){ //Character.isLetter(c)
				if(c== 'a' || c== 'e' || c =='i' || c== 'o' || c== 'u')
				{
					vowelcount++;
				}
				else {consonentCount++;}
				
			}
		}

		System.out.println("Vowel count " + vowelcount + ", Consannt count " + consonentCount);
	}

}
