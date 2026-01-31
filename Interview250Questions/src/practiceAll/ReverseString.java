package practiceAll;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to Reverse: ");
		String input= sc.nextLine();
		ReverseString.stringReverseForLoop(input);
		ReverseString.StringRevers_Buffer(input);

	}
	
	public static void stringReverseForLoop(String uinput)
	{
		String reverse="";
		//Hello--> olleH

		for(char c :uinput.toCharArray() )
		{
			 reverse = c + reverse;
		}
		
		System.out.println(reverse);
		
	}
	
	public static void StringRevers_Buffer(String uinput)
	{
		StringBuffer sb = new StringBuffer();
		for(int i = uinput.length()-1; i>=0; i--)
		{
			sb.append(uinput.charAt(i));
		}
		System.out.println(sb.toString());
	}

}
