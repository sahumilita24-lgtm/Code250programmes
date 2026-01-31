package practiceAll;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input1 : silent input2 = listen output : Anagram
		// input 1 : Hello input2= world output : not Anagram

		String input1 = "silent";
		String input2 = "liSten";
		anagramcheck(input1, input2);
		Anagram.anagramcheck2ndWay(input1, input2);
	}

	public static void anagramcheck(String input1, String input2) {
		if (input1.length() != input2.length()) {
			System.out.println("not anagram");
			return;
		}

		String data1 = input1.toLowerCase();
		String data2 = input2.toLowerCase();
		for (int i = 0; i < input1.length(); i++) {
			int data1_count = 0;
			int data2_count = 0;
			for (int j = 0; j < input1.length(); j++) {
				if (data1.charAt(i) == data1.charAt(j)) {
					data1_count++;
				}
			}
			for (int j = 0; j < input2.length(); j++) {
				if (data1.charAt(i) == data2.charAt(j)) {
					data2_count++;
				}
			}
			if (data1_count!= data2_count)
			{
				System.out.println("not Anagram");
				return;
			}
			 
		}
		System.out.println("Anagram");
		
		
	}
	
	public static void anagramcheck2ndWay(String input1, String input2)
	{
		if (input1.length() != input2.length()) {
			System.out.println("not anagram");
			return;
		}
		
		String data1=  input1.toLowerCase(); String data2 = input2.toLowerCase();
		boolean isanagram= true;
		for(char ch: data1.toCharArray())
		{
			int data1count =0; int data2count = 0;
			for(int j =0; j< data1.length();j ++)
			{
				if (ch ==  data1.charAt(j)) {data1count++;}
			}
			for(int j =0; j< data1.length();j ++)
			{
				if (ch ==  data2.charAt(j)) {data1count++;}
			}
			
			if (data1count != data2count)
			{
				isanagram = false;
			}
		}
		
		if (isanagram = true) {
			System.out.println("Anagram");
		}
		else System.out.println("not Anagram");
		
	}

}
